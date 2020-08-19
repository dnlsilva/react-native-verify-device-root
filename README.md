# react-native-verify-device-root

Verify device root for [React Native](https://github.com/facebook/react-native).

## Installation

Using npm:

```shell
npm install --save react-native-verify-device-root
```

or using yarn:

```shell
yarn add react-native-verify-device-root
```

## Linking (React Native >= 0.60 skip this as auto-linking should work)

#### Notes

> Work only on Android, open for pull requests.

## Usage
```javascript
import VerifyDeviceRoot from 'react-native-verify-device-root';

const root = await VerifyDeviceRoot.isRooted();

return true or false
```

### ©️ Open source - licence

Repository and contributions are under [GNU General Public License v3.0](https://github.com/GleidsonDaniel/transactions-manager/blob/develop/LICENSE)
