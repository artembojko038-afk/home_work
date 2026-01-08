var ctx = android.app.ActivityThread.currentApplication().getApplicationContext();
String deviceId = android.provider.Settings.Secure.getString(ctx.getContentResolver(), android.provider.Settings.Secure.ANDROID_ID);

var url = new URL("https://raw.githubusercontent.com/artembojko038-afk/home_work/main/chemistry.txt");
var conn = url.openConnection();
var iS = conn.getInputStream(); 
var br = new BufferedReader(new InputStreamReader(iS));

String line;
var keys = new ArrayList<String>();
while ((line = br.readLine()) != null) {
    line = line.trim();
    if (!line.isEmpty()) {
        keys.add(line);   
    }
}

br.close();
iS.close();

if (keys.contains("357d78c945779392")) {
    pfc.log("Valid!");
} else { 
    pfc.log("Not Valid!");
}

