description:Ranges from normie to Elite.Privacy Security Improvements tips links with gui by java swing.

License,GPLv3.

NOTE A MAJOR FLUSH IN REPO HAD BEEN DONE.lol to do it properly.

Setup Steps.
both plugin and main needs the json to work.
Main must have java jdk or jre to run.A Iesys full release can confirm run.
Download repo unzip.
Put it at a clean and safe place.
Setup jre or jdk,if you have not Or start Iesys(well if you have Iesys)
copy or move the dt.json into the defaultui
If you want default ui go to defaultui else other folder.while following the guide.
Move json...jar and the dt.json into the (v? folder)

Using
1,
for using main method.
Make sure you are in the v(number) folder.
when you do ls or dir command.It shows Upsecpriv and the dt.json.
Windows
java -cp "%cd%";"%cd%\*" Upsecpriv

Unix equivalent
java -cp "$PWD":"$PWD/*" Upsecpriv

2,
for using plugin method.
You now should have this repo,v(number) folder,with Upsecpriv.class and dt.json and jsonxxx.jar.
Unpack the jar.
Move/copy the contents that are inside this v(number) folder, to your Iesys user plugin folder. user/plugin
Start the plugin system.Type callplugin Upsecpriv
Enter.BAM,gui comes out.

Shameless plug.for Iesys(temporary?).wanna use the Iesys?
Check.https://www.patreon.com/customxyz

CHG DATABASE.
NOW you have the gui working and you want to test out the other json or other "dt.json"
Just remove the prefix and left the dt.json copy and replace the old one.
BUT,here is the actual real will not fail way.
When you downloaded the repo have the DTBASE folder right.YOU ARE NOT SUPPOSE TO DELETE IF want to CHANGE.
So you SHOULD COPY the stock dt.json right?to the v(number) folder with the class and json or whatnot.
NOW,You want to change the stock dt.json.It uses the v(number) folder one.not the databse right.
DELETE THE dt.json in the v(number) folder.NOW,rename the stock* dt.json to i guess"stock_dt.json"
NOW then you can copy any other one you like into the v(number) folder.Rename as dt.json.
RUN IT.

Contribution,
please if very long article.just go writeas or your own blog or lbry.
Do it properly.Edit the json,put your link,create a pr.

User Quality Guarentee,
Practically none.Only a verbal guarentee of.
(I am also personally using.So should be good.)
PLUS THIS PROJECT PROBABLY GIVES ME ZERO INCOME.UNLESS I GET PAID THEN I MAY CONTROL QUALITY.lol.

