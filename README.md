# Groovy List.sum() Unexpected Behavior

This repository demonstrates an unexpected behavior of the `sum()` method in Groovy when applied to lists modified within a method. The issue is that calling `sum()` after modifying the list does not produce the expected result.

## Bug Description
The example code includes a list and a function that adds an element to that list. We expect that after the function modifies the list, calling `sum()` will yield the correct sum of the updated list.  However, this is not the case. The initial `sum()` call works as expected, but subsequent `sum()` calls after the list is modified within a function provide an inconsistent result.