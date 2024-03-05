package ge.tbc.testautomation.annotationsAndStreams;

public class Analyzable {
    @VariableNameAnnotation(name = "StrValue")
    private String strValue;
    @VariableNameAnnotation(name = "IntValue")
    private int IntValue;
    @VariableNameAnnotation(name = "")
    private String empty;
    @VariableNameAnnotation(name = "DoubleValue")
    private double doubleValue;
    @VariableNameAnnotation(name = "FloatValue")
    private float FloatValue;
    @VariableNameAnnotation(name = "CharValue")
    private char CharValue;
    @VariableNameAnnotation(name = "NonEqualValue")
    private String isnotEqual;
    @VariableNameAnnotation(name = "ByteValue")
    private byte ByteValue;
    @VariableNameAnnotation(name = "BooleanValue")
    private boolean BooleanValue;
}
