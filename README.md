
# react-native-realwear

## Getting started

`$ npm install react-native-realwear --save`

### Mostly automatic installation

`$ react-native link react-native-realwear`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-realwear` and add `RNRealWear.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNRealWear.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNRealWearPackage;` to the imports at the top of the file
  - Add `new RNRealWearPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-realwear'
  	project(':react-native-realwear').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-realwear/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-realwear')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNRealWear.sln` in `node_modules/react-native-realwear/windows/RNRealWear.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Real.Wear.RNRealWear;` to the usings at the top of the file
  - Add `new RNRealWearPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNRealWear from 'react-native-realwear';

// TODO: What to do with the module?
RNRealWear;
```
  
