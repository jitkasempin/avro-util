/*
 * Copyright 2018 LinkedIn Corp.
 * Licensed under the BSD 2-Clause License (the "License"). 
 * See License in the project root for license information.
 */

package com.acme.generatedbylatest;

import com.linkedin.avro.compatibility.AvroCompatibilityHelper;


//this is code generated by the migration helper running under 1.8 with the compatibility option
@SuppressWarnings("all")
@org.apache.avro.specific.FixedSize(16)
// @org.apache.avro.specific.AvroGenerated
public class Guid extends org.apache.avro.specific.SpecificFixed {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"fixed\",\"name\":\"Guid\",\"namespace\":\"com.acme\",\"size\":16}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  /** Creates a new Guid */
  public Guid() {
    super();
  }

  /** Creates a new Guid with the given bytes */
  public Guid(byte[] bytes) {
    super();
    bytes(bytes);
  }

  private static final org.apache.avro.io.DatumWriter
      WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  public void writeExternal(java.io.ObjectOutput out)
      throws java.io.IOException {
    WRITER$.write(this, AvroCompatibilityHelper.newBinaryEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
      READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  public void readExternal(java.io.ObjectInput in)
      throws java.io.IOException {
    READER$.read(this, AvroCompatibilityHelper.newBinaryDecoder(in));
  }
}