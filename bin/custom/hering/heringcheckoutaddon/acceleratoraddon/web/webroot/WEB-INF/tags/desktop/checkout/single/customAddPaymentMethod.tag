<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ attribute name="cartData" required="false"
    type="de.hybris.platform.commercefacades.order.data.CartData"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/desktop/template"%>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme"%>
<%@ taglib prefix="nav" tagdir="/WEB-INF/tags/desktop/nav"%>
<%@ taglib prefix="formElement" tagdir="/WEB-INF/tags/desktop/formElement"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/desktop/common"%>
<%@ taglib prefix="breadcrumb" tagdir="/WEB-INF/tags/desktop/nav/breadcrumb"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<%@ taglib prefix="multi-checkout"
    tagdir="/WEB-INF/tags/addons/b2ccheckoutaddon/desktop/checkout/multi"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<header>
    <h2>
        <spring:theme code="checkout.single.payment.title" />
    </h2>
</header>
<c:forEach items="${paymentModes}" var="paymentMode">
    <input type="hidden" name="voucherAmountEqualsOrderAmount"
        value="${cartData.totalPrice.value eq 0.0 ? true : false}" />
    <c:set var="checked" value="${(paymentMode.code eq 'CreditCard') ? 'checked=\"checked\"' : ''}" />
    <div class="section-container">
        <c:if test="${paymentMode.code == 'CreditCard'}">
            <section id="payment-credit-card">
                <header>
                    <label> <input type="radio" name="paymentMode"
                        value="${paymentMode.code}" ${checked} id="${paymentMode.name}"
                        class="required-payment"> ${paymentMode.name}
                    </label>
                </header>
                <div class="obs">
                    <spring:theme code="checkout.camposObrigatorios" text="Campos Obrigatorios" />
                </div>
                <form:hidden path="paymentId" class="create_update_payment_id" />
                <div class="f-row" id="CreditCardInstalment">
                    <formElement:formSelectBox idKey="numero-parcelas" labelKey="payment.instalment"
                        path="instalment" mandatory="true" skipBlank="true" items="${instalments}" />
                </div>
                <div class="f-row">
                    <formElement:formInputBox idKey="cardNumber" labelKey="payment.cardNumber"
                        path="cardNumber" inputCSS="text required-payment required-numbers"
                        mandatory="false" autocomplete="off" />
                </div>
                <style>
.card-flags input {
	display: none;
}
</style>
                <div class="f-row card-flags">
                    <ul>
                        <li class="hering disabled"><input type="radio" name="cardTypeCode"
                            id="hering" value="hering" /></li>
                        <li class="hipercard disabled"><input type="radio" name="cardTypeCode"
                            id="hipercard" value="hipercard" /></li>
                        <li class="visa disabled"><input type="radio" name="cardTypeCode"
                            id="visa" value="visa" /></li>
                        <li class="master disabled"><input type="radio" name="cardTypeCode"
                            id="mastercard" value="master" /></li>
                        <li class="diners disabled"><input type="radio" name="cardTypeCode"
                            id="diners" value="diners" /></li>
                        <li class="amex disabled"><input type="radio" name="cardTypeCode"
                            id="american" value="amex"></li>
                        <li class="elo disabled"><input type="radio" name="cardTypeCode"
                            id="elo" value="elo" /></li>
                    </ul>
                    <small> <spring:theme code="checkout.bandeiraCartao"
                            text="Bandeira Cartao Selecionada Auto" />
                    </small>
                </div>
                <div class="f-row">
                    <formElement:formInputBox idKey="nameOnCard" labelKey="payment.nameOnCard"
                        path="nameOnCard" inputCSS="text required-payment required-letters"
                        mandatory="false" />
                </div>
                <div class="f-row">
                    <label for="cartao-vencimento-mes"> <spring:theme
                            code="payment.expiryDate" />
                    </label>
                    <formElement:formSelectBox idKey="cartao-vencimento-mes" path="expiryMonth"
                        mandatory="false" skipBlank="true" skipBlankMessageKey="" items="${months}"
                        selectCSSClass="required-payment" />
                    <formElement:formSelectBox idKey="ExpiryYear" path="expiryYear"
                        mandatory="false" skipBlank="true" skipBlankMessageKey=""
                        items="${expiryYears}" selectCSSClass="required-payment" />
                </div>
                <div class="f-row">
                    <label class="control-label" for="cv2Number"> <spring:theme
                            code="payment.cv2Number" /> <span class="mandatory">*</span> <span
                        class="skip"></span>
                    </label>
                    <div class="f-row-70">
                        <input id="cv2Number" name="cv2Number"
                            class="text required-payment required-numbers" type="text" maxlength="5"
                            autocomplete="off" />
                    </div>
                    <div class="f-row-30">
                        <a href="#" class="hover-tooltip"> <spring:theme
                                code="checkout.oQueIsso" text="O que e isso" />
                            <div class="tooltip information-content securityCodeInfo">
                                <h3>
                                    <spring:theme code="checkout.toolTip.CodSeguranca"
                                        text="Codigo de seguranca" />
                                </h3>
                                <ul class="code-information">
                                    <li>
                                        <h3>Visa, Mastercard, DinersClub, Hipercard</h3> <img
                                        src="/store/_ui/desktop/theme-${themeName}/images/card-safe-code.png"
                                        alt="">
                                        <p>
                                            <spring:theme code="checkout.tooltip.tresDigitos"
                                                text="Encontra no verso 3 digitos" />
                                        </p>
                                    </li>
                                    <li class="amex">
                                        <h3>American Express</h3> <img
                                        src="/store/_ui/desktop/theme-${themeName}/images/card-safe-code-american-express.png"
                                        alt="">
                                        <p>
                                            <spring:theme code="checkout.tooltip.quatroDigitos"
                                                text="Encontra na frente 4 digitos" />
                                        </p>
                                    </li>
                                </ul>
                            </div>
                        </a>
                    </div>
                </div>
            </section>
        </c:if>
        <c:if test="${paymentMode.code == 'Boleto'}">
            <section id="payment-billet">
                <header>
                    <label> <input type="radio" name="paymentMode"
                        value="${paymentMode.code}" ${checked} id="${paymentMode.name}" />
                        ${paymentMode.name}
                    </label>
                </header>
                <p>
                    <i class="fa fa-barcode"></i>
                    <spring:theme code="checkout.popUpBoleto" text="Texto PopUp para Boleto" />
                </p>
                <p>
                    <spring:theme code="checkout.infoEntrega" text="Texto Informacao Entrega" />
                </p>
            </section>
        </c:if>
        <c:if test="${paymentMode.code == 'Voucher'}">
            <section id="payment-gift-card">
                <header>
                    <label> ${paymentMode.name} </label>
                </header>
                <div class="f-row div-vale-credito">
                    <div class="vale-credito-not-applied"
                        style="${hasAppliedValeCredito ? 'display: none' : ''}">
                        <formElement:formInputBox idKey="voucher" labelKey="" path="voucher"
                            inputCSS="text required-voucher" mandatory="false" />
                        <div>
                            <input type="hidden" name="applyVcUrl"
                                value="${request.contextPath}/checkout/single/apply-vc/" /> <a
                                href="#" class="btn applyVC btn-voucher"> <spring:theme
                                    code="checkout.single.payment.redeemValeCredito" />
                            </a>
                        </div>
                    </div>
                    <div class="vale-credito-applied"
                        style="${hasAppliedValeCredito ? '' : 'display: none'}">
                        <input type="hidden" name="applyVcUrl"
                            value="${request.contextPath}/checkout/single/remove-vc/" /> <input
                            type="hidden" name="vcCode" value="${appliedValeCreditoCode}" /> <a
                            href="#" class="btn applyVC btn-voucher"> <spring:theme
                                code="checkout.single.payment.releaseValeCredito" />
                        </a>
                    </div>
                </div>
            </section>
        </c:if>
        <c:if test="${paymentMode.code == 'Advance'}">
            <section id="payment-advance">
                <header>
                    <label> <input type="radio" name="paymentMode"
                        value="${paymentMode.code}" ${checked} id="${paymentMode.name}" />
                        ${paymentMode.name}
                    </label>
                </header>
                <p>
                   ${paymentMode.description}
                </p>
            </section>
        </c:if>
    </div>
</c:forEach>
