# mies-cljs-andoroid-js
Mies clojurescript integration into android-js framework

## Build and debug
### 1. Compiling clojurescript
Build your project once in dev mode with the following script and then open `index.html` in your browser.

    ./scripts/build

Doesn't works now, will works in future:
    ./scripts/watch
    ./scripts/release
    ./scripts/repl

### 2. install npm modules
1. run `npm install`

### 3. Debug app in browser
1. run `node .` for start backend emulator
2. open ./views/index.html in browser

### 3. Building android apk
1. run `npm run build`
2. target apk will be builded in ./dist directory

## License
MIT

## Author
Anatoly Starodubtsev
tostar74@mail.ru