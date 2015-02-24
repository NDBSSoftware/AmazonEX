<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ attribute name="product" required="true"
    type="de.hybris.platform.commercefacades.product.data.ProductData"%>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/desktop/product"%>

<product:productDetailsTitleRatings product="${product}" showShortDescription="true" showBrandLogo="true"/>
<product:productPricePanel product="${product}"/>
<product:productDetailsShipping product="${product}"/>
<product:productVariantSelector productVariants="${product.variantOptions}"/>


<!--         <div class="span-10 productDescription last"> -->
<%--             <ycommerce:testId code="productDetails_productNamePrice_label_${product.code}"> --%>
<%--                 <product:productPricePanel product="${product}" /> --%>
<%--             </ycommerce:testId> --%>
<%--             <ycommerce:testId code="productDetails_productNamePrice_label_${product.code}"> --%>
<%--                 <h1>${product.name}</h1> --%>
<%--             </ycommerce:testId> --%>
<%--             <product:productReviewSummary product="${product}" /> --%>
<%--             <div class="summary">${product.summary}</div> --%>
<%--             <product:productPromotionSection product="${product}" /> --%>
<%--             <cms:pageSlot position="VariantSelector" var="component" element="div"> --%>
<%--                 <cms:component component="${component}" /> --%>
<%--             </cms:pageSlot> --%>
<%--             <cms:pageSlot position="AddToCart" var="component" element="div" --%>
<%--                 class="span-10 last add-to-cart"> --%>
<%--                 <cms:component component="${component}" /> --%>
<%--             </cms:pageSlot> --%>
<!--         </div> -->
<%--         <cms:pageSlot position="Section2" var="feature" element="div" --%>
<%--             class="span-8 section2 cms_disp-img_slot last"> --%>
<%--             <cms:component component="${feature}" /> --%>
<%--         </cms:pageSlot> --%>
<!--     </div> -->
<!-- </div> -->
