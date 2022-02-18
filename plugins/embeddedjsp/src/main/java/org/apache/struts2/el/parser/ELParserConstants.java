/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/* Generated By:JJTree&JavaCC: Do not edit this line. ELParserConstants.java */
package org.apache.struts2.el.parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface ELParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int LITERAL_EXPRESSION = 1;
  /** RegularExpression Id. */
  int START_DYNAMIC_EXPRESSION = 2;
  /** RegularExpression Id. */
  int START_DEFERRED_EXPRESSION = 3;
  /** RegularExpression Id. */
  int INTEGER_LITERAL = 9;
  /** RegularExpression Id. */
  int FLOATING_POINT_LITERAL = 10;
  /** RegularExpression Id. */
  int EXPONENT = 11;
  /** RegularExpression Id. */
  int STRING_LITERAL = 12;
  /** RegularExpression Id. */
  int BADLY_ESCAPED_STRING_LITERAL = 13;
  /** RegularExpression Id. */
  int TRUE = 14;
  /** RegularExpression Id. */
  int FALSE = 15;
  /** RegularExpression Id. */
  int NULL = 16;
  /** RegularExpression Id. */
  int END_EXPRESSION = 17;
  /** RegularExpression Id. */
  int DOT = 18;
  /** RegularExpression Id. */
  int LPAREN = 19;
  /** RegularExpression Id. */
  int RPAREN = 20;
  /** RegularExpression Id. */
  int LBRACK = 21;
  /** RegularExpression Id. */
  int RBRACK = 22;
  /** RegularExpression Id. */
  int COLON = 23;
  /** RegularExpression Id. */
  int COMMA = 24;
  /** RegularExpression Id. */
  int GT0 = 25;
  /** RegularExpression Id. */
  int GT1 = 26;
  /** RegularExpression Id. */
  int LT0 = 27;
  /** RegularExpression Id. */
  int LT1 = 28;
  /** RegularExpression Id. */
  int GE0 = 29;
  /** RegularExpression Id. */
  int GE1 = 30;
  /** RegularExpression Id. */
  int LE0 = 31;
  /** RegularExpression Id. */
  int LE1 = 32;
  /** RegularExpression Id. */
  int EQ0 = 33;
  /** RegularExpression Id. */
  int EQ1 = 34;
  /** RegularExpression Id. */
  int NE0 = 35;
  /** RegularExpression Id. */
  int NE1 = 36;
  /** RegularExpression Id. */
  int NOT0 = 37;
  /** RegularExpression Id. */
  int NOT1 = 38;
  /** RegularExpression Id. */
  int AND0 = 39;
  /** RegularExpression Id. */
  int AND1 = 40;
  /** RegularExpression Id. */
  int OR0 = 41;
  /** RegularExpression Id. */
  int OR1 = 42;
  /** RegularExpression Id. */
  int EMPTY = 43;
  /** RegularExpression Id. */
  int INSTANCEOF = 44;
  /** RegularExpression Id. */
  int MULT = 45;
  /** RegularExpression Id. */
  int PLUS = 46;
  /** RegularExpression Id. */
  int MINUS = 47;
  /** RegularExpression Id. */
  int QUESTIONMARK = 48;
  /** RegularExpression Id. */
  int DIV0 = 49;
  /** RegularExpression Id. */
  int DIV1 = 50;
  /** RegularExpression Id. */
  int MOD0 = 51;
  /** RegularExpression Id. */
  int MOD1 = 52;
  /** RegularExpression Id. */
  int IDENTIFIER = 53;
  /** RegularExpression Id. */
  int FUNCTIONSUFFIX = 54;
  /** RegularExpression Id. */
  int IMPL_OBJ_START = 55;
  /** RegularExpression Id. */
  int LETTER = 56;
  /** RegularExpression Id. */
  int DIGIT = 57;
  /** RegularExpression Id. */
  int ILLEGAL_CHARACTER = 58;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int IN_EXPRESSION = 1;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "<LITERAL_EXPRESSION>",
    "\"${\"",
    "\"#{\"",
    "\"\\\\\"",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "<INTEGER_LITERAL>",
    "<FLOATING_POINT_LITERAL>",
    "<EXPONENT>",
    "<STRING_LITERAL>",
    "<BADLY_ESCAPED_STRING_LITERAL>",
    "\"true\"",
    "\"false\"",
    "\"null\"",
    "\"}\"",
    "\".\"",
    "\"(\"",
    "\")\"",
    "\"[\"",
    "\"]\"",
    "\":\"",
    "\",\"",
    "\">\"",
    "\"gt\"",
    "\"<\"",
    "\"lt\"",
    "\">=\"",
    "\"ge\"",
    "\"<=\"",
    "\"le\"",
    "\"==\"",
    "\"eq\"",
    "\"!=\"",
    "\"ne\"",
    "\"!\"",
    "\"not\"",
    "\"&&\"",
    "\"and\"",
    "\"||\"",
    "\"or\"",
    "\"empty\"",
    "\"instanceof\"",
    "\"*\"",
    "\"+\"",
    "\"-\"",
    "\"?\"",
    "\"/\"",
    "\"div\"",
    "\"%\"",
    "\"mod\"",
    "<IDENTIFIER>",
    "<FUNCTIONSUFFIX>",
    "\"#\"",
    "<LETTER>",
    "<DIGIT>",
    "<ILLEGAL_CHARACTER>",
  };

}
