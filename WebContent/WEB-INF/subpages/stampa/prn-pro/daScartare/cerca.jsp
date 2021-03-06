<%@ page contentType="text/html;charset=iso-8859-1" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="/WEB-INF/eprot.tld" prefix="eprot" %>

<html:xhtml />
<div id="protocollo-errori">
  <html:errors bundle="bundleErroriProtocollo" />
</div>
<table >
<tr>
    <td colspan="4"> &nbsp; </td>
</tr>
<tr>
	<td>
		<label for="dataInizio">
			<bean:message key="report.datainizio"/>:
		</label>
	</td>
	<td>
	<html:text property="dataInizio" styleId="dataInizio" size="10" maxlength="10" />
		<eprot:calendar textField="dataInizio" hasTime="false"/>&nbsp;
	</td>
	<td>	
	   	<label for="dataFine">
			<bean:message key="report.datafine"/>:
		</label>
	</td>
	<td>
	<html:text property="dataFine" styleId="dataFine" size="10" maxlength="10" />
	    <eprot:calendar textField="dataFine" hasTime="false"/>
	</td>
</tr>
<tr>
	<td colspan="4">	    
		<jsp:include page="../uffici.jsp" /><br />
	<td>
</tr>
<tr>
	<td colspan="4">
		<html:submit styleClass="submit" property="btnStampa" value="Stampa" alt="Stampa protocolli da scartare"/>
	</td>
</tr>
</table>	

