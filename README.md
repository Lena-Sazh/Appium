### QA Guru / HW №22
#### Mobile test automation examples with Appium
___

### Simple mobile tests for [Wikipedia Android App](https://www.wikipedia.org/)

<!--
## :hammer_and_wrench: Project stack

<code><img height="50" title="Java" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Java.svg"></code>
<code><img height="50" title="JUnit 5" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/JUnit5.svg"></code>
<code><img height="50" title="Gradle" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Gradle.svg"></code>
<code><img height="50" title="Rest-Assured" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Rest-Assured.svg"></code>
<code><img height="50" title="Allure Report" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Allure_Report.svg"></code>
<code><img height="50" title="Rest-Assured" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Browserstack.svg"></code>
<code><img height="50" title="Allure Report" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Appium.svg"></code>

___

### :heavy_check_mark: Implemented API tests
  
* **Requests:**
  - GET
  - POST
  - PUT
  - PATCH
  - DELETE

* **Responses:**
  - 200
  - 201
  - 204
  - 400
  - 404

 * **Demo Web Shop:**
   - Authorization
   - Addind item to cart with cookie

___

### :gear: Run in Terminal

```bash
gradle clean test
```
-->
___

#### System setup:

1. <a href="https://developer.android.com/studio">Download </a> Android Studio and install

2. Set system path:

* Windows:
```
%ANDROID_HOME%\tools

%ANDROID_HOME%\tools\bin

%ANDROID_HOME%\platform-tools
```

* Mac:
```
$ANDROID_HOME/tools

$ANDROID_HOME/tools/bin

$ANDROID_HOME/platform-tools
```

3. <a href="https://github.com/appium/appium-desktop">Download </a> Appium Desktop and install

4. In Android Studio -> SDK Manager download Android 11

5. In Android Studio -> AVD Manager download Pixel 4 for Android 11

6. Start server session in Appium Desktop and create connection to emulator by passing capabilities
```
platformName=Android
deviceName=(name)
```
