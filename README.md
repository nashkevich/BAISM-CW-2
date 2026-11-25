# BAISM-CW-2

Prosta aplikacja Android (Kotlin) używana jako źródło kodu dla CI/CD w Bitrise.

- `PasswordValidator` – logika sprawdzania siły hasła
- `PasswordValidatorTest` – testy jednostkowe (JUnit)
- `bitrise.yml` – workflow `safe_build`: clone → unit testy → mobsfscan → build APK → deploy to bitrise.io

Lokalnie:

```bash
./gradlew testDebugUnitTest
./gradlew assembleDebug
```
