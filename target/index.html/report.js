$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/Cookware.feature");
formatter.feature({
  "line": 1,
  "name": "Cookware",
  "description": "",
  "id": "cookware",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 2,
      "value": "#Author: Abhijeet Singh"
    }
  ],
  "line": 5,
  "name": "Checkout Tea Kettle and verify the cart is saved",
  "description": "",
  "id": "cookware;checkout-tea-kettle-and-verify-the-cart-is-saved",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user launchs \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user clicks on cookware link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "selects Tea kettles from the list of options",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user selects first Tea kettle product",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks on Add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks on Checkout button on the popup",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "click on Save for later",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "verify the product is saved",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "cookware;checkout-tea-kettle-and-verify-the-cart-is-saved;",
  "rows": [
    {
      "cells": [
        "url"
      ],
      "line": 16,
      "id": "cookware;checkout-tea-kettle-and-verify-the-cart-is-saved;;1"
    },
    {
      "cells": [
        "cookwareURL"
      ],
      "line": 17,
      "id": "cookware;checkout-tea-kettle-and-verify-the-cart-is-saved;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4596399900,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Checkout Tea Kettle and verify the cart is saved",
  "description": "",
  "id": "cookware;checkout-tea-kettle-and-verify-the-cart-is-saved;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user launchs \"cookwareURL\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user clicks on cookware link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "selects Tea kettles from the list of options",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user selects first Tea kettle product",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks on Add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks on Checkout button on the popup",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "click on Save for later",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "verify the product is saved",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "cookwareURL",
      "offset": 14
    }
  ],
  "location": "CookwareSD.user_launchs(String)"
});
formatter.result({
  "duration": 77077860800,
  "status": "passed"
});
formatter.match({
  "location": "CookwareSD.user_clicks_on_cookware_link()"
});
formatter.result({
  "duration": 155820300,
  "status": "passed"
});
formatter.match({
  "location": "CookwareSD.selects_Tea_kettles_from_the_list_of_options()"
});
formatter.result({
  "duration": 31411443100,
  "status": "passed"
});
formatter.match({
  "location": "CookwareSD.user_selects_first_Tea_kettle_product()"
});
formatter.result({
  "duration": 28994965700,
  "status": "passed"
});
formatter.match({
  "location": "CookwareSD.user_clicks_on_Add_to_cart()"
});
formatter.result({
  "duration": 185366100,
  "status": "passed"
});
formatter.match({
  "location": "CookwareSD.user_clicks_on_Checkout_button_on_the_popup()"
});
formatter.result({
  "duration": 20258946600,
  "status": "passed"
});
formatter.match({
  "location": "CookwareSD.click_on_Save_for_later()"
});
formatter.result({
  "duration": 54844973000,
  "status": "passed"
});
formatter.match({
  "location": "CookwareSD.verify_the_product_is_saved()"
});
formatter.result({
  "duration": 64775400,
  "status": "passed"
});
formatter.after({
  "duration": 864238000,
  "status": "passed"
});
});