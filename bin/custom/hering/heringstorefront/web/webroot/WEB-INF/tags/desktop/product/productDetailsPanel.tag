<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ attribute name="product" required="true" type="de.hybris.platform.commercefacades.product.data.ProductData" %>
<%@ attribute name="galleryImages" required="true" type="java.util.List" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme" %>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format" %>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/desktop/product" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/desktop/template" %>
<%@ taglib prefix="bazaarvoice" tagdir="/WEB-INF/tags/addons/bazaarvoice/desktop/bazaarvoice"%>

<spring:theme code="text.addToCart" var="addToCartText"/>
<bazaarvoice:cloudSeoInclude product="${product}"/>

<div class="margin-top">
	<div class="col-xs-12 col-sm-6 v-bottom">
		<div id="mainCarousel" class="carousel slide" data-ride="carousel" data-interval="false">
			<product:productBackgroundImage product="${product}" galleryImages="${galleryImages}"/>  
		</div> 
	</div><!--
	--><div class="col-sm-6 v-bottom margin-top">
		<div class="col-sm-12 text-right hidden-xs"><a href="#">[brand img]</a></div>
		<ycommerce:testId code="productDetails_productNamePrice_label_${product.code}">
			<product:productTitle product="${product}" upper="true"/>
		</ycommerce:testId>
		<c:if test="${product.purchasable && product.stock.stockLevelStatus.code != 'outOfStock'}">				
			<bazaarvoice:productReviewSummary product="${product}" />
			<c:if test="${not empty product.summary}">
				<div class="summary">${product.summary}</div>
			</c:if>			
			<product:productPromotionSection product="${product}"/>					
		</c:if>					
		<p>${product.shortDescription}&nbsp;<a href="#tab150219"><spring:theme code="product.shortDescriptionReadMore"/></a></p>
		<div class="row">
			<div class="col-xs-4 v-bottom">
				<ycommerce:testId code="productDetails_productNamePrice_label_${product.code}">
					<product:productPricePanel product="${product}"/>
				</ycommerce:testId>
			</div>
			<div class="col-xs-7 v-bottom">
				<%-- [shipping information] --%>
				<product:productShippingInformation product="${product}"/>
			</div>
		</div>
		<div class="row shadowbox">
			<cms:pageSlot position="VariantSelector" var="component" element="div">
				<cms:component component="${component}"/>
			</cms:pageSlot>	
			<cms:pageSlot position="AddToCart" var="component" element="div">
				<cms:component component="${component}"/>
			</cms:pageSlot>
		</div>					
		<%--<product:productDetailsFooter product="${product}" />--%>
	</div>
	<div class="clearfix"></div>
</div>
<div class="margin-top margin-bottom">
	<%-- [thumbs here] --%>
	<product:productImagePanel product="${product}" galleryImages="${galleryImages}"/>	
	<div class="col-sm-6 visible-xs visible-sm"></div>
	<div class="col-sm-6">
		<div class="row">
			<p class="col-xs-4">
				<cms:pageSlot position="Section2" var="component">
            		<cms:component component="${component}" />
        		</cms:pageSlot>
			</p>
			<p class="col-xs-8">
				<product:productInstallmentWithKlarna product="${product}"/>
			</p>
		</div>
	</div>
</div>	