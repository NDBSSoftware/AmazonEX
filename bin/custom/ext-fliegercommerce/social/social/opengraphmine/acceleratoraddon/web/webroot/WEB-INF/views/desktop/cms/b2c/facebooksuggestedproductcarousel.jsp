<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format" %>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/desktop/product" %>
<%@ taglib prefix="cmsext" tagdir="/WEB-INF/tags/addons/opengraphmine/desktop/cms" %>
<%@ taglib prefix="component" tagdir="/WEB-INF/tags/shared/component" %>

<c:choose>

<c:when test="${not empty facebookSuggestedProducts}">

<div class="scroller">
	<div class="title">${title}</div>

	<ul class="carousel jcarousel-skin popup">
		<c:forEach items="${facebookSuggestedProducts}" var="suggestion">
			<c:set value="${suggestion.product}" var="product" /> 
			<c:url value="${product.url}" var="productUrl"/>
			<li class="facebookSuggestedProducts">
				<a href="${productUrl}" class="scrollerProduct">
				
					<div class="thumb">
						<cmsext:socialAvatar suggestion="${suggestion}"/>
						
						<product:productPrimaryImage product="${product}" format="product"/>
					</div>
					
					<div class="priceContainer">
						<format:fromPrice priceData="${product.price}"/>
					</div>
					<div class="details">
						${product.name}
					</div>
				</a>
			</li>
		</c:forEach>
	</ul>
</div>

</c:when>
								
<c:otherwise>
	<component:emptyComponent/>
</c:otherwise>
</c:choose>