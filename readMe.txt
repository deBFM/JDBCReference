Database:
	http://hsqldb.org/
	
	Eine Filesystem-Datenbank kann ganz einfach mit dem Manager erstellt werden: Starte einfach "hsqldb\bin\runManagerSwing.bat"
		Klicke dann Options -> Insert Testdata
		P.S. Das ist auch gleich ein SQL-Tool ;)
	
	Die hsqldb.jar kopiert man sich in dann in sein JavaProjekt und added sie als Librarie in den Buildpath.
	
	Man braucht sonst nichts mit der hsqldb.jar machen, folgendes Statemant l‰d den Treiber automatisch.
	Connection con = DriverManager.getConnection("jdbc:hsqldb:file:myFileDatabase\\db", "ds", "ds"); // Username = ds; Passwort = ds

	Zur Info: 
		Die von mir erstellte Bsp.Datenbank ist im Projekt enthalten Ordner myFiledatabase sie heiﬂt einfach "db" (Username = ds; Passwort = ds)
		Der entpackte Ordner von hssqldb, mit dem zuvor genannten Manager ist nicht enthalten (da etwas zu groﬂ)
	
JDBC Quelle:
	Standard JavaDoc: 
		https://docs.oracle.com/javase/8/docs/api/java/sql/package-summary.html
	Java ist auch eine Insel
		http://openbook.rheinwerk-verlag.de/javainsel/javainsel_17_005.html#dodtp44e54ad6-b4eb-4f1e-89a4-10d270000462


