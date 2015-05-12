/**
 * 
 */
package br.hering.storefront.interceptors.beforeview;

import de.hybris.platform.acceleratorservices.enums.UiExperienceLevel;
import de.hybris.platform.acceleratorservices.storefront.data.MetaElementData;
import de.hybris.platform.acceleratorservices.uiexperience.UiExperienceService;
import br.hering.storefront.interceptors.BeforeViewHandler;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;


/**
 * Adds meta tags to help guide the device for the current UI Experience.
 */
public class UiExperienceMetadataViewHandler implements BeforeViewHandler
{
	@Resource(name = "uiExperienceService")
	private UiExperienceService uiExperienceService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.hering.storefront.interceptors.BeforeViewHandler#beforeView(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse, org.springframework.web.servlet.ModelAndView)
	 */
	@Override
	public void beforeView(final HttpServletRequest request, final HttpServletResponse response, final ModelAndView modelAndView)
			throws Exception
	{

		if (modelAndView != null && modelAndView.getModel().containsKey("metatags"))
		{

			final List<MetaElementData> metaelements = ((List<MetaElementData>) modelAndView.getModel().get("metatags"));
			final UiExperienceLevel currentUiExperienceLevel = uiExperienceService.getUiExperienceLevel();
			if (UiExperienceLevel.DESKTOP.equals(currentUiExperienceLevel))
			{

				// Provide some hints to mobile browser even though this is not the mobile site -->
				metaelements.add(createMetaElement("HandheldFriendly", "True"));
				//metaelements.add(createMetaElement("MobileOptimized", "970"));
				metaelements.add(createMetaElement("viewport", "width=device-width, maximum-scale=1.0"));
			}
			else if (UiExperienceLevel.MOBILE.equals(currentUiExperienceLevel))
			{
				// Provide some hints to mobile browser even though this is not the mobile site -->
				metaelements.add(createMetaElement("HandheldFriendly", "True"));
				metaelements.add(createMetaElement("MobileOptimized", "320"));
				metaelements
						.add(createMetaElement("viewport",
								"width=device-width, target-densitydpi=160, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no"));
				metaelements.add(createMetaElement("format-detection", "telephone=no"));
			}
		}

	}

	protected MetaElementData createMetaElement(final String name, final String content)
	{
		final MetaElementData element = new MetaElementData();
		element.setName(name);
		element.setContent(content);
		return element;
	}
}
