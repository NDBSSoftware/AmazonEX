function setAddressToMap(element,address_text,xml_node,i,element_width,element_height){var map;if(element_height==null){element_height="282px";}if(element_width==null){element_width="304px";}map=new GMaps({div:element,zoom:16,lat:0,lng:0,width:element_width,height:element_height,});GMaps.geocode({address:address_text,callback:function(results,status){if(status=="OK"){var latlng=results[0].geometry.location;map.setCenter(latlng.lat(),latlng.lng());map.addMarker({lat:latlng.lat(),lng:latlng.lng()});}}});}function openModal(element_id,address_text,xml_node,i){var $fullmap=$(element_id);if($fullmap.length>0){$("html, body").animate({scrollTop:0},"fast");$fullmap.closest(".modal-container").fadeIn();setAddressToMap(element_id,address_text,xml_node,i,"500px","500px");$fullmap.prepend('<a href="#" class="bt-modal-fechar">fechar</a>');$(".bt-modal-fechar").click(function(){$(this).closest(".modal-container").fadeOut();});}}function renderMap(address_to_find,bairro){$("#listagem").html('<h2 class="nomeCidade">'+$("#escolheCidade").val()+"</h2>");$.ajax({type:"GET",url:"/storefinder/nossas-lojas.xml",dataType:"xml",success:function(xml){var $xml=$(xml),i=0,$element_cidade=$xml.find('cidade:contains("'+$("#escolheCidade").val()+'")');if($element_cidade.length>0){$element_cidade.each(function(){i++;var $xml_node=$(this);var address=$xml_node.parent().find("google").text()+","+$("#escolheCidade").val()+", "+$("#escolheEstado").val()+", Brasil";var html_loja='<div class="loja clearfix"><div class="informacoes"><span class="nome-loja">'+$xml_node.parent().find("nome").text()+'</span><span class="endereco">'+$xml_node.parent().find("endereco").text()+'</span><span class="telefone">Telefone: '+$xml_node.parent().find("telefone").text()+'</span></div><div class="gmaps" id="gmaps-'+i+'"></div><a class="abre-modal" href="javascript:void(0)" onclick="openModal(\'#modal-full-map\',\''+address+"',null, "+i+')">Como Chegar</a><br><br></div>';$("#listagem").append(html_loja);setAddressToMap("#gmaps-"+i,address,null,i);});}}});}function renderMapBairro(bairro){$("#listagem").html("Carregando...");$.ajax({type:"GET",url:"/storefinder/nossas-lojas.xml",dataType:"xml",success:function(xml){var $xml=$(xml),i=0;$("#listagem").html("");$xml.find('cidade:contains("'+$("#escolheCidade ").val()+'")').each(function(){$element_bairro=$(this).parent().find("info").find('lng:contains("'+bairro+'")');if($element_bairro.length>0){$element_bairro.each(function(){i++;var $xml_node=$(this);var address=$xml_node.parent().find("google").text()+","+$("#escolheCidade").val()+", "+$("#escolheEstado").val()+", Brasil";var html_loja='<h2 class="nomeCidade">'+$("#escolheCidade").val()+'</h2><div class="loja clearfix"><div class="informacoes"><span class="nome-loja">'+$xml_node.parent().find("nome").text()+'</span><span class="endereco">'+$xml_node.parent().find("endereco").text()+'</span><span class="telefone">Telefone: '+$xml_node.parent().find("telefone").text()+'</span></div><div class="gmaps" id="gmaps-'+i+'"></div><div class="modal-full-map" id="full-map-'+i+'"></div><a class="abre-modal" href="javascript:void(0)" onclick="openModal(\'#modal-full-map\',\''+address+"',null, "+i+')">Como Chegar</a><br><br></div>';$("#listagem").append(html_loja);setAddressToMap("#gmaps-"+i,address,null,i);});}});}});}function carregaCidades(){$("#escolheCidade").html('<option id="cidadeInicio" selected="selected" value="0">- Selecione a cidade</option>');$.ajax({type:"GET",url:"/storefinder/nossas-lojas.xml",dataType:"xml",success:function(xml){var $xml=$(xml);$xml.find('uf:contains("'+$("#escolheEstado").val()+'")').each(function(){if($('#escolheCidade option:contains("'+$(this).parent().find("cidade").text()+'")').length<1){$("#escolheCidade").append('<option value="'+$(this).parent().find("cidade").text()+'">'+$(this).parent().find("cidade").text()+"</option>");}});var options=$("select#escolheCidade option");var arr=options.map(function(_,o){return{t:$(o).text(),v:o.value};}).get();arr.sort(function(o1,o2){return o1.t>o2.t?1:o1.t<o2.t?-1:0;});options.each(function(i,o){o.value=arr[i].v;$(o).text(arr[i].t);});}});}function carregaBairros(){$("#escolheBairro").show().html("");$.ajax({type:"GET",url:"/storefinder/nossas-lojas.xml",dataType:"xml",success:function(xml){var $xml=$(xml);$xml.find('cidade:contains("'+$("#escolheCidade").val()+'")').each(function(){$(this).parent().find("info").find("lng").each(function(){if($('#escolheBairro option:contains("'+$(this).text()+'")').length<1){$("#escolheBairro").append('<option value="'+$(this).text()+'">'+$(this).text()+"</option>");}});});var options=$("select#escolheBairro option");var arr=options.map(function(_,o){return{t:$(o).text(),v:o.value};}).get();arr.sort(function(o1,o2){return o1.t>o2.t?1:o1.t<o2.t?-1:0;});options.each(function(i,o){o.value=arr[i].v;$(o).text(arr[i].t);});$("#escolheBairro").prepend('<option selected="selected" value="">- Selecione o bairro</option>');}});}$(document).ready(function(){$("#escolheBairro").change(function(event){renderMapBairro($(this).val());});$("#escolheCidade").change(function(event){$("#bairro").hide();if($(this).val()=="Sao Paulo"){$("#bairro").show();carregaBairros();}else{renderMap($(this).val());}});$("#escolheEstado").change(function(event){$("#bairro").hide();carregaCidades();$("#gmaps").html();});$("#escolheCidade").html("");});