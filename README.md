FbLogin

### Libraries
- Android Studio
    - Gradle
- Android SDK
    - Build SDK version: 20
    - Build tools version: 20
    - Minimin SDK version: 14
    - Target SDK version: 20
- Facebook SDK
    - version 3.18.1


### How to Use
You should fill Facebook App ID in res/values/strings.xml

### already recognized Issues
- gradle.propertiesのANDROID_BUILD_SDK_VERSION をapp/build.gradle#compileSdkVersionに設定するとSDKが見つからずエラーになる
    - 理由は不明


- Other Libraries
    - Volley (Android HTTP Connection Library)
        - http://developer.android.com/training/volley/index.html