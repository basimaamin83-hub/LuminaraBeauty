**Maven (Exec plugin):**
```bash
mvn compile exec:java -Dexec.mainClass=com.mycompany.luminarabeauty.Main
```
**JAR on classpath (after compile):**
```bash
java -cp target/classes com.mycompany.luminarabeauty.Main
```
**NetBeans:** Open the project, right-click `Main.java` → **Run File**, or set `Main` as the main class in project properties if needed.
> **Note:** `pom.xml` may list a different `exec.mainClass`. If Maven fails to find the main class, use the commands above with `Main` explicitly.
## Usage (interactive)
When you run the app, it will prompt for:
1. Customer **name** and **phone**
2. **Number of products** (used with bundle pricing)
3. **Product size** (used to look up unit price)
Follow the on-screen prompts. Output includes order price in JD and informational messages for allergies and skin type in the demo section.
## License
This project is provided as-is for educational or portfolio use. Add a license file if you plan to distribute it.
