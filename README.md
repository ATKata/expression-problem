Expression problem kata
=======================

This kata is about the expression problem: http://c2.com/cgi/wiki?ExpressionProblem

This project contains a Drawing class, which is made up of a series of shapes. The task is to consider how to extend the
shape classes with new functionality without violating separation of concerns.

The task
--------

The task is to implement toString() on the Drawing class in two different ways:

1. By implementing toString() on the various shape classes
2. Without modifying any of the classes in the shapes package (ie. consider how to avoid mixing concerns in the shape
   classes if we want to add the ability to render the shapes to a 2D canvas, or save to XML, or render using OpenGL or
   DirectX etc.)

toString() spec:

```
Drawing
-------
Circle [Centre = (1,2), Radius = 4]
Line [Start = (3,4), End = (5,6)]
Polygon [(0,0), (1,1), (2,2), (3,3)]
```