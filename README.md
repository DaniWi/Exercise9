#CONTINUOUS INTEGRATION

Kontinuierliche Integration befasst sich damit, größere Softwareprojekte schnell, sicher und unkomplizierte zu entwerfen.  
Dabei geht es vorallem um Projekte, bei denen viele Mitarbeiter gemeinsam daran arbeiten und es dadurch zu Konflikten
beim Austausch der Quelldateien geben kann.

Dieses Konzept besagt, dass die Mitarbeiter so oft wie möglich ihre neuen Codeteile auf einen Server laden sollen, damit dieser immer
möglichst aktuelle bleibt.  Dort werden dann die Files automatisch compiliert, zusammengepackt und dann auf einem Testserver unter realen
Bedingungen getestet. Das Ziel dabei ist, die Entwicklung schneller voran zutreiben, weil der Mitarbeiter mit diesem Konzept mehr Zeit
an einem neuem Feature verbringen soll, als viel Zeit am Compilieren oder Testen zu verschwenden.

Der Server auf dem das Projekt liegt, compiliert und testet alles vollautomatisch, währenddessen können die Mitarbeiter bereits an einem
neuem Feature arbeiten. Fehler sollen hiermit auch schneller erkannt und dadurch auch schneller beseitigt werden. Der Server leitet einen
Fehler sofort an den Verursacher weiter, der ihn umgehend bearbeiten kann.

Damit das alles gut funktionieren kann, gibt es ein paar **Regeln** für die Mitarbeiter: 

* Änderungen so oft als möglich beim Server einchecken    
* Nur fertige Codeblöcke uploaden, keine Halbfertigen    
* Immer nur getesteten Code uploaden    
* Wenn Compilation fehlgeschlagen ist nichts mehr einchecken   
* Beim Verlassen des Arbeitsplatzen (Ende des Tages) am Server wieder einchecken   

jkladfjlaksdfj
Wenn man alle Regeln so gut als möglich einhält, steht einer erfolgreichen Softwareentwicklung nichts mehr im Weg. Mit diesem Konzept der kontinuierlichen Integration der neuen Codeteile wird garantiert, dass Fehler so früh als möglich erkannt werden und sofort bereinigt werden können, um Kosten und Zeit zu sparen. Der *CI Server* führt alle Aufgaben automatisch aus, sodass sich der Entwickler nur mehr auf seine Hauptaufgabe, der Entwicklung neuer Module, widmen kann.