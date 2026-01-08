var ctx = android.app.ActivityThread.currentApplication().getApplicationContext();
String deviceId = android.provider.Settings.Secure.getString(ctx.getContentResolver(), android.provider.Settings.Secure.ANDROID_ID);

var url2 = new URL("https://raw.githubusercontent.com/artembojko038-afk/home_work/main/chemistry.txt");
var conn2 = url2.openConnection();
var iS2 = conn2.getInputStream(); 
var br2 = new BufferedReader(new InputStreamReader(iS2));

String line;
var keys = new ArrayList<String>();
while ((line = br2.readLine()) != null) {
    line = line.trim();
    if (!line.isEmpty()) {
        keys.add(line);   
    }
}

br2.close();
iS2.close();

if (keys.contains("deviceId")) {
    pfc.log("Valid!");
} else { 
    pfc.log("Not Valid!");
}

pfc.log("True");
