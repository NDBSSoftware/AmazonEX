<table>
<tbody>
<tr>
	<td>
		<label>Simulate Close Order Error</label><br>
		<input type="radio" name="simulateCloseOrderError" value="0" checked>None<br>
		<input type="radio" name="simulateCloseOrderError" value="1">Amazon Closed<br>
	</td>
</tr>
<tr>
	<td>
		<label>Simulate Authorize Error</label><br>
		<input type="radio" name="simulateAuthorizeError" value="0" checked>None<br>
		<input type="radio" name="simulateAuthorizeError" value="1">Invalid Payment Method<br>
		<input type="radio" name="simulateAuthorizeError" value="2">Amazon Rejected<br>
		<input type="radio" name="simulateAuthorizeError" value="3">Transaction TimedOut<br>
		<input type="radio" name="simulateAuthorizeError" value="4">Expired Unused<br>
		<input type="radio" name="simulateAuthorizeError" value="5">Amazon Closed<br>
	</td>
</tr>
<tr>
	<td>
		<label>SimulateCaptureError</label><br>
		<input type="radio" name="simulateCaptureError" value="0" checked>None<br>
		<input type="radio" name="simulateCaptureError" value="1">Capture Pending<br>
		<input type="radio" name="simulateCaptureError" value="2">Amazon Rejected<br>
		<input type="radio" name="simulateCaptureError" value="3">Amazon Closed<br>
	</td>
</tr>
<tr>
	<td>
		<label>SimulateRefundError</label><br>
		<input type="radio" name="simulateRefundError" value="0" checked>None<br>
		<input type="radio" name="simulateRefundError" value="1">Amazon Rejected<br>
	</td>
</tr>
</tbody>
</table>