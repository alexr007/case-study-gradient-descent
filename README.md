# Case Study: Machine Learning by Gradient Descent

## Introduction

This case study looks at gradient descent, and the application of gradient descent to machine learning. We look at gradient descent from a programming, rather than mathematical, perspective. We'll start with a simple example that describes the problem we're trying to solve and how gradient descent can be used to solve it. We'll then look at three methods to compute gradients, the core of the problem:

- numerical differentiation;
- symbolic differentiation; and
- automatic differentiation.

[See the site for everything.](https://creativescala.github.io/case-study-gradient-descent)

## steps to run:

### 1. generate CSS

```shell
npx tailwindcss -i docs/css/creative-scala.css -o site/target/mdoc/creative-scala.css
```

### 2. compile + run web server

```shell
sbt docs/tlSitePreview
```

### 3. open site served in the browser

```shell
open http://localhost:4242
```