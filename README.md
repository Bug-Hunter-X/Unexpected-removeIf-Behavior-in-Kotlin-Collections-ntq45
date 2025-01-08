# Kotlin Collections: removeIf() Gotcha

This example demonstrates a potential unexpected behavior when using the `removeIf()` function on Kotlin's mutable collections (List, Set, Map).

The `removeIf()` method modifies the collection *in place*.  This can lead to subtle bugs if you're not aware of this side effect and expect it to return a new collection. The example shows that this operation is performed directly on the existing list, set, or map without creating a copy.

The provided solution offers alternative approaches to avoid unintended side effects.