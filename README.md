# syn-antd

### NEWS: support for antd v4 RC1 is here!

[![Clojars Project](https://img.shields.io/clojars/v/syn-antd.svg)](https://clojars.org/syn-antd)

A [shadow-cljs](http://shadow-cljs.org/) friendly [reagent](https://github.com/reagent-project/reagent) wrapper around [Ant Design](https://ant.design/docs/react/introduce) components.

[Demo pages](https://synqrinus.gitlab.io/syn-antd)

For migration to antd v4 please read the [Changelog](https://gitlab.com/synqrinus/syn-antd/blob/master/CHANGELOG.md) and [antd migration guide](https://next.ant.design/docs/react/migration-v4)

## Purpose

Using cljsjs antd leads to bloated compiled JS file since antd is a very large library with many UI components, of which you likely only need a subset.

If antd components are properly referenced, shadow-cljs helps handle the tree-shaking, reducing your package size to only the components you use.

syn-antd writes all the boilerplate for you and leaves you with tree shaking-friendly, shadow-cljs ready namespaces to require in and use in your application.

## Using

1. Add to your dependencies the latest version (see badge at top)
2. Add the version of ant design you're targeting to your `shadow-cljs.edn`
3. Make sure you reference the appropriate antd css file somewhere in your HTML
4. Reference the namespace you need and use as a standard Reagent component

### Using with re-frame

Very fast typing, or slow rendering, can cause cursor jumping when managing input field state via re-frame. To avoid this, you have to synchronously trigger re-frame events, i.e. `re-frame/dispatch-sync` instead of `re-frame/dispatch`.

## Some syn-antd unique features

### ant-options

Populating options can be a bit of a chore with antd. We've tried to make this a bit simpler via ant-options. Here is an example usage below.

```clojure
[select/select
  {:allow-clear true
   :mode        "multiple"
   :placeholder "My placeholder text"
   :on-change   (fn [selected]
                  (dispatch [:editor/my-update-fn selected]))
   :value       @my-selected-value}
  (select/ant-options
    {:options  @my-options
     :id-fn    :what-an-id
     :label-fn :name})]
```

ant-options receives three possible keys: `:options`, `:id-fn`, `:label-fn`. `:options` is a required collection of options to populate, and `:id-fn` and `:label-fn` are optionally used to extract the labels and ids of the options.

### dataSource caveat

Any references to `dataSource` in the antd docs **must** follow the formatting convention. Whereas for many other keys you can use kebab-case, you **must** use camel case for `dataSource` to work properly.

## Building

To build for a new version of Ant Design.

1. Update the `user/ant` map
2. Run a REPL and execute `(gen-factories!)`
3. Deploy accordingly

## Themeing

1. `npm install antd`
2. `npm install -g less-plugin-clean-css` (if not exists)
3. Create your theme in `/less`. See current folder for working example of synqrinus-theme
4. Execute `lessc --js less/antd.main.less > <YOUR THEME>-antd.css --clean-css`

## Babel optimizations (antd v4+)

With antd v4 we can apply some straightforward tree shaking through Babel.

To do so, update your `package.json` as follows:

- Add `@babel/cli`
- Add `@babel/core`
- Add `babel-plugin-transform-imports`
- Add a cleaning script for convenience

Here's an example of the configuration:

```json
... more config
  "devDependencies": {
    "shadow-cljs": "^2.8.83",
    "@babel/cli": "^7.0.0",
    "@babel/core": "^7.0.0",
    "babel-plugin-transform-imports": "^2.0.0"
  },
  "scripts": {
    "clean-antd": "./node_modules/.bin/babel ./node_modules/antd/es --out-dir ./node_modules/antd/es"
  },
... more config
```

Create a babel.config.js with the following contents:

```js
module.exports = {
    plugins: [
        [require('babel-plugin-transform-imports'), {
            "@ant-design/icons": {
                "transform": "@ant-design/icons/es/icons/${member}",
                "preventFullImport": true
            }
        }]
    ]
}
```

## Example Project with Themeing and Babel

For an skeleton example setup with ant design, take a look at the **example_setup** directory in this project.

To run shadow-cljs in this setup, you execute the `./shadow` bash script. For example:

```shell script
./shadow watch app
```

Note: This is merely a skeleton, you should copy over the contents, as needed, to your project. You will separately need to set up shadow-cljs, etc.  

## Contributing

syn-antd is pretty bare-bones and doesn't need to have many more bells-and-whistles in my opinion, but I'm still very happy to receive contributions. 

PRs are welcome for any **additional wrappers to antd** that are missing, as well as any **example projects** that use syn-antd and show users how to get it started with shadow-cljs.

We also welcome **bug fixes** for any custom elements to syn-antd such as `ant-options`, as well as suggestions or PRs for new custom elements. That said, the goal is to minimize the amount of custom utilities present in this library. Any major quality of life improvements will be accepted, but others are encouraged to go in a separate library

## License

Copyright © 2019-2020 Synqrinus

Distributed under the [MIT License](https://opensource.org/licenses/MIT).