<%@ attribute name="regions" required="true" type="java.util.List"%>
<%@ attribute name="country" required="false" type="java.lang.String"%>
<%@ attribute name="tabIndex" required="false" type="java.lang.Integer"%>
<%@ attribute name="page" required="false" type="java.lang.String"%>
<%@ attribute name="cancelUrl" required="false" type="java.lang.String"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="formElement" tagdir="/WEB-INF/tags/desktop/formElement" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>


<c:if test="${enableEditAddressAnchor}">
	<div id="editAnchor"></div>
</c:if>

<c:if test="${themeName == 'black'}">

<form:hidden path="countryIso" />
<formElement:formInputBox idKey="address.firstName" labelKey="address.firstName" path="firstName" inputCSS="text" mandatory="true"/>
<formElement:formInputBox idKey="address.surname" labelKey="address.surname" path="lastName" inputCSS="text" mandatory="true"/>
<formElement:formInputBox idKey="address.phone2" labelKey="address.phone2" path="celPhone" inputCSS="text" mandatory="false" autocomplete="off"/>
<formElement:formInputBox idKey="address.phone1" labelKey="address.phone1" path="phone" inputCSS="text" mandatory="true" autocomplete="off"/>
<formElement:formInputBox idKey="address.receiver" labelKey="address.receiver" path="receiver" inputCSS="text" mandatory="false"/>
<formElement:formInputBox idKey="address.postcode" labelKey="address.postcode" path="postcode" inputCSS="text cep" mandatory="true" autocomplete="off" size="8"/>
<div id="loadingAddress" style="float:right;display:none">
	<img src="/store/_ui/desktop/common/images/colorbox/loading.gif"/>
</div>
<div class="consultar-cep-link">
	<a target="_blank" href="http://www.buscacep.correios.com.br/servicos/dnec/menuAction.do?Metodo=menuEndereco">
		<spring:theme code="address.search.cep" text="Consultar CEP"/>
	</a>
</div>
<formElement:formInputBox idKey="address.line1" labelKey="address.line1" path="line1" inputCSS="text" mandatory="true"/>
<formElement:formInputBox idKey="address.number" labelKey="address.number" path="number" inputCSS="text" mandatory="true"/>
<formElement:formInputBox idKey="address.complement" labelKey="address.complement" path="complement" inputCSS="text" mandatory="false"/>
<formElement:formInputBox idKey="address.district" labelKey="address.district" path="neighborhood" inputCSS="text" mandatory="true"/>
<formElement:formInputBox idKey="address.townCity" labelKey="address.townCity" path="townCity" inputCSS="text" mandatory="true"/>
<formElement:formSelectBox idKey="address.state" labelKey="address.state" items="${regions}" path="regionIso" itemValue="${useShortRegionIso ? 'isocodeShort' : 'isocode'}" mandatory="true" />
<formElement:formSelectBox idKey="address.addressType" labelKey="address.addressType" path="addressType" mandatory="true" skipBlank="true" items="${addressTypes}" selectedValue="${heringAddressForm.addressType}"/>
<formElement:formInputBox idKey="address.reference" labelKey="address.reference" path="reference" inputCSS="text" mandatory="false"/>
<c:if test="${page == 'ACCOUNT' }">
	<formElement:formCheckbox idKey="address.defaultAddress" labelKey="address.default" path="defaultAddress" mandatory="false"/>
	<formElement:formCheckbox idKey="address.billing" labelKey="address.billing" path="billing" mandatory="false"/>
</c:if>
</c:if>

<c:if test="${themeName == 'hering' || themeName == 'dzarm' || themeName == 'foryou'}">
	<form:hidden path="countryIso" />
	<div class="form-row">
		<formElement:formInputBox idKey="address.receiver" labelKey="address.receiver" path="receiver" inputCSS="text" mandatory="false"/>
	</div>
	<div class="form-row">		
		<formElement:formInputBox idKey="address.phone1" labelKey="address.phone1" path="phone" inputCSS="text" mandatory="true" autocomplete="off"/>
		<div class="rightForm">
			<formElement:formInputBox idKey="address.phone2" labelKey="address.phone2" path="celPhone" inputCSS="text" mandatory="false" autocomplete="off"/>
		</div>
	</div>
	<div class="form-row">
		<formElement:formInputBox idKey="address.postcode" labelKey="address.postcode" path="postcode" inputCSS="text cep" mandatory="true" autocomplete="off" size="8"/>
		<a href="javascript:void(0);" class="btn btn-ok">ok</a>
		<a target="_blank" class="nao-sei" href="http://www.buscacep.correios.com.br/servicos/dnec/menuAction.do?Metodo=menuEndereco"><spring:theme code="address.search.dont.know" text="N�o sei meu CEP" /></a>	
	</div>
	<div class="form-row" style="display:none">
		<formElement:formInputBox idKey="address.firstName" labelKey="address.firstName" path="firstName" inputCSS="text" mandatory="true"/>
		<formElement:formInputBox idKey="address.surname" labelKey="address.surname" path="lastName" inputCSS="text" mandatory="true"/>
	</div>
	<div class="form-row">
		<formElement:formInputBox idKey="address.line1" labelKey="address.line1" path="line1" inputCSS="text" mandatory="true"/>
		<formElement:formInputBox idKey="address.number" labelKey="address.number" path="number" inputCSS="text" mandatory="true"/>
	</div>
	<div class="form-row">
		<formElement:formInputBox idKey="address.district" labelKey="address.district" path="neighborhood" inputCSS="text" mandatory="true"/>
		<div class="rightForm">
			<formElement:formInputBox idKey="address.complement" labelKey="address.complement" path="complement" inputCSS="text" mandatory="false"/>
		</div>
	</div>
	<div class="form-row">
		<formElement:formInputBox idKey="address.townCity" labelKey="address.townCity" path="townCity" inputCSS="text" mandatory="true"/>
		<div class="rightForm">
			<formElement:formInputBox idKey="address.reference" labelKey="address.reference" path="reference" inputCSS="text" mandatory="false"/>
		</div>
	</div>
	<div class="form-row">
		<formElement:formSelectBox idKey="address.addressType" labelKey="address.addressType" path="addressType" mandatory="true" skipBlank="true" items="${addressTypes}" selectedValue="${heringAddressForm.addressType}"/>
		<div class="rightForm">
		<formElement:formSelectBox idKey="address.state" labelKey="address.state" items="${regions}" path="regionIso" itemValue="${useShortRegionIso ? 'isocodeShort' : 'isocode'}" mandatory="true" />
		</div>
	</div>
	<div class="form-row">
		<c:if test="${page == 'ACCOUNT' }">
			<formElement:formCheckbox idKey="address.defaultAddress" labelKey="address.default" path="defaultAddress" mandatory="false"/>
			<formElement:formCheckbox idKey="address.billing" labelKey="address.billing" path="billing" mandatory="false"/>
		</c:if>
	</div>
	<p class="required-info">*Campos marcados com * s&atilde;o obrigat&oacute;rios</p>
</c:if>