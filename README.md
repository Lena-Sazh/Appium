<p align="right">
<a href="https://visitor-badge-reloaded.herokuapp.com/badge?page_id=Lena-sazh.Rest-Assured&color=8900FF&style=plastic&logo=Github&text=Hello_Visitors!">
  <img src="https://visitor-badge-reloaded.herokuapp.com/badge?page_id=Lena-sazh.Rest-Assured&color=8900FF&style=plastic&logo=Github&text=Hello_Visitors!"/>
</a>
</p>

### QA Guru / HW №22
#### Mobile test automation examples with Appium
___

### Simple mobile tests for [Wikipedia Android App](https://www.wikipedia.org/)


### :hammer_and_wrench: Project stack

<code><img height="50" title="Java" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Java.svg"></code>
<code><img height="50" title="JUnit 5" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/JUnit5.svg"></code>
<code><img height="50" title="JUnit 5" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Selenide.svg"></code>
<code><img height="50" title="Gradle" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Gradle.svg"></code>
<code><img height="50" title="Rest-Assured" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Rest-Assured.svg"></code>
<code><img height="50" title="Allure Report" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Allure_Report.svg"></code>
<code><img height="50" title="Rest-Assured" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Browserstack.svg"></code>
<code><img height="50" title="Allure Report" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Appium.svg"></code>
<code><img height="50" title="Allure Report" src="https://github.com/Lena-Sazh/Lena-Sazh/blob/main/src/test/resources/logo/Selenoid.svg"></code>
___

### :heavy_check_mark: Implemented tests
  
* Search by keyword
* Settings screen check
* About section check
* Onboarding screens checks

___

### :gear: Run in Terminal each command depends on host

```bash
gradle clean task selenoid_android -DdeviceHost=selenoid

gradle clean task hardware_android -DdeviceHost=hardware

gradle clean task emulator_android -DdeviceHost=emulator

gradle clean task browserstack_android -DdeviceHost=browserstack
```
___

### :camera_flash: Test on Pixel 4 emulator

Appium desktop runs tests on device emulator

![Appium Inspector](https://github.com/Lena-Sazh/Appium/blob/master/src/test/resources/img/AppiumInspector.png)
![Emulator Test](https://github.com/Lena-Sazh/Appium/blob/master/src/test/resources/img/EmulatorTest.png)

### :camera_flash: Test on real device

Appium desktop runs tests on real device and we can see the device is under control by Appium Settings App

<code><img height="600" title="Real device Test" src="https://github.com/Lena-Sazh/Appium/blob/master/src/test/resources/img/HardwareTest2.jpg"></code>
<code><img height="600" title="Real device Test" src="https://github.com/Lena-Sazh/Appium/blob/master/src/test/resources/img/HardwareTest.jpg"></code>

### :ballot_box_with_check: System setup

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
deviceName=Pixel_4_API_30
```
