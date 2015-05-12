/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 * 
 * 
 */
package com.hybris.addon.common.config.cms;

import org.springframework.beans.factory.annotation.Required;

import de.hybris.platform.acceleratorcms.component.renderer.CMSComponentRenderer;
import de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel;

public class AddOnCMSComponentRendererMapping {
	private String typeCode;
	private CMSComponentRenderer<AbstractCMSComponentModel> renderer;
	/**
	 * @return the typeCode
	 */
	public String getTypeCode() {
		return typeCode;
	}
	/**
	 * @param typeCode the typeCode to set
	 */
	@Required
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	/**
	 * @return the renderer
	 */
	public CMSComponentRenderer<AbstractCMSComponentModel> getRenderer() {
		return renderer;
	}
	/**
	 * @param renderer the renderer to set
	 */
	@Required
	public void setRenderer(CMSComponentRenderer<AbstractCMSComponentModel> renderer) {
		this.renderer = renderer;
	}
}
