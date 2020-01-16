
# react-native-sh3h-weather

## Getting started

`$ npm install react-native-sh3h-weather --save`

### Mostly automatic installation

`$ react-native link react-native-sh3h-weather`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-sh3h-weather` and add `RNSh3hWeather.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNSh3hWeather.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.sh3h.weather.RNSh3hWeatherPackage;` to the imports at the top of the file
  - Add `new RNSh3hWeatherPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-sh3h-weather'
  	project(':react-native-sh3h-weather').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-sh3h-weather/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-sh3h-weather')
  	```


## Usage
```javascript
import RNSh3hWeather from 'react-native-sh3h-weather';

// TODO: What to do with the module?
RNSh3hWeather;
```
  