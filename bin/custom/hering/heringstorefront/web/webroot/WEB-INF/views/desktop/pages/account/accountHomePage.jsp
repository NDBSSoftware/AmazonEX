<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/desktop/template"%>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme"%>
<%@ taglib prefix="nav" tagdir="/WEB-INF/tags/desktop/nav"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/desktop/common"%>
<%@ taglib prefix="breadcrumb" tagdir="/WEB-INF/tags/desktop/nav/breadcrumb"%>
<%@ taglib prefix="order" tagdir="/WEB-INF/tags/desktop/order"%>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/desktop/product" %>
<%@ taglib prefix="address" tagdir="/WEB-INF/tags/desktop/address"%>
<template:page pageTitle="${pageTitle}">
<!--     <div id="main-wrapper"> -->
<div class="container">
	<small>
		<breadcrumb:breadcrumb breadcrumbs="${breadcrumbs}" />
    </small>
</div>
	<div class="container">
   		<div class="col-sm-8 hidden-xs">
   			<h1><spring:theme code="text.fliegercommerce.texto15"/>, ${customerData.firstName}! </h1>
		</div>
		<div class="col-sm-4 text-right margin-bottom">
			<a class="btn btn-default" href="<c:url value="/logout"/>"> <span class="glyphicon glyphicon-log-out"></span>Ausloggen</a>
		</div>
		<div class="col-sm-12 col-md-8">
			<div class="row">
				<div class="col-sm-6">
					<div class="panel panel-default">
						<div class="panel-body">
							<a href="/de/my-account/bonus-system" class="sparfucsIcon">${bonusDataPoints}</a>
							<br>
							Du bist ein Sparfuchs!
							<br>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="panel panel-default">
						<div class="panel-body">
							<a href="#" style="font-size:60px;">
								<span class="glyphicon glyphicon-heart"></span>
								666
							</a>
							<br>
							Auf deiner Wunschliste sind 666 Artikel.
							<br>
						</div>
					</div>
				</div> 
			</div>
			<div class="panel panel-default orders150309">
				<div class="panel-heading">
					<span class="glyphicon glyphicon-list"></span> Bestellungen
				</div>
				<div class="panel-body">
					<div class="row">
						<c:if test="${not empty orderHistoryPreview}">
							<c:forEach items="${orderHistoryPreview}" var="order" begin="0" end="2">
								<div class="col-sm-4">
									<a class="panel panel-default order150311" href="/de/my-account/order/${order.code}">
										<span class="title150311">
											<c:if test="${order.status == 'COMPLETED'}">
												<span class="glyphicon glyphicon-ok"></span>
											</c:if>
											<c:if test="${order.status != 'COMPLETED'}">
												<span class="glyphicon glyphicon-time"></span>
											</c:if>
											${order.code}
										</span>
										<div class="squarebox150311"> 
											<div class="squarecontent150311">
												<c:forEach items="${order.previewEntries}" var="productPhoto" begin="0" end="4" varStatus="status">
													<c:if test="${status.index == 0}">
														<div class="orderline150311 first">
															<product:productPrimaryImage product="${productPhoto.product}" format="product"/>
														</div>
													</c:if>
													<c:if test="${status.index > 0 && status.index < 4}">
														<div class="orderline150311">
															<product:productPrimaryImage product="${productPhoto.product}" format="thumbnail"/>
														</div>
													</c:if>
													<c:if test="${status.index == 4}">
														<div class="orderline150311 first">
															<product:productPrimaryImage product="${productPhoto.product}" format="thumbnail"/>
														</div>
													</c:if>
												</c:forEach>
											</div> 
										</div>
										<span class="price150311">${order.total.formattedValue}</span>
									</a>
								</div>
							</c:forEach>
							<div id="toggleOrderlist" class="collapse">
								<c:set var="endList" value="${fn:length(orderHistoryPreview)}" />
								<c:forEach items="${orderHistoryPreview}" var="order" begin="3" end="${endList}">
									<div class="col-sm-4">
										<a class="panel panel-default order150311" href="/de/my-account/order/${order.code}">
											<span class="title150311">
												<c:if test="${order.status == 'COMPLETED'}">
													<span class="glyphicon glyphicon-ok"></span>
												</c:if>
												<c:if test="${order.status != 'COMPLETED'}">
													<span class="glyphicon glyphicon-time"></span>
												</c:if> 
												${order.code}
											</span>
											<div class="squarebox150311"> 
												<div class="squarecontent150311">
													<c:forEach items="${order.previewEntries}" var="productPhoto" begin="0" end="4" varStatus="status">
														<c:if test="${status.index == 0}">
															<div class="orderline150311 first">
																<product:productPrimaryImage product="${productPhoto.product}" format="product"/>
															</div>
														</c:if>
														<c:if test="${status.index > 0 && status.index < 4}">
															<div class="orderline150311">
																<product:productPrimaryImage product="${productPhoto.product}" format="thumbnail"/>
															</div>
														</c:if>
														<c:if test="${status.index == 4}">
															<div class="orderline150311 first">
																<product:productPrimaryImage product="${productPhoto.product}" format="thumbnail"/>
															</div>
														</c:if>
													</c:forEach>
												</div>
											</div>	
											<span class="price150311">${order.total.formattedValue}</span>
										</a>
									</div>
								</c:forEach>
							</div>
						</c:if>
						<c:if test="${empty orderHistoryPreview}">
							<spring:theme code="text.fliegercommerce.texto17"/>
						</c:if>
					</div>
				</div>
				<div class="panel-footer clearfix">
					<div class="text-center">
						<a class="btn btn-link" style="padding:0;" data-toggle="collapse" data-target="#toggleOrderlist"><span class="glyphicon glyphicon-option-horizontal" style="font-size:24px;"></span></a>
					</div>
				</div>
			</div>
			
			
			
			<div class=" panel panel-default abos150309">
			<div class="panel-heading"><span class="glyphicon glyphicon-envelope"></span> Abonnements
			</div>
			
			<div class="panel-body">
			    <form id="subscriptions" class="form-horizontal" action="my-account/subscriptions" method="GET">
					<div class="form-group">
						<div class="col-xs-12">
							<div class="checkbox">
								<label><input type="checkbox"> Angebotsnewsletter (wöchentlich)<br><small>Kein Angebot mehr verpassen. Wir senden dir einmal wöchentlich die besten Schnäppchen.</small></label>
							</div>
						</div>
					</div>
					<div id="toggleMails" class="collapse">
						<div class="form-group">
							<div class="col-xs-12">
								<div class="checkbox">
									<label><input type="checkbox"  name="tipsNewsletter"> Schwangerschafts-Newsletter (wöchentlich)<br><small>Erfahre in jeder SSW, wie sich dein Baby entwickelt und erhalte praktische Tipps und passende Angebote.</small></label>
									<div class="form-group col-sm-6">
										<label for="birthday" class="control-label"><small>Entbindungstermin / Geburtstag</small></label>
										<div class="input-group input-append date" id="birthday" data-date="01.01.2015" data-date-format="dd.mm.yyyy" style="padding-left:20px;">
											<input type="text" name="youngestChildDateOfBirth" size="16" class="form-control span2" value="01.01.2015">
											<span class="input-group-btn add-on">
												<button type="button" class="btn btn-default"><span class="glyphicon glyphicon-calendar"></span></button>
											</span>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="form-group">
							<div class="col-xs-12">
								<div class="checkbox">
									<label><input type="checkbox"> Einladung zur Trusted Shops-Bewertung (1x pro Bestellung)<br><small>Bewerte Dein Einkaufserlebnis bei Babyartikel.de und erhalte für jede Bewertung tolle Gewinnchancen.</small></label>
								</div>
							</div>
						</div>
						<div class="form-group">
							<div class="col-xs-12">
								<div class="checkbox">
									<label><input type="checkbox"> Einladung zur Produkt-Bewertung (1x pro Bestellung)<br><small>Bewerte deine Einkäufe und hilf anderen Eltern bei der Auswahl der passenden Produkte. Wir belohnen jede Produktbewertung mit tollen Gewinnchancen!</small></label>
								</div>
							</div>
						</div>
						<button>Confirm</button>
					</div>					
				</form>
			</div>
			
			<div class="panel-footer clearfix">
				<div class="text-center">
					<a class="btn btn-link" style="padding:0;" data-toggle="collapse" data-target="#toggleMails"><span class="glyphicon glyphicon-option-horizontal" style="font-size:24px;"></span></a>
				</div>
			</div>
		</div>
		
		
		
	</div>
	<div class="col-sm-12 col-md-4">
		<div class="row">
			<div class="col-xs-12">
				<div class=" panel panel-default">
					<order:infoAccountUser customer="${customerData}" />
				</div>
			</div>
			<div class="col-xs-12">
				<div class=" panel panel-default">
					<address:addressAccountUser type="billing" address="${addressBilling}" regions="${regions}" country="${country}" />
				</div>
			</div>
			<div class="col-xs-12">
				<div class=" panel panel-default">
					<address:addressAccountUser type="delivery" address="${addressDelivery}" regions="${regions}" country="${country}" />
				</div>
			</div>
			<div class="col-xs-12">
				<div class=" panel panel-default">
					<div class="panel-heading"><span class="glyphicon glyphicon-link"></span> Verknüpfte Konten<div class="pull-right"><small><a href="#connectionsModal" data-toggle="modal"><span class="glyphicon glyphicon-cog"></span></a></small></div>
					</div>
					<div class="panel-body">
						<div style="float:left;height:64px;width:64px;background-image: url('layout/but_amazon64.png');background-repeat:no-repeat;">
						</div>
						<div style="float:left;height:64px;width:64px;background-image: url('layout/but_facebook64.png');background-repeat:no-repeat;">
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<!-- BEGIN Modal HTML (This part should be loaded asynchronous until golive -->
    
<!-- connectionsModal HTML -->
    <div id="connectionsModal" class="modal fade">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title"><span class="glyphicon glyphicon-link"></span> Verkn&uuml;pfte Konten &auml;ndern</h4>
                </div>
                <div class="modal-body">
					<p>Wenn Sie sich mit 1 Klick einloggen, wird Ihr Amazon- oder Facebook-Konto mit Ihrem Babyartikel.de-Konto verkn&uuml;pft. Sie m&uuml;ssen sich kein separates Passwort mehr merken. Hier k&ouml;nnen Sie die Verkn&uuml;pfung wieder entfernen:</p>
					<div class=" margin-bottom" style="background-image: url('layout/but_amazon64.png');padding-left:91px;background-repeat:no-repeat;min-height:91px">
						Amazon Login and Payments<br />
						<button type="button" class="btn btn-default">Entfernen</button>
					</div>
					<div class=" margin-bottom" style="background-image: url('layout/but_facebook64.png');padding-left:91px;background-repeat:no-repeat;min-height:91px">
						Facebook Login<br />
						<button type="button" class="btn btn-default">Entfernen</button>
					</div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Abbrechen</button>
                </div>
            </div>
        </div>
    </div>	
	
<!-- END Modal HTML -->        
        
        
<!--             <section class="home page with-sidebar"> -->
<%--                 <nav:accountNav /> --%>
<!--                 <div class="right"> -->
<!--                     <section id="welcome"> -->
<%--                         <div id="profile-avatar" class="left">
<%-- 									<img src="http://placehold.it/124" alt="Imagem de perfil" class="profile-avatar"> --%>
<%-- 									<a href="#" title="alterar foto"><spring:theme code="text.account.changePhoto" text="Change Photo" /></a> --%>
<%-- 								</div> --%>
<!--                         <header class="temporaryWelcome"> -->
<%--                             <h2><spring:theme code="text.fliegercommerce.texto15"/> ${customerData.firstName},</h2> --%>
<!--                             <p> -->
<%--                                 <spring:theme code="text.account.welcomeHering" --%>
<%--                                     text="Welcome Hering" /> --%>
<!--                             </p> -->
<%--                             <nav id="quick-links"> --%>
<!--                                 <ul> -->
<%--                                     <c:url value="/my-account/update-password" var="encodedUrl" /> --%>
<%--                                     <li><a href="${encodedUrl}"><spring:theme --%>
<%--                                                 code="text.account.profile.changePassword" --%>
<%--                                                 text="Change your password" /></a></li> --%>
<%--                                     <c:url value="/my-account/update-email" var="encodedUrl1" /> --%>
<%--                                     <li><a href="${encodedUrl1}"><spring:theme --%>
<%--                                                 code="text.account.profile.updateEmail" --%>
<%--                                                 text="Change your email" /></a></li> --%>
<%--                                     <c:url value="/my-account/address-book" var="encodedUrl" /> --%>
<%--                                     <li><a href="${encodedUrl}"><spring:theme --%>
<%--                                                 code="text.account.manageShippingAddress" --%>
<%--                                                 text="Manage your Shipping Address" /></a></li> --%>
<%--                                     <c:url value="/my-account/orders" var="encodedUrl" /> --%>
<%--                                     <li><a href="${encodedUrl}"><spring:theme --%>
<%--                                                 code="text.account.orderHistory" --%>
<%--                                                 text="Order History" /></a></li> --%>
<!--                                 </ul> -->
<%--                             </nav> --%>
<!--                         </header> -->
<!--                     </section> -->
<!--                     <section id="last-orders"> -->
<!--                         <header> -->
<!--                             <h2> -->
<%--                                 <spring:theme code="text.account.lastOrdersHering" --%>
<%--                                      text="Last Orders Hering" /> --%>
<!--                             </h2> -->
<!--                         </header> -->



<%--                         <c:if test="${not empty orderHistoryPreview}"> --%>
<!--                             <table> -->
<!--                                 <thead> -->
<!--                                     <tr> -->
<%--                                         <th><spring:theme code="text.account.lastOrderNumber" --%>
<%--                                                  text="Last Order Number" /></th> --%>
<%--                                         <th><spring:theme code="text.account.lastOrderDate" --%>
<%--                                                  text="Last Order Date" /></th> --%>
<%--                                         <th><spring:theme --%>
<%--                                                  code="text.account.lastOrderTotalPrice" --%>
<%--                                                  text="Last Order Total Price" /></th> --%>
<%--                                          <th><spring:theme code="text.fliegercommerce.texto16"/></th> --%>
<%--                                          <th><spring:theme code="text.account.lastOrderStatus" --%>
<%--                                                  text="Last Order Status" /></th> --%>
<!--                                     </tr> -->
<!--                                 </thead> -->
<!--                                 <tbody> -->
<%--                                     <c:forEach items="${orderHistoryPreview}" var="order" begin="0" --%>
<%--                                          end="2"> --%>
<%--                                         <c:url value="/my-account/order/${order.code}" --%>
<%--                                              var="myAccountOrderDetailsUrl" /> --%>
<!--                                         <tr> -->
<!--                                             <td><big><a -->
<%--                                                     href="${myAccountOrderDetailsUrl}">${order.code}</a></big></td> --%>
<%--                                             <td><fmt:formatDate value="${order.placed}" --%>
<%--                                                      dateStyle="short" type="date" /><br> <spring:theme code="text.fliegercommerce.texto25"/><fmt:formatDate --%>
<%--                                                      value="${order.placed}" timeStyle="short" --%>
<%--                                                      type="time" /></td> --%>
<%--                                              <td><big>${order.total.formattedValue}</big></td> --%>
<%--                                              <td>${order.paymentMode}</td> --%>
<%--                                              <td><spring:theme --%>
<%--                                                      code="text.account.order.status.display.${order.statusDisplay}" /><br> --%>
<%--                                                  <c:if test="${order.deliveryMode == 'TFA'}"> --%> 
<%--                                                      <spring:theme --%>
<%--                                                          code="text.account.lastOrderTracking" --%>
<%--                                                          text="Last Order Tracking" /> --%>
<!--                                                     <a class="" -->
<%--                                                         href="http://www.transfolha.com.br/outros/pesquisahttpentrega.asp?scliente=000539&schave=6b7e676029&spesquisa=generico&sdado=${order.trackingID}" --%>
<%--                                                         target="_blank"> ${order.trackingID} </a> --%>
<%--                                                 </c:if> <c:if test="${order.deliveryMode == 'CORREIOS'}"> --%>
<%--                                                     <spring:theme --%>
<%--                                                         code="text.account.lastOrderTracking" --%>
<%--                                                         text="Last Order Tracking" /> --%>
<!--                                                     <a class="" -->
<%--                                                         href="http://websro.correios.com.br/sro_bin/txect01$.querylist?p_lingua=001&p_tipo=001&p_cod_uni=${order.trackingID}" --%>
<%--                                                         target="_blank"> ${order.trackingID} </a> --%>
<%--                                                 </c:if> <c:if test="${order.deliveryMode == 'JTT'}"> --%>
<%--                                                     <spring:theme --%>
<%--                                                         code="text.account.lastOrderTracking" --%>
<%--                                                         text="Last Order Tracking" /> --%>
<!--                                                     <a class="" -->
<%--                                                         href="http://www.jttlog.com.br/consulta_nf.php?nf=${order.trackingID}" --%>
<%--                                                         target="_blank"> ${order.trackingID} --%>
<!--                                                     </a> -->
<%--                                                 </c:if></td> --%>
<!--                                         </tr> -->
<%--                                     </c:forEach> --%>
<!--                                 </tbody> -->
<!--                             </table> -->
<%--                         </c:if> --%>
<%--                         <c:if test="${empty orderHistoryPreview}"> --%>
<%-- 									<spring:theme code="text.fliegercommerce.texto17"/> --%>
<%-- 								</c:if> --%>
<!--                     </section> -->




<!--                     <section id="general-info"> -->
<%--                         
<%-- 								<section id="current-accounts" class="left"> --%>
<%-- 									<header> --%>
<%-- 										<h2><spring:theme code="text.account.accountCurrentInShop" text="Account Current in Shop"/></h2> --%>
<%-- 									</header> --%>
<%-- 									<table class="acc-historical"> --%>
<%-- 										<tbody> --%>
<%-- 											add bonusPoints 
<%-- 										</tbody> --%>
<%-- 									</table> --%>
<%-- 								</section> --%>
<!--                         <section id="account-addresses" class="right"> -->
<!--                             <header> -->
<%--                                 <h2><spring:theme code="text.fliegercommerce.texto14"/></h2> --%>
<!--                             </header> -->
<%--                             <c:if test="${not empty addressData}"> --%>
<%--                                 <c:choose> --%>
<%--                                     <c:when test="${not empty addressData}"> --%>
<%--                                         <c:forEach items="${addressData}" var="address"> --%>
<!--                                             <ul> -->
<!--                                                 <li> -->
<%--                                                     <h3>${address.type} --%>
<%--                                                         <ycommerce:testId --%>
<%--                                                             code="addressBook_addressOptions_label"> --%>
<%--                                                             <ycommerce:testId --%>
<%--                                                                 code="addressBook_editAddress_button"> --%>
<!--                                                                 <a class="adressButtonEditAddress" -->
<%--                                                                     href="my-account/edit-address/${address.id}"> --%>
<%--                                                                     <spring:theme --%>
<%--                                                                         code="text.account.addressEdit" --%>
<%--                                                                         text="Address Edit" /> --%>
<!--                                                                 </a> -->
<%--                                                             </ycommerce:testId> --%>
<%--                                                         </ycommerce:testId> --%>
<!--                                                     </h3> -->
<!--                                                     <p> -->
<%--                                                         <strong><spring:theme code="text.fliegercommerce.texto18"/></strong>&nbsp; --%>
<%--                                                         ${fn:escapeXml(address.firstName)}&nbsp; --%>
<%--                                                         ${fn:escapeXml(address.lastName)} --%>
<!--                                                     </p> -->
<!--                                                     <p> -->
<%--                                                         <c:if test="${not empty address.receiver}"> --%>
<%--                                                             <strong><spring:theme code="text.fliegercommerce.texto19"/></strong>&nbsp; ${fn:escapeXml(address.receiver)}</c:if> --%>
<!--                                                     </p> -->
<!--                                                     <p> -->
<%--                                                         <strong><spring:theme code="text.fliegercommerce.texto20"/></strong>&nbsp; --%>
<%--                                                         (${fn:escapeXml(address.dddPhone)})${fn:escapeXml(address.phone)} --%>
<!--                                                     </p> -->
<!--                                                     <p> -->
<%--                                                         <c:if test="${not empty address.celPhone}"> --%>
<%--                                                             <strong><spring:theme code="text.fliegercommerce.texto21"/></strong>&nbsp; (${fn:escapeXml(address.dddCelPhone)})${fn:escapeXml(address.celPhone)}</c:if> --%>
<!--                                                     </p> -->
<!--                                                     <p> -->
<%--                                                         <strong><spring:theme code="text.fliegercommerce.texto22"/>&nbsp;</strong> --%>
<%--                                                         ${fn:escapeXml(address.line1)}, --%>
<%--                                                         ${fn:escapeXml(address.number)} - --%>
<%--                                                         ${fn:escapeXml(address.complement)} &nbsp; --%>
<%--                                                         ${fn:escapeXml(address.district)}<br /> --%>
<%--                                                         ${fn:escapeXml(address.town)}&nbsp; --%>
<%--                                                         <c:if --%>
<%--                                                             test="${not empty address.region.name}">-&nbsp;${fn:escapeXml(address.region.isocodeShort)}</c:if> --%>
<%--                                                         - ${fn:escapeXml(address.postalCode)} --%>
<!--                                                     </p> -->
<!--                                                     <p> -->
<%--                                                         <c:if test="${not empty address.reference}"> --%>
<%--                                                             <strong><spring:theme code="text.fliegercommerce.texto23"/></strong>&nbsp; ${fn:escapeXml(address.reference)}</c:if> --%>
<!--                                                     <p> -->
<!--                                                 </li> -->
<!--                                             </ul> -->
<%--                                         </c:forEach> --%>
<%--                                     </c:when> --%>
<%--                                 </c:choose> --%>
<%--                             </c:if> --%>
<%--                             <c:if test="${empty addressData}"> --%>
<%-- 											<spring:theme code="text.fliegercommerce.texto24"/> --%>
<%-- 										</c:if> --%>
<!--                         </section> -->
<!--                     </section> -->
<!--                 </div> -->
<!--             </section> -->
<!--         </div> -->
<!--     </div> -->
</template:page>
