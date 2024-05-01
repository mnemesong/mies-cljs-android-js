# mies-cljs-andoroid-js

# THiS PROjECT IS DEPRECATED!!!
New version you may find at https://github.com/mnemesong/android-cljs

## Android-js API
https://android-js.github.io/docs/https://android-js.github.io/docs/


## Build and debug

### 1. install npm modules
1. run `npm install`

### 2. Compiling clojurescript
1. Compile your project once in dev mode with the following script `./scripts/build`
2. Run pre-build script `node ./pre-build`


### 3. Debug app in browser
1. run `node .` for start backend emulator
2. open ./views/index.html in your browser
3. client will socket-connect with node backend

### 4. Building android apk
1. run `npm run build`
2. target apk will be builded in ./dist directory


## Directories structure
- `/assets` - directory with assets and generated scripts
- `/dist` - directory for target APK files
- `/scripts` - directories with building scripts. Correct them for configuring building
- `/src` - directory with source paths
- `/target` - directory fot temp settings, mies-clojurescript needs
- `/views` - directory with html views


## License
MIT


## Author
Anatoly Starodubtsev
tostar74@mail.ru
