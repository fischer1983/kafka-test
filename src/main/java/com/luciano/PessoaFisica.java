/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.luciano;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class PessoaFisica extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1835660652391019956L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PessoaFisica\",\"namespace\":\"com.luciano\",\"fields\":[{\"name\":\"cpf_cnpj_pessoa\",\"type\":\"string\"},{\"name\":\"nome\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"sexo\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"data_nascimento\",\"type\":[\"null\",{\"type\":\"int\",\"connect.version\":1,\"connect.name\":\"org.apache.kafka.connect.data.Date\",\"logicalType\":\"date\"}],\"default\":null},{\"name\":\"data_ultima_alteracao\",\"type\":{\"type\":\"long\",\"connect.version\":1,\"connect.name\":\"org.apache.kafka.connect.data.Timestamp\",\"logicalType\":\"timestamp-millis\"}}],\"connect.name\":\"com.luciano.PessoaFisica\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<PessoaFisica> ENCODER =
      new BinaryMessageEncoder<PessoaFisica>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<PessoaFisica> DECODER =
      new BinaryMessageDecoder<PessoaFisica>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<PessoaFisica> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<PessoaFisica> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<PessoaFisica>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this PessoaFisica to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a PessoaFisica from a ByteBuffer. */
  public static PessoaFisica fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence cpf_cnpj_pessoa;
  @Deprecated public java.lang.CharSequence nome;
  @Deprecated public java.lang.CharSequence sexo;
  @Deprecated public org.joda.time.LocalDate data_nascimento;
  @Deprecated public org.joda.time.DateTime data_ultima_alteracao;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public PessoaFisica() {}

  /**
   * All-args constructor.
   * @param cpf_cnpj_pessoa The new value for cpf_cnpj_pessoa
   * @param nome The new value for nome
   * @param sexo The new value for sexo
   * @param data_nascimento The new value for data_nascimento
   * @param data_ultima_alteracao The new value for data_ultima_alteracao
   */
  public PessoaFisica(java.lang.CharSequence cpf_cnpj_pessoa, java.lang.CharSequence nome, java.lang.CharSequence sexo, org.joda.time.LocalDate data_nascimento, org.joda.time.DateTime data_ultima_alteracao) {
    this.cpf_cnpj_pessoa = cpf_cnpj_pessoa;
    this.nome = nome;
    this.sexo = sexo;
    this.data_nascimento = data_nascimento;
    this.data_ultima_alteracao = data_ultima_alteracao;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return cpf_cnpj_pessoa;
    case 1: return nome;
    case 2: return sexo;
    case 3: return data_nascimento;
    case 4: return data_ultima_alteracao;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  protected static final org.apache.avro.data.TimeConversions.DateConversion DATE_CONVERSION = new org.apache.avro.data.TimeConversions.DateConversion();
  protected static final org.apache.avro.data.TimeConversions.TimeConversion TIME_CONVERSION = new org.apache.avro.data.TimeConversions.TimeConversion();
  protected static final org.apache.avro.data.TimeConversions.TimestampConversion TIMESTAMP_CONVERSION = new org.apache.avro.data.TimeConversions.TimestampConversion();
  protected static final org.apache.avro.Conversions.DecimalConversion DECIMAL_CONVERSION = new org.apache.avro.Conversions.DecimalConversion();

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      null,
      null,
      null,
      null,
      TIMESTAMP_CONVERSION,
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: cpf_cnpj_pessoa = (java.lang.CharSequence)value$; break;
    case 1: nome = (java.lang.CharSequence)value$; break;
    case 2: sexo = (java.lang.CharSequence)value$; break;
    case 3: data_nascimento = null ; break;
    case 4: data_ultima_alteracao = (org.joda.time.DateTime)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'cpf_cnpj_pessoa' field.
   * @return The value of the 'cpf_cnpj_pessoa' field.
   */
  public java.lang.CharSequence getCpfCnpjPessoa() {
    return cpf_cnpj_pessoa;
  }

  /**
   * Sets the value of the 'cpf_cnpj_pessoa' field.
   * @param value the value to set.
   */
  public void setCpfCnpjPessoa(java.lang.CharSequence value) {
    this.cpf_cnpj_pessoa = value;
  }

  /**
   * Gets the value of the 'nome' field.
   * @return The value of the 'nome' field.
   */
  public java.lang.CharSequence getNome() {
    return nome;
  }

  /**
   * Sets the value of the 'nome' field.
   * @param value the value to set.
   */
  public void setNome(java.lang.CharSequence value) {
    this.nome = value;
  }

  /**
   * Gets the value of the 'sexo' field.
   * @return The value of the 'sexo' field.
   */
  public java.lang.CharSequence getSexo() {
    return sexo;
  }

  /**
   * Sets the value of the 'sexo' field.
   * @param value the value to set.
   */
  public void setSexo(java.lang.CharSequence value) {
    this.sexo = value;
  }

  /**
   * Gets the value of the 'data_nascimento' field.
   * @return The value of the 'data_nascimento' field.
   */
  public org.joda.time.LocalDate getDataNascimento() {
    return data_nascimento;
  }

  /**
   * Sets the value of the 'data_nascimento' field.
   * @param value the value to set.
   */
  public void setDataNascimento(org.joda.time.LocalDate value) {
    this.data_nascimento = value;
  }

  /**
   * Gets the value of the 'data_ultima_alteracao' field.
   * @return The value of the 'data_ultima_alteracao' field.
   */
  public org.joda.time.DateTime getDataUltimaAlteracao() {
    return data_ultima_alteracao;
  }

  /**
   * Sets the value of the 'data_ultima_alteracao' field.
   * @param value the value to set.
   */
  public void setDataUltimaAlteracao(org.joda.time.DateTime value) {
    this.data_ultima_alteracao = value;
  }

  /**
   * Creates a new PessoaFisica RecordBuilder.
   * @return A new PessoaFisica RecordBuilder
   */
  public static com.luciano.PessoaFisica.Builder newBuilder() {
    return new com.luciano.PessoaFisica.Builder();
  }

  /**
   * Creates a new PessoaFisica RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new PessoaFisica RecordBuilder
   */
  public static com.luciano.PessoaFisica.Builder newBuilder(com.luciano.PessoaFisica.Builder other) {
    return new com.luciano.PessoaFisica.Builder(other);
  }

  /**
   * Creates a new PessoaFisica RecordBuilder by copying an existing PessoaFisica instance.
   * @param other The existing instance to copy.
   * @return A new PessoaFisica RecordBuilder
   */
  public static com.luciano.PessoaFisica.Builder newBuilder(com.luciano.PessoaFisica other) {
    return new com.luciano.PessoaFisica.Builder(other);
  }

  /**
   * RecordBuilder for PessoaFisica instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PessoaFisica>
    implements org.apache.avro.data.RecordBuilder<PessoaFisica> {

    private java.lang.CharSequence cpf_cnpj_pessoa;
    private java.lang.CharSequence nome;
    private java.lang.CharSequence sexo;
    private org.joda.time.LocalDate data_nascimento;
    private org.joda.time.DateTime data_ultima_alteracao;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.luciano.PessoaFisica.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.cpf_cnpj_pessoa)) {
        this.cpf_cnpj_pessoa = data().deepCopy(fields()[0].schema(), other.cpf_cnpj_pessoa);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nome)) {
        this.nome = data().deepCopy(fields()[1].schema(), other.nome);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.sexo)) {
        this.sexo = data().deepCopy(fields()[2].schema(), other.sexo);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.data_nascimento)) {
        this.data_nascimento = data().deepCopy(fields()[3].schema(), other.data_nascimento);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.data_ultima_alteracao)) {
        this.data_ultima_alteracao = data().deepCopy(fields()[4].schema(), other.data_ultima_alteracao);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing PessoaFisica instance
     * @param other The existing instance to copy.
     */
    private Builder(com.luciano.PessoaFisica other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.cpf_cnpj_pessoa)) {
        this.cpf_cnpj_pessoa = data().deepCopy(fields()[0].schema(), other.cpf_cnpj_pessoa);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nome)) {
        this.nome = data().deepCopy(fields()[1].schema(), other.nome);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.sexo)) {
        this.sexo = data().deepCopy(fields()[2].schema(), other.sexo);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.data_nascimento)) {
        this.data_nascimento = data().deepCopy(fields()[3].schema(), other.data_nascimento);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.data_ultima_alteracao)) {
        this.data_ultima_alteracao = data().deepCopy(fields()[4].schema(), other.data_ultima_alteracao);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'cpf_cnpj_pessoa' field.
      * @return The value.
      */
    public java.lang.CharSequence getCpfCnpjPessoa() {
      return cpf_cnpj_pessoa;
    }

    /**
      * Sets the value of the 'cpf_cnpj_pessoa' field.
      * @param value The value of 'cpf_cnpj_pessoa'.
      * @return This builder.
      */
    public com.luciano.PessoaFisica.Builder setCpfCnpjPessoa(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.cpf_cnpj_pessoa = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'cpf_cnpj_pessoa' field has been set.
      * @return True if the 'cpf_cnpj_pessoa' field has been set, false otherwise.
      */
    public boolean hasCpfCnpjPessoa() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'cpf_cnpj_pessoa' field.
      * @return This builder.
      */
    public com.luciano.PessoaFisica.Builder clearCpfCnpjPessoa() {
      cpf_cnpj_pessoa = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'nome' field.
      * @return The value.
      */
    public java.lang.CharSequence getNome() {
      return nome;
    }

    /**
      * Sets the value of the 'nome' field.
      * @param value The value of 'nome'.
      * @return This builder.
      */
    public com.luciano.PessoaFisica.Builder setNome(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.nome = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'nome' field has been set.
      * @return True if the 'nome' field has been set, false otherwise.
      */
    public boolean hasNome() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'nome' field.
      * @return This builder.
      */
    public com.luciano.PessoaFisica.Builder clearNome() {
      nome = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'sexo' field.
      * @return The value.
      */
    public java.lang.CharSequence getSexo() {
      return sexo;
    }

    /**
      * Sets the value of the 'sexo' field.
      * @param value The value of 'sexo'.
      * @return This builder.
      */
    public com.luciano.PessoaFisica.Builder setSexo(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.sexo = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'sexo' field has been set.
      * @return True if the 'sexo' field has been set, false otherwise.
      */
    public boolean hasSexo() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'sexo' field.
      * @return This builder.
      */
    public com.luciano.PessoaFisica.Builder clearSexo() {
      sexo = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'data_nascimento' field.
      * @return The value.
      */
    public org.joda.time.LocalDate getDataNascimento() {
      return data_nascimento;
    }

    /**
      * Sets the value of the 'data_nascimento' field.
      * @param value The value of 'data_nascimento'.
      * @return This builder.
      */
    public com.luciano.PessoaFisica.Builder setDataNascimento(org.joda.time.LocalDate value) {
      validate(fields()[3], value);
      this.data_nascimento = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'data_nascimento' field has been set.
      * @return True if the 'data_nascimento' field has been set, false otherwise.
      */
    public boolean hasDataNascimento() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'data_nascimento' field.
      * @return This builder.
      */
    public com.luciano.PessoaFisica.Builder clearDataNascimento() {
      data_nascimento = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'data_ultima_alteracao' field.
      * @return The value.
      */
    public org.joda.time.DateTime getDataUltimaAlteracao() {
      return data_ultima_alteracao;
    }

    /**
      * Sets the value of the 'data_ultima_alteracao' field.
      * @param value The value of 'data_ultima_alteracao'.
      * @return This builder.
      */
    public com.luciano.PessoaFisica.Builder setDataUltimaAlteracao(org.joda.time.DateTime value) {
      validate(fields()[4], value);
      this.data_ultima_alteracao = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'data_ultima_alteracao' field has been set.
      * @return True if the 'data_ultima_alteracao' field has been set, false otherwise.
      */
    public boolean hasDataUltimaAlteracao() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'data_ultima_alteracao' field.
      * @return This builder.
      */
    public com.luciano.PessoaFisica.Builder clearDataUltimaAlteracao() {
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public PessoaFisica build() {
      try {
        PessoaFisica record = new PessoaFisica();
        record.cpf_cnpj_pessoa = fieldSetFlags()[0] ? this.cpf_cnpj_pessoa : (java.lang.CharSequence) defaultValue(fields()[0], record.getConversion(0));
        record.nome = fieldSetFlags()[1] ? this.nome : (java.lang.CharSequence) defaultValue(fields()[1], record.getConversion(1));
        record.sexo = fieldSetFlags()[2] ? this.sexo : (java.lang.CharSequence) defaultValue(fields()[2], record.getConversion(2));
        record.data_nascimento = fieldSetFlags()[3] ? this.data_nascimento : (org.joda.time.LocalDate) defaultValue(fields()[3], record.getConversion(3));
        record.data_ultima_alteracao = fieldSetFlags()[4] ? this.data_ultima_alteracao : (org.joda.time.DateTime) defaultValue(fields()[4], record.getConversion(4));
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<PessoaFisica>
    WRITER$ = (org.apache.avro.io.DatumWriter<PessoaFisica>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<PessoaFisica>
    READER$ = (org.apache.avro.io.DatumReader<PessoaFisica>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
