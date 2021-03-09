description:Ranges from normie to Elite.Privacy Security Improvements tips links with gui by java swing.

License,GPLv3.

both plugin and main needs the json to work.Main must have java jdk or jre to run.Iesys already have prebuilt
Download repo unzip.Put it at a clean and safe place.
Setup jre or jdk,if you have not(main_fixed folder is used).Or start Iesys(plugin folder is used)
If you want default ui go to defaultui
Move json...jar into the (main_fixed folder/plugin folder)
1,
for using main method.
Make sure you are in the v1_main_fixed folder.
when you do ls or dir command.It shows Upsecpriv.
Windows
java -cp "%cd%";"%cd%\*" Upsecpriv

Unix equivalent
java -cp "$PWD";"$PWD/*" Upsecpriv

2,
for using plugin method.
You now should have this repo plugin folder with Upsecpriv.class and json jar.
Unpack the jar.
Move the contents in this plugin folder to your iesys user plugin folder. user/plugin
Start the plugin system.Type callplugin Upsecpriv

