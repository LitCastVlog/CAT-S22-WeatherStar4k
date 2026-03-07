android web wrapper for [NetByMatt's WeatherStar4000 web port](https://github.com/netbymatt/ws4kp), designed for CAT/Unifone S22 Flip's external display, no root needed. 

<img src="./screenshots/externalscreen.gif" width="50%"/>
<img src="./screenshots/screenshot.jpg" width="50%"/>

## Installation
build using [Android Studio](https://developer.android.com/studio) API 30 (android 11+) or try [experimental debug apk](https://github.com/LitCastVlog/CAT-S22-WeatherStar4k/releases/tag/v1.0) in releases (will prompt for KIOSK URL on first launch, clear app data to reset url)

- use volume key to initiate external screen video (same as VLC, haven't figured out complete autoplay yet)
- external display works while app is in background
- dpad content navigation (while screen opened)
### Grab [KIOSK permashare URL](https://github.com/netbymatt/ws4kp?tab=readme-ov-file#kiosk-mode) from [NetByMatt's WeatherStar4000 web port or selfhosted url](https://github.com/netbymatt/ws4kp) 
- (for locations outside US, use [mwood77's ws4kp-intl](https://github.com/mwood77/ws4kp-international))
<img src="./screenshots/urlprompt.jpg" width="50%"/>

you could also theoretically use this for any url, but a static/animated page like above works best (uses basic android webview)

## code
###### build using [Android Studio](https://developer.android.com/studio) API 30 (android 11+) 

- [MainActivity.kt](/app/src/main/java/com/litcast/ws4kp/MainActivity.kt) is the main config 
- [WeatherPresentation.kt](app/src/main/java/com/litcast/ws4kp/WeatherPresentation.kt) is the external screen config
 
  you can replace the prompt with direct urls there if preferred
