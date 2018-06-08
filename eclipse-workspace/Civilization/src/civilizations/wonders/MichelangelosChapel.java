/*//  (version 1.8 : 52.0, super bit)
public class javax.swing.JTextArea extends javax.swing.text.JTextComponent {
  
  // Field descriptor #53 Ljava/lang/String;
  private static final java.lang.String uiClassID = "TextAreaUI";
  
  // Field descriptor #50 I
  private int rows;
  
  // Field descriptor #50 I
  private int columns;
  
  // Field descriptor #50 I
  private int columnWidth;
  
  // Field descriptor #50 I
  private int rowHeight;
  
  // Field descriptor #58 Z
  private boolean wrap;
  
  // Field descriptor #58 Z
  private boolean word;
  
  // Method descriptor #26 ()V
  // Stack: 5, Locals: 1
  public JTextArea();
    0  aload_0 [this]
    1  aconst_null
    2  aconst_null
    3  iconst_0
    4  iconst_0
    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
    8  return

  
  // Method descriptor #37 (Ljava/lang/String;)V
  // Stack: 5, Locals: 2
  public JTextArea(java.lang.String arg0);
    0  aload_0 [this]
    1  aconst_null
    2  aload_1 [arg0]
    3  iconst_0
    4  iconst_0
    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
    8  return

  
  // Method descriptor #32 (II)V
  // Stack: 5, Locals: 3
  public JTextArea(int arg0, int arg1);
    0  aload_0 [this]
    1  aconst_null
    2  aconst_null
    3  iload_1 [arg0]
    4  iload_2 [arg1]
    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
    8  return

  
  // Method descriptor #202 (Ljava/lang/String;II)V
  // Stack: 5, Locals: 4
  public JTextArea(java.lang.String arg0, int arg1, int arg2);
    0  aload_0 [this]
    1  aconst_null
    2  aload_1 [arg0]
    3  iload_2 [arg1]
    4  iload_3 [arg2]
    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
    8  return

  
  // Method descriptor #212 (Ljavax/swing/text/Document;)V
  // Stack: 5, Locals: 2
  public JTextArea(javax.swing.text.Document arg0);
    0  aload_0 [this]
    1  aload_1 [arg0]
    2  aconst_null
    3  iconst_0
    4  iconst_0
    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
    8  return

  
  // Method descriptor #216 (Ljavax/swing/text/Document;Ljava/lang/String;II)V
  // Stack: 4, Locals: 5
  public JTextArea(javax.swing.text.Document arg0, java.lang.String arg1, int arg2, int arg3);
      0  aload_0 [this]
      1  invokespecial javax.swing.text.JTextComponent() [345]
      4  aload_0 [this]
      5  iload_3 [arg2]
      6  putfield javax.swing.JTextArea.rows : int [300]
      9  aload_0 [this]
     10  iload 4 [arg3]
     12  putfield javax.swing.JTextArea.columns : int [298]
     15  aload_1 [arg0]
     16  ifnonnull 24
     19  aload_0 [this]
     20  invokevirtual javax.swing.JTextArea.createDefaultModel() : javax.swing.text.Document [334]
     23  astore_1 [arg0]
     24  aload_0 [this]
     25  aload_1 [arg0]
     26  invokevirtual javax.swing.JTextArea.setDocument(javax.swing.text.Document) : void [336]
     29  aload_2 [arg1]
     30  ifnull 44
     33  aload_0 [this]
     34  aload_2 [arg1]
     35  invokevirtual javax.swing.JTextArea.setText(java.lang.String) : void [331]
     38  aload_0 [this]
     39  iconst_0
     40  iconst_0
     41  invokevirtual javax.swing.JTextArea.select(int, int) : void [327]
     44  iload_3 [arg2]
     45  ifge 75
     48  new java.lang.IllegalArgumentException [177]
     51  dup
     52  new java.lang.StringBuilder [181]
     55  dup
     56  invokespecial java.lang.StringBuilder() [314]
     59  ldc <String "rows: "> [20]
     61  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
     64  iload_3 [arg2]
     65  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
     68  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
     71  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
     74  athrow
     75  iload 4 [arg3]
     77  ifge 108
     80  new java.lang.IllegalArgumentException [177]
     83  dup
     84  new java.lang.StringBuilder [181]
     87  dup
     88  invokespecial java.lang.StringBuilder() [314]
     91  ldc <String "columns: "> [13]
     93  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
     96  iload 4 [arg3]
     98  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
    101  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
    104  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
    107  athrow
    108  aload_0 [this]
    109  ldc <String "focusTraversalKeysForward"> [17]
    111  invokestatic javax.swing.JComponent.getManagingFocusForwardTraversalKeys() : java.util.Set [319]
    114  invokestatic javax.swing.LookAndFeel.installProperty(javax.swing.JComponent, java.lang.String, java.lang.Object) : void [340]
    117  aload_0 [this]
    118  ldc <String "focusTraversalKeysBackward"> [16]
    120  invokestatic javax.swing.JComponent.getManagingFocusBackwardTraversalKeys() : java.util.Set [318]
    123  invokestatic javax.swing.LookAndFeel.installProperty(javax.swing.JComponent, java.lang.String, java.lang.Object) : void [340]
    126  return
    Stack map table: number of frames 4
        [pc: 24, full, stack: {}, locals: {javax.swing.JTextArea, javax.swing.text.Document, java.lang.String, int, int}]
        [pc: 44, same]
        [pc: 75, same]
        [pc: 108, same]
  
  // Method descriptor #25 ()Ljava/lang/String;
  // Stack: 1, Locals: 1
  public java.lang.String getUIClassID();
    0  ldc <String "TextAreaUI"> [11]
    2  areturn

  
  // Method descriptor #211 ()Ljavax/swing/text/Document;
  // Stack: 2, Locals: 1
  protected javax.swing.text.Document createDefaultModel();
    0  new javax.swing.text.PlainDocument [192]
    3  dup
    4  invokespecial javax.swing.text.PlainDocument() [351]
    7  areturn

  
  // Method descriptor #30 (I)V
  // Stack: 4, Locals: 4
  public void setTabSize(int arg0);
     0  aload_0 [this]
     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
     4  astore_2
     5  aload_2
     6  ifnull 34
     9  aload_0 [this]
    10  invokevirtual javax.swing.JTextArea.getTabSize() : int [325]
    13  istore_3
    14  aload_2
    15  ldc <String "tabSize"> [21]
    17  iload_1 [arg0]
    18  invokestatic java.lang.Integer.valueOf(int) : java.lang.Integer [311]
    21  invokeinterface javax.swing.text.Document.putProperty(java.lang.Object, java.lang.Object) : void [356] [nargs: 3]
    26  aload_0 [this]
    27  ldc <String "tabSize"> [21]
    29  iload_3
    30  iload_1 [arg0]
    31  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, int, int) : void [332]
    34  return
    Stack map table: number of frames 1
        [pc: 34, append: {javax.swing.text.Document}]
  
  // Method descriptor #24 ()I
  // Stack: 2, Locals: 4
  public int getTabSize();
     0  bipush 8
     2  istore_1
     3  aload_0 [this]
     4  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
     7  astore_2
     8  aload_2
     9  ifnull 33
    12  aload_2
    13  ldc <String "tabSize"> [21]
    15  invokeinterface javax.swing.text.Document.getProperty(java.lang.Object) : java.lang.Object [355] [nargs: 2]
    20  checkcast java.lang.Integer [178]
    23  astore_3
    24  aload_3
    25  ifnull 33
    28  aload_3
    29  invokevirtual java.lang.Integer.intValue() : int [310]
    32  istore_1
    33  iload_1
    34  ireturn
    Stack map table: number of frames 1
        [pc: 33, append: {int, javax.swing.text.Document}]
  
  // Method descriptor #38 (Z)V
  // Stack: 4, Locals: 3
  public void setLineWrap(boolean arg0);
     0  aload_0 [this]
     1  getfield javax.swing.JTextArea.wrap : boolean [302]
     4  istore_2
     5  aload_0 [this]
     6  iload_1 [arg0]
     7  putfield javax.swing.JTextArea.wrap : boolean [302]
    10  aload_0 [this]
    11  ldc <String "lineWrap"> [18]
    13  iload_2
    14  iload_1 [arg0]
    15  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, boolean, boolean) : void [333]
    18  return

  
  // Method descriptor #27 ()Z
  // Stack: 1, Locals: 1
  public boolean getLineWrap();
    0  aload_0 [this]
    1  getfield javax.swing.JTextArea.wrap : boolean [302]
    4  ireturn

  
  // Method descriptor #38 (Z)V
  // Stack: 4, Locals: 3
  public void setWrapStyleWord(boolean arg0);
     0  aload_0 [this]
     1  getfield javax.swing.JTextArea.word : boolean [301]
     4  istore_2
     5  aload_0 [this]
     6  iload_1 [arg0]
     7  putfield javax.swing.JTextArea.word : boolean [301]
    10  aload_0 [this]
    11  ldc <String "wrapStyleWord"> [23]
    13  iload_2
    14  iload_1 [arg0]
    15  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, boolean, boolean) : void [333]
    18  return

  
  // Method descriptor #27 ()Z
  // Stack: 1, Locals: 1
  public boolean getWrapStyleWord();
    0  aload_0 [this]
    1  getfield javax.swing.JTextArea.word : boolean [301]
    4  ireturn

  
  // Method descriptor #29 (I)I
  // Stack: 5, Locals: 4
  public int getLineOfOffset(int arg0) throws javax.swing.text.BadLocationException;
     0  aload_0 [this]
     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
     4  astore_2
     5  iload_1 [arg0]
     6  ifge 20
     9  new javax.swing.text.BadLocationException [188]
    12  dup
    13  ldc <String "Can't translate offset to line"> [7]
    15  iconst_m1
    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
    19  athrow
    20  iload_1 [arg0]
    21  aload_2
    22  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
    27  if_icmple 48
    30  new javax.swing.text.BadLocationException [188]
    33  dup
    34  ldc <String "Can't translate offset to line"> [7]
    36  aload_2
    37  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
    42  iconst_1
    43  iadd
    44  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
    47  athrow
    48  aload_0 [this]
    49  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
    52  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
    57  astore_3
    58  aload_3
    59  iload_1 [arg0]
    60  invokeinterface javax.swing.text.Element.getElementIndex(int) : int [361] [nargs: 2]
    65  ireturn
    Stack map table: number of frames 2
        [pc: 20, append: {javax.swing.text.Document}]
        [pc: 48, same]
  
  // Method descriptor #24 ()I
  // Stack: 1, Locals: 2
  public int getLineCount();
     0  aload_0 [this]
     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
     4  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
     9  astore_1
    10  aload_1
    11  invokeinterface javax.swing.text.Element.getElementCount() : int [358] [nargs: 1]
    16  ireturn

  
  // Method descriptor #29 (I)I
  // Stack: 5, Locals: 5
  public int getLineStartOffset(int arg0) throws javax.swing.text.BadLocationException;
     0  aload_0 [this]
     1  invokevirtual javax.swing.JTextArea.getLineCount() : int [323]
     4  istore_2
     5  iload_1 [arg0]
     6  ifge 20
     9  new javax.swing.text.BadLocationException [188]
    12  dup
    13  ldc <String "Negative line"> [9]
    15  iconst_m1
    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
    19  athrow
    20  iload_1 [arg0]
    21  iload_2
    22  if_icmplt 46
    25  new javax.swing.text.BadLocationException [188]
    28  dup
    29  ldc <String "No such line"> [10]
    31  aload_0 [this]
    32  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
    35  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
    40  iconst_1
    41  iadd
    42  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
    45  athrow
    46  aload_0 [this]
    47  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
    50  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
    55  astore_3
    56  aload_3
    57  iload_1 [arg0]
    58  invokeinterface javax.swing.text.Element.getElement(int) : javax.swing.text.Element [362] [nargs: 2]
    63  astore 4
    65  aload 4
    67  invokeinterface javax.swing.text.Element.getStartOffset() : int [360] [nargs: 1]
    72  ireturn
    Stack map table: number of frames 2
        [pc: 20, append: {int}]
        [pc: 46, same]
  
  // Method descriptor #29 (I)I
  // Stack: 5, Locals: 6
  public int getLineEndOffset(int arg0) throws javax.swing.text.BadLocationException;
     0  aload_0 [this]
     1  invokevirtual javax.swing.JTextArea.getLineCount() : int [323]
     4  istore_2
     5  iload_1 [arg0]
     6  ifge 20
     9  new javax.swing.text.BadLocationException [188]
    12  dup
    13  ldc <String "Negative line"> [9]
    15  iconst_m1
    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
    19  athrow
    20  iload_1 [arg0]
    21  iload_2
    22  if_icmplt 46
    25  new javax.swing.text.BadLocationException [188]
    28  dup
    29  ldc <String "No such line"> [10]
    31  aload_0 [this]
    32  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
    35  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
    40  iconst_1
    41  iadd
    42  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
    45  athrow
    46  aload_0 [this]
    47  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
    50  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
    55  astore_3
    56  aload_3
    57  iload_1 [arg0]
    58  invokeinterface javax.swing.text.Element.getElement(int) : javax.swing.text.Element [362] [nargs: 2]
    63  astore 4
    65  aload 4
    67  invokeinterface javax.swing.text.Element.getEndOffset() : int [359] [nargs: 1]
    72  istore 5
    74  iload_1 [arg0]
    75  iload_2
    76  iconst_1
    77  isub
    78  if_icmpne 88
    81  iload 5
    83  iconst_1
    84  isub
    85  goto 90
    88  iload 5
    90  ireturn
    Stack map table: number of frames 4
        [pc: 20, append: {int}]
        [pc: 46, same]
        [pc: 88, append: {javax.swing.text.Element, javax.swing.text.Element, int}]
        [pc: 90, same_locals_1_stack_item, stack: {int}]
  
  // Method descriptor #201 (Ljava/lang/String;I)V
  // Stack: 4, Locals: 5
  public void insert(java.lang.String arg0, int arg1);
     0  aload_0 [this]
     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
     4  astore_3
     5  aload_3
     6  ifnull 36
     9  aload_3
    10  iload_2 [arg1]
    11  aload_1 [arg0]
    12  aconst_null
    13  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
    18  goto 36
    21  astore 4
    23  new java.lang.IllegalArgumentException [177]
    26  dup
    27  aload 4
    29  invokevirtual javax.swing.text.BadLocationException.getMessage() : java.lang.String [343]
    32  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
    35  athrow
    36  return
      Exception Table:
        [pc: 9, pc: 18] -> 21 when : javax.swing.text.BadLocationException
      Stack map table: number of frames 2
        [pc: 21, full, stack: {javax.swing.text.BadLocationException}, locals: {javax.swing.JTextArea, java.lang.String, int, javax.swing.text.Document}]
        [pc: 36, same]
  
  // Method descriptor #37 (Ljava/lang/String;)V
  // Stack: 4, Locals: 4
  public void append(java.lang.String arg0);
     0  aload_0 [this]
     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
     4  astore_2
     5  aload_2
     6  ifnull 27
     9  aload_2
    10  aload_2
    11  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
    16  aload_1 [arg0]
    17  aconst_null
    18  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
    23  goto 27
    26  astore_3
    27  return
      Exception Table:
        [pc: 9, pc: 23] -> 26 when : javax.swing.text.BadLocationException
      Stack map table: number of frames 2
        [pc: 26, full, stack: {javax.swing.text.BadLocationException}, locals: {javax.swing.JTextArea, java.lang.String, javax.swing.text.Document}]
        [pc: 27, same]
  
  // Method descriptor #202 (Ljava/lang/String;II)V
  // Stack: 5, Locals: 6
  public void replaceRange(java.lang.String arg0, int arg1, int arg2);
     0  iload_3 [arg2]
     1  iload_2 [arg1]
     2  if_icmpge 15
     5  new java.lang.IllegalArgumentException [177]
     8  dup
     9  ldc <String "end before start"> [14]
    11  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
    14  athrow
    15  aload_0 [this]
    16  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
    19  astore 4
    21  aload 4
    23  ifnull 90
    26  aload 4
    28  instanceof javax.swing.text.AbstractDocument [187]
    31  ifeq 51
    34  aload 4
    36  checkcast javax.swing.text.AbstractDocument [187]
    39  iload_2 [arg1]
    40  iload_3 [arg2]
    41  iload_2 [arg1]
    42  isub
    43  aload_1 [arg0]
    44  aconst_null
    45  invokevirtual javax.swing.text.AbstractDocument.replace(int, int, java.lang.String, javax.swing.text.AttributeSet) : void [342]
    48  goto 72
    51  aload 4
    53  iload_2 [arg1]
    54  iload_3 [arg2]
    55  iload_2 [arg1]
    56  isub
    57  invokeinterface javax.swing.text.Document.remove(int, int) : void [353] [nargs: 3]
    62  aload 4
    64  iload_2 [arg1]
    65  aload_1 [arg0]
    66  aconst_null
    67  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
    72  goto 90
    75  astore 5
    77  new java.lang.IllegalArgumentException [177]
    80  dup
    81  aload 5
    83  invokevirtual javax.swing.text.BadLocationException.getMessage() : java.lang.String [343]
    86  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
    89  athrow
    90  return
      Exception Table:
        [pc: 26, pc: 72] -> 75 when : javax.swing.text.BadLocationException
      Stack map table: number of frames 5
        [pc: 15, same]
        [pc: 51, append: {javax.swing.text.Document}]
        [pc: 72, same]
        [pc: 75, same_locals_1_stack_item, stack: {javax.swing.text.BadLocationException}]
        [pc: 90, same]
  
  // Method descriptor #24 ()I
  // Stack: 1, Locals: 1
  public int getRows();
    0  aload_0 [this]
    1  getfield javax.swing.JTextArea.rows : int [300]
    4  ireturn

  
  // Method descriptor #30 (I)V
  // Stack: 3, Locals: 3
  public void setRows(int arg0);
     0  aload_0 [this]
     1  getfield javax.swing.JTextArea.rows : int [300]
     4  istore_2
     5  iload_1 [arg0]
     6  ifge 19
     9  new java.lang.IllegalArgumentException [177]
    12  dup
    13  ldc <String "rows less than zero."> [19]
    15  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
    18  athrow
    19  iload_1 [arg0]
    20  iload_2
    21  if_icmpeq 33
    24  aload_0 [this]
    25  iload_1 [arg0]
    26  putfield javax.swing.JTextArea.rows : int [300]
    29  aload_0 [this]
    30  invokevirtual javax.swing.JTextArea.invalidate() : void [326]
    33  return
    Stack map table: number of frames 2
        [pc: 19, append: {int}]
        [pc: 33, same]
  
  // Method descriptor #24 ()I
  // Stack: 2, Locals: 2
  protected int getRowHeight();
     0  aload_0 [this]
     1  getfield javax.swing.JTextArea.rowHeight : int [299]
     4  ifne 24
     7  aload_0 [this]
     8  aload_0 [this]
     9  invokevirtual javax.swing.JTextArea.getFont() : java.awt.Font [328]
    12  invokevirtual javax.swing.JTextArea.getFontMetrics(java.awt.Font) : java.awt.FontMetrics [337]
    15  astore_1
    16  aload_0 [this]
    17  aload_1
    18  invokevirtual java.awt.FontMetrics.getHeight() : int [306]
    21  putfield javax.swing.JTextArea.rowHeight : int [299]
    24  aload_0 [this]
    25  getfield javax.swing.JTextArea.rowHeight : int [299]
    28  ireturn
    Stack map table: number of frames 1
        [pc: 24, same]
  
  // Method descriptor #24 ()I
  // Stack: 1, Locals: 1
  public int getColumns();
    0  aload_0 [this]
    1  getfield javax.swing.JTextArea.columns : int [298]
    4  ireturn

  
  // Method descriptor #30 (I)V
  // Stack: 3, Locals: 3
  public void setColumns(int arg0);
     0  aload_0 [this]
     1  getfield javax.swing.JTextArea.columns : int [298]
     4  istore_2
     5  iload_1 [arg0]
     6  ifge 19
     9  new java.lang.IllegalArgumentException [177]
    12  dup
    13  ldc <String "columns less than zero."> [12]
    15  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
    18  athrow
    19  iload_1 [arg0]
    20  iload_2
    21  if_icmpeq 33
    24  aload_0 [this]
    25  iload_1 [arg0]
    26  putfield javax.swing.JTextArea.columns : int [298]
    29  aload_0 [this]
    30  invokevirtual javax.swing.JTextArea.invalidate() : void [326]
    33  return
    Stack map table: number of frames 2
        [pc: 19, append: {int}]
        [pc: 33, same]
  
  // Method descriptor #24 ()I
  // Stack: 3, Locals: 2
  protected int getColumnWidth();
     0  aload_0 [this]
     1  getfield javax.swing.JTextArea.columnWidth : int [297]
     4  ifne 26
     7  aload_0 [this]
     8  aload_0 [this]
     9  invokevirtual javax.swing.JTextArea.getFont() : java.awt.Font [328]
    12  invokevirtual javax.swing.JTextArea.getFontMetrics(java.awt.Font) : java.awt.FontMetrics [337]
    15  astore_1
    16  aload_0 [this]
    17  aload_1
    18  bipush 109
    20  invokevirtual java.awt.FontMetrics.charWidth(char) : int [307]
    23  putfield javax.swing.JTextArea.columnWidth : int [297]
    26  aload_0 [this]
    27  getfield javax.swing.JTextArea.columnWidth : int [297]
    30  ireturn
    Stack map table: number of frames 1
        [pc: 26, same]
  
  // Method descriptor #195 ()Ljava/awt/Dimension;
  // Stack: 4, Locals: 3
  public java.awt.Dimension getPreferredSize();
      0  aload_0 [this]
      1  invokespecial javax.swing.text.JTextComponent.getPreferredSize() : java.awt.Dimension [348]
      4  astore_1
      5  aload_1
      6  ifnonnull 25
      9  new java.awt.Dimension [172]
     12  dup
     13  sipush 400
     16  sipush 400
     19  invokespecial java.awt.Dimension(int, int) [305]
     22  goto 26
     25  aload_1
     26  astore_1
     27  aload_0 [this]
     28  invokevirtual javax.swing.JTextArea.getInsets() : java.awt.Insets [329]
     31  astore_2
     32  aload_0 [this]
     33  getfield javax.swing.JTextArea.columns : int [298]
     36  ifeq 69
     39  aload_1
     40  aload_1
     41  getfield java.awt.Dimension.width : int [292]
     44  aload_0 [this]
     45  getfield javax.swing.JTextArea.columns : int [298]
     48  aload_0 [this]
     49  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
     52  imul
     53  aload_2
     54  getfield java.awt.Insets.left : int [294]
     57  iadd
     58  aload_2
     59  getfield java.awt.Insets.right : int [295]
     62  iadd
     63  invokestatic java.lang.Math.max(int, int) : int [312]
     66  putfield java.awt.Dimension.width : int [292]
     69  aload_0 [this]
     70  getfield javax.swing.JTextArea.rows : int [300]
     73  ifeq 106
     76  aload_1
     77  aload_1
     78  getfield java.awt.Dimension.height : int [291]
     81  aload_0 [this]
     82  getfield javax.swing.JTextArea.rows : int [300]
     85  aload_0 [this]
     86  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
     89  imul
     90  aload_2
     91  getfield java.awt.Insets.top : int [296]
     94  iadd
     95  aload_2
     96  getfield java.awt.Insets.bottom : int [293]
     99  iadd
    100  invokestatic java.lang.Math.max(int, int) : int [312]
    103  putfield java.awt.Dimension.height : int [291]
    106  aload_1
    107  areturn
    Stack map table: number of frames 4
        [pc: 25, append: {java.awt.Dimension}]
        [pc: 26, same_locals_1_stack_item, stack: {java.awt.Dimension}]
        [pc: 69, append: {java.awt.Insets}]
        [pc: 106, same]
  
  // Method descriptor #197 (Ljava/awt/Font;)V
  // Stack: 2, Locals: 2
  public void setFont(java.awt.Font arg0);
     0  aload_0 [this]
     1  aload_1 [arg0]
     2  invokespecial javax.swing.text.JTextComponent.setFont(java.awt.Font) : void [349]
     5  aload_0 [this]
     6  iconst_0
     7  putfield javax.swing.JTextArea.rowHeight : int [299]
    10  aload_0 [this]
    11  iconst_0
    12  putfield javax.swing.JTextArea.columnWidth : int [297]
    15  return

  
  // Method descriptor #25 ()Ljava/lang/String;
  // Stack: 2, Locals: 3
  protected java.lang.String paramString();
      0  aload_0 [this]
      1  getfield javax.swing.JTextArea.wrap : boolean [302]
      4  ifeq 12
      7  ldc <String "true"> [22]
      9  goto 14
     12  ldc <String "false"> [15]
     14  astore_1
     15  aload_0 [this]
     16  getfield javax.swing.JTextArea.word : boolean [301]
     19  ifeq 27
     22  ldc <String "true"> [22]
     24  goto 29
     27  ldc <String "false"> [15]
     29  astore_2
     30  new java.lang.StringBuilder [181]
     33  dup
     34  invokespecial java.lang.StringBuilder() [314]
     37  aload_0 [this]
     38  invokespecial javax.swing.text.JTextComponent.paramString() : java.lang.String [350]
     41  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
     44  ldc <String ",colums="> [2]
     46  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
     49  aload_0 [this]
     50  getfield javax.swing.JTextArea.columns : int [298]
     53  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
     56  ldc <String ",columWidth="> [1]
     58  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
     61  aload_0 [this]
     62  getfield javax.swing.JTextArea.columnWidth : int [297]
     65  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
     68  ldc <String ",rows="> [4]
     70  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
     73  aload_0 [this]
     74  getfield javax.swing.JTextArea.rows : int [300]
     77  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
     80  ldc <String ",rowHeight="> [3]
     82  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
     85  aload_0 [this]
     86  getfield javax.swing.JTextArea.rowHeight : int [299]
     89  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
     92  ldc <String ",word="> [5]
     94  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
     97  aload_2
     98  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
    101  ldc <String ",wrap="> [6]
    103  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
    106  aload_1
    107  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
    110  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
    113  areturn
    Stack map table: number of frames 4
        [pc: 12, same]
        [pc: 14, same_locals_1_stack_item, stack: {java.lang.String}]
        [pc: 27, append: {java.lang.String}]
        [pc: 29, same_locals_1_stack_item, stack: {java.lang.String}]
  
  // Method descriptor #27 ()Z
  // Stack: 1, Locals: 1
  public boolean getScrollableTracksViewportWidth();
     0  aload_0 [this]
     1  getfield javax.swing.JTextArea.wrap : boolean [302]
     4  ifeq 11
     7  iconst_1
     8  goto 15
    11  aload_0 [this]
    12  invokespecial javax.swing.text.JTextComponent.getScrollableTracksViewportWidth() : boolean [346]
    15  ireturn
    Stack map table: number of frames 2
        [pc: 11, same]
        [pc: 15, same_locals_1_stack_item, stack: {int}]
  
  // Method descriptor #195 ()Ljava/awt/Dimension;
  // Stack: 4, Locals: 3
  public java.awt.Dimension getPreferredScrollableViewportSize();
      0  aload_0 [this]
      1  invokespecial javax.swing.text.JTextComponent.getPreferredScrollableViewportSize() : java.awt.Dimension [347]
      4  astore_1
      5  aload_1
      6  ifnonnull 25
      9  new java.awt.Dimension [172]
     12  dup
     13  sipush 400
     16  sipush 400
     19  invokespecial java.awt.Dimension(int, int) [305]
     22  goto 26
     25  aload_1
     26  astore_1
     27  aload_0 [this]
     28  invokevirtual javax.swing.JTextArea.getInsets() : java.awt.Insets [329]
     31  astore_2
     32  aload_1
     33  aload_0 [this]
     34  getfield javax.swing.JTextArea.columns : int [298]
     37  ifne 47
     40  aload_1
     41  getfield java.awt.Dimension.width : int [292]
     44  goto 66
     47  aload_0 [this]
     48  getfield javax.swing.JTextArea.columns : int [298]
     51  aload_0 [this]
     52  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
     55  imul
     56  aload_2
     57  getfield java.awt.Insets.left : int [294]
     60  iadd
     61  aload_2
     62  getfield java.awt.Insets.right : int [295]
     65  iadd
     66  putfield java.awt.Dimension.width : int [292]
     69  aload_1
     70  aload_0 [this]
     71  getfield javax.swing.JTextArea.rows : int [300]
     74  ifne 84
     77  aload_1
     78  getfield java.awt.Dimension.height : int [291]
     81  goto 103
     84  aload_0 [this]
     85  getfield javax.swing.JTextArea.rows : int [300]
     88  aload_0 [this]
     89  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
     92  imul
     93  aload_2
     94  getfield java.awt.Insets.top : int [296]
     97  iadd
     98  aload_2
     99  getfield java.awt.Insets.bottom : int [293]
    102  iadd
    103  putfield java.awt.Dimension.height : int [291]
    106  aload_1
    107  areturn
    Stack map table: number of frames 6
        [pc: 25, append: {java.awt.Dimension}]
        [pc: 26, same_locals_1_stack_item, stack: {java.awt.Dimension}]
        [pc: 47, full, stack: {java.awt.Dimension}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
        [pc: 66, full, stack: {java.awt.Dimension, int}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
        [pc: 84, same_locals_1_stack_item, stack: {java.awt.Dimension}]
        [pc: 103, full, stack: {java.awt.Dimension, int}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
  
  // Method descriptor #199 (Ljava/awt/Rectangle;II)I
  // Stack: 4, Locals: 4
  public int getScrollableUnitIncrement(java.awt.Rectangle arg0, int arg1, int arg2);
     0  iload_2 [arg1]
     1  lookupswitch default: 38
          case 0: 33
          case 1: 28
    28  aload_0 [this]
    29  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
    32  ireturn
    33  aload_0 [this]
    34  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
    37  ireturn
    38  new java.lang.IllegalArgumentException [177]
    41  dup
    42  new java.lang.StringBuilder [181]
    45  dup
    46  invokespecial java.lang.StringBuilder() [314]
    49  ldc <String "Invalid orientation: "> [8]
    51  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
    54  iload_2 [arg1]
    55  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
    58  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
    61  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
    64  athrow
    Stack map table: number of frames 3
        [pc: 28, same]
        [pc: 33, same]
        [pc: 38, same]
  
  // Method descriptor #33 (Ljava/io/ObjectOutputStream;)V
  // Stack: 3, Locals: 3
  private void writeObject(java.io.ObjectOutputStream arg0) throws java.io.IOException;
     0  aload_1 [arg0]
     1  invokevirtual java.io.ObjectOutputStream.defaultWriteObject() : void [308]
     4  aload_0 [this]
     5  invokevirtual javax.swing.JTextArea.getUIClassID() : java.lang.String [330]
     8  ldc <String "TextAreaUI"> [11]
    10  invokevirtual java.lang.String.equals(java.lang.Object) : boolean [313]
    13  ifeq 50
    16  aload_0 [this]
    17  invokestatic javax.swing.JComponent.getWriteObjCounter(javax.swing.JComponent) : byte [320]
    20  istore_2
    21  aload_0 [this]
    22  iload_2
    23  iconst_1
    24  isub
    25  i2b
    26  istore_2
    27  iload_2
    28  invokestatic javax.swing.JComponent.setWriteObjCounter(javax.swing.JComponent, byte) : void [321]
    31  iload_2
    32  ifne 50
    35  aload_0 [this]
    36  getfield javax.swing.JTextArea.ui : javax.swing.plaf.ComponentUI [304]
    39  ifnull 50
    42  aload_0 [this]
    43  getfield javax.swing.JTextArea.ui : javax.swing.plaf.ComponentUI [304]
    46  aload_0 [this]
    47  invokevirtual javax.swing.plaf.ComponentUI.installUI(javax.swing.JComponent) : void [341]
    50  return
    Stack map table: number of frames 1
        [pc: 50, same]
  
  // Method descriptor #206 ()Ljavax/accessibility/AccessibleContext;
  // Stack: 4, Locals: 1
  public javax.accessibility.AccessibleContext getAccessibleContext();
     0  aload_0 [this]
     1  getfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
     4  ifnonnull 19
     7  aload_0 [this]
     8  new javax.swing.JTextArea$AccessibleJTextArea [184]
    11  dup
    12  aload_0 [this]
    13  invokespecial javax.swing.JTextArea$AccessibleJTextArea(javax.swing.JTextArea) [339]
    16  putfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
    19  aload_0 [this]
    20  getfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
    23  areturn
    Stack map table: number of frames 1
        [pc: 19, same]

  Inner classes:
    [inner class info: #184 javax/swing/JTextArea$AccessibleJTextArea, outer class info: #183 javax/swing/JTextArea
     inner name: #363 AccessibleJTextArea, accessflags: 4 protected]
}//  (version 1.8 : 52.0, super bit)
public class javax.swing.JTextArea extends javax.swing.text.JTextComponent {
	  
	  // Field descriptor #53 Ljava/lang/String;
	  private static final java.lang.String uiClassID = "TextAreaUI";
	  
	  // Field descriptor #50 I
	  private int rows;
	  
	  // Field descriptor #50 I
	  private int columns;
	  
	  // Field descriptor #50 I
	  private int columnWidth;
	  
	  // Field descriptor #50 I
	  private int rowHeight;
	  
	  // Field descriptor #58 Z
	  private boolean wrap;
	  
	  // Field descriptor #58 Z
	  private boolean word;
	  
	  // Method descriptor #26 ()V
	  // Stack: 5, Locals: 1
	  public JTextArea();
	    0  aload_0 [this]
	    1  aconst_null
	    2  aconst_null
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #37 (Ljava/lang/String;)V
	  // Stack: 5, Locals: 2
	  public JTextArea(java.lang.String arg0);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aload_1 [arg0]
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #32 (II)V
	  // Stack: 5, Locals: 3
	  public JTextArea(int arg0, int arg1);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aconst_null
	    3  iload_1 [arg0]
	    4  iload_2 [arg1]
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #202 (Ljava/lang/String;II)V
	  // Stack: 5, Locals: 4
	  public JTextArea(java.lang.String arg0, int arg1, int arg2);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aload_1 [arg0]
	    3  iload_2 [arg1]
	    4  iload_3 [arg2]
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #212 (Ljavax/swing/text/Document;)V
	  // Stack: 5, Locals: 2
	  public JTextArea(javax.swing.text.Document arg0);
	    0  aload_0 [this]
	    1  aload_1 [arg0]
	    2  aconst_null
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #216 (Ljavax/swing/text/Document;Ljava/lang/String;II)V
	  // Stack: 4, Locals: 5
	  public JTextArea(javax.swing.text.Document arg0, java.lang.String arg1, int arg2, int arg3);
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent() [345]
	      4  aload_0 [this]
	      5  iload_3 [arg2]
	      6  putfield javax.swing.JTextArea.rows : int [300]
	      9  aload_0 [this]
	     10  iload 4 [arg3]
	     12  putfield javax.swing.JTextArea.columns : int [298]
	     15  aload_1 [arg0]
	     16  ifnonnull 24
	     19  aload_0 [this]
	     20  invokevirtual javax.swing.JTextArea.createDefaultModel() : javax.swing.text.Document [334]
	     23  astore_1 [arg0]
	     24  aload_0 [this]
	     25  aload_1 [arg0]
	     26  invokevirtual javax.swing.JTextArea.setDocument(javax.swing.text.Document) : void [336]
	     29  aload_2 [arg1]
	     30  ifnull 44
	     33  aload_0 [this]
	     34  aload_2 [arg1]
	     35  invokevirtual javax.swing.JTextArea.setText(java.lang.String) : void [331]
	     38  aload_0 [this]
	     39  iconst_0
	     40  iconst_0
	     41  invokevirtual javax.swing.JTextArea.select(int, int) : void [327]
	     44  iload_3 [arg2]
	     45  ifge 75
	     48  new java.lang.IllegalArgumentException [177]
	     51  dup
	     52  new java.lang.StringBuilder [181]
	     55  dup
	     56  invokespecial java.lang.StringBuilder() [314]
	     59  ldc <String "rows: "> [20]
	     61  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     64  iload_3 [arg2]
	     65  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     68  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	     71  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	     74  athrow
	     75  iload 4 [arg3]
	     77  ifge 108
	     80  new java.lang.IllegalArgumentException [177]
	     83  dup
	     84  new java.lang.StringBuilder [181]
	     87  dup
	     88  invokespecial java.lang.StringBuilder() [314]
	     91  ldc <String "columns: "> [13]
	     93  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     96  iload 4 [arg3]
	     98  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	    101  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    104  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    107  athrow
	    108  aload_0 [this]
	    109  ldc <String "focusTraversalKeysForward"> [17]
	    111  invokestatic javax.swing.JComponent.getManagingFocusForwardTraversalKeys() : java.util.Set [319]
	    114  invokestatic javax.swing.LookAndFeel.installProperty(javax.swing.JComponent, java.lang.String, java.lang.Object) : void [340]
	    117  aload_0 [this]
	    118  ldc <String "focusTraversalKeysBackward"> [16]
	    120  invokestatic javax.swing.JComponent.getManagingFocusBackwardTraversalKeys() : java.util.Set [318]
	    123  invokestatic javax.swing.LookAndFeel.installProperty(javax.swing.JComponent, java.lang.String, java.lang.Object) : void [340]
	    126  return
	    Stack map table: number of frames 4
	        [pc: 24, full, stack: {}, locals: {javax.swing.JTextArea, javax.swing.text.Document, java.lang.String, int, int}]
	        [pc: 44, same]
	        [pc: 75, same]
	        [pc: 108, same]
	  
	  // Method descriptor #25 ()Ljava/lang/String;
	  // Stack: 1, Locals: 1
	  public java.lang.String getUIClassID();
	    0  ldc <String "TextAreaUI"> [11]
	    2  areturn

	  
	  // Method descriptor #211 ()Ljavax/swing/text/Document;
	  // Stack: 2, Locals: 1
	  protected javax.swing.text.Document createDefaultModel();
	    0  new javax.swing.text.PlainDocument [192]
	    3  dup
	    4  invokespecial javax.swing.text.PlainDocument() [351]
	    7  areturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 4, Locals: 4
	  public void setTabSize(int arg0);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  aload_2
	     6  ifnull 34
	     9  aload_0 [this]
	    10  invokevirtual javax.swing.JTextArea.getTabSize() : int [325]
	    13  istore_3
	    14  aload_2
	    15  ldc <String "tabSize"> [21]
	    17  iload_1 [arg0]
	    18  invokestatic java.lang.Integer.valueOf(int) : java.lang.Integer [311]
	    21  invokeinterface javax.swing.text.Document.putProperty(java.lang.Object, java.lang.Object) : void [356] [nargs: 3]
	    26  aload_0 [this]
	    27  ldc <String "tabSize"> [21]
	    29  iload_3
	    30  iload_1 [arg0]
	    31  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, int, int) : void [332]
	    34  return
	    Stack map table: number of frames 1
	        [pc: 34, append: {javax.swing.text.Document}]
	  
	  // Method descriptor #24 ()I
	  // Stack: 2, Locals: 4
	  public int getTabSize();
	     0  bipush 8
	     2  istore_1
	     3  aload_0 [this]
	     4  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     7  astore_2
	     8  aload_2
	     9  ifnull 33
	    12  aload_2
	    13  ldc <String "tabSize"> [21]
	    15  invokeinterface javax.swing.text.Document.getProperty(java.lang.Object) : java.lang.Object [355] [nargs: 2]
	    20  checkcast java.lang.Integer [178]
	    23  astore_3
	    24  aload_3
	    25  ifnull 33
	    28  aload_3
	    29  invokevirtual java.lang.Integer.intValue() : int [310]
	    32  istore_1
	    33  iload_1
	    34  ireturn
	    Stack map table: number of frames 1
	        [pc: 33, append: {int, javax.swing.text.Document}]
	  
	  // Method descriptor #38 (Z)V
	  // Stack: 4, Locals: 3
	  public void setLineWrap(boolean arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.wrap : boolean [302]
	     4  istore_2
	     5  aload_0 [this]
	     6  iload_1 [arg0]
	     7  putfield javax.swing.JTextArea.wrap : boolean [302]
	    10  aload_0 [this]
	    11  ldc <String "lineWrap"> [18]
	    13  iload_2
	    14  iload_1 [arg0]
	    15  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, boolean, boolean) : void [333]
	    18  return

	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getLineWrap();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.wrap : boolean [302]
	    4  ireturn

	  
	  // Method descriptor #38 (Z)V
	  // Stack: 4, Locals: 3
	  public void setWrapStyleWord(boolean arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.word : boolean [301]
	     4  istore_2
	     5  aload_0 [this]
	     6  iload_1 [arg0]
	     7  putfield javax.swing.JTextArea.word : boolean [301]
	    10  aload_0 [this]
	    11  ldc <String "wrapStyleWord"> [23]
	    13  iload_2
	    14  iload_1 [arg0]
	    15  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, boolean, boolean) : void [333]
	    18  return

	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getWrapStyleWord();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.word : boolean [301]
	    4  ireturn

	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 4
	  public int getLineOfOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Can't translate offset to line"> [7]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  aload_2
	    22  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    27  if_icmple 48
	    30  new javax.swing.text.BadLocationException [188]
	    33  dup
	    34  ldc <String "Can't translate offset to line"> [7]
	    36  aload_2
	    37  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    42  iconst_1
	    43  iadd
	    44  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    47  athrow
	    48  aload_0 [this]
	    49  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    52  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    57  astore_3
	    58  aload_3
	    59  iload_1 [arg0]
	    60  invokeinterface javax.swing.text.Element.getElementIndex(int) : int [361] [nargs: 2]
	    65  ireturn
	    Stack map table: number of frames 2
	        [pc: 20, append: {javax.swing.text.Document}]
	        [pc: 48, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 2
	  public int getLineCount();
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	     9  astore_1
	    10  aload_1
	    11  invokeinterface javax.swing.text.Element.getElementCount() : int [358] [nargs: 1]
	    16  ireturn

	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 5
	  public int getLineStartOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getLineCount() : int [323]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Negative line"> [9]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  iload_2
	    22  if_icmplt 46
	    25  new javax.swing.text.BadLocationException [188]
	    28  dup
	    29  ldc <String "No such line"> [10]
	    31  aload_0 [this]
	    32  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    35  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    40  iconst_1
	    41  iadd
	    42  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    45  athrow
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    50  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    55  astore_3
	    56  aload_3
	    57  iload_1 [arg0]
	    58  invokeinterface javax.swing.text.Element.getElement(int) : javax.swing.text.Element [362] [nargs: 2]
	    63  astore 4
	    65  aload 4
	    67  invokeinterface javax.swing.text.Element.getStartOffset() : int [360] [nargs: 1]
	    72  ireturn
	    Stack map table: number of frames 2
	        [pc: 20, append: {int}]
	        [pc: 46, same]
	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 6
	  public int getLineEndOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getLineCount() : int [323]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Negative line"> [9]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  iload_2
	    22  if_icmplt 46
	    25  new javax.swing.text.BadLocationException [188]
	    28  dup
	    29  ldc <String "No such line"> [10]
	    31  aload_0 [this]
	    32  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    35  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    40  iconst_1
	    41  iadd
	    42  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    45  athrow
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    50  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    55  astore_3
	    56  aload_3
	    57  iload_1 [arg0]
	    58  invokeinterface javax.swing.text.Element.getElement(int) : javax.swing.text.Element [362] [nargs: 2]
	    63  astore 4
	    65  aload 4
	    67  invokeinterface javax.swing.text.Element.getEndOffset() : int [359] [nargs: 1]
	    72  istore 5
	    74  iload_1 [arg0]
	    75  iload_2
	    76  iconst_1
	    77  isub
	    78  if_icmpne 88
	    81  iload 5
	    83  iconst_1
	    84  isub
	    85  goto 90
	    88  iload 5
	    90  ireturn
	    Stack map table: number of frames 4
	        [pc: 20, append: {int}]
	        [pc: 46, same]
	        [pc: 88, append: {javax.swing.text.Element, javax.swing.text.Element, int}]
	        [pc: 90, same_locals_1_stack_item, stack: {int}]
	  
	  // Method descriptor #201 (Ljava/lang/String;I)V
	  // Stack: 4, Locals: 5
	  public void insert(java.lang.String arg0, int arg1);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_3
	     5  aload_3
	     6  ifnull 36
	     9  aload_3
	    10  iload_2 [arg1]
	    11  aload_1 [arg0]
	    12  aconst_null
	    13  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    18  goto 36
	    21  astore 4
	    23  new java.lang.IllegalArgumentException [177]
	    26  dup
	    27  aload 4
	    29  invokevirtual javax.swing.text.BadLocationException.getMessage() : java.lang.String [343]
	    32  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    35  athrow
	    36  return
	      Exception Table:
	        [pc: 9, pc: 18] -> 21 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 2
	        [pc: 21, full, stack: {javax.swing.text.BadLocationException}, locals: {javax.swing.JTextArea, java.lang.String, int, javax.swing.text.Document}]
	        [pc: 36, same]
	  
	  // Method descriptor #37 (Ljava/lang/String;)V
	  // Stack: 4, Locals: 4
	  public void append(java.lang.String arg0);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  aload_2
	     6  ifnull 27
	     9  aload_2
	    10  aload_2
	    11  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    16  aload_1 [arg0]
	    17  aconst_null
	    18  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    23  goto 27
	    26  astore_3
	    27  return
	      Exception Table:
	        [pc: 9, pc: 23] -> 26 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 2
	        [pc: 26, full, stack: {javax.swing.text.BadLocationException}, locals: {javax.swing.JTextArea, java.lang.String, javax.swing.text.Document}]
	        [pc: 27, same]
	  
	  // Method descriptor #202 (Ljava/lang/String;II)V
	  // Stack: 5, Locals: 6
	  public void replaceRange(java.lang.String arg0, int arg1, int arg2);
	     0  iload_3 [arg2]
	     1  iload_2 [arg1]
	     2  if_icmpge 15
	     5  new java.lang.IllegalArgumentException [177]
	     8  dup
	     9  ldc <String "end before start"> [14]
	    11  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    14  athrow
	    15  aload_0 [this]
	    16  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    19  astore 4
	    21  aload 4
	    23  ifnull 90
	    26  aload 4
	    28  instanceof javax.swing.text.AbstractDocument [187]
	    31  ifeq 51
	    34  aload 4
	    36  checkcast javax.swing.text.AbstractDocument [187]
	    39  iload_2 [arg1]
	    40  iload_3 [arg2]
	    41  iload_2 [arg1]
	    42  isub
	    43  aload_1 [arg0]
	    44  aconst_null
	    45  invokevirtual javax.swing.text.AbstractDocument.replace(int, int, java.lang.String, javax.swing.text.AttributeSet) : void [342]
	    48  goto 72
	    51  aload 4
	    53  iload_2 [arg1]
	    54  iload_3 [arg2]
	    55  iload_2 [arg1]
	    56  isub
	    57  invokeinterface javax.swing.text.Document.remove(int, int) : void [353] [nargs: 3]
	    62  aload 4
	    64  iload_2 [arg1]
	    65  aload_1 [arg0]
	    66  aconst_null
	    67  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    72  goto 90
	    75  astore 5
	    77  new java.lang.IllegalArgumentException [177]
	    80  dup
	    81  aload 5
	    83  invokevirtual javax.swing.text.BadLocationException.getMessage() : java.lang.String [343]
	    86  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    89  athrow
	    90  return
	      Exception Table:
	        [pc: 26, pc: 72] -> 75 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 5
	        [pc: 15, same]
	        [pc: 51, append: {javax.swing.text.Document}]
	        [pc: 72, same]
	        [pc: 75, same_locals_1_stack_item, stack: {javax.swing.text.BadLocationException}]
	        [pc: 90, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 1
	  public int getRows();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.rows : int [300]
	    4  ireturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 3, Locals: 3
	  public void setRows(int arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.rows : int [300]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 19
	     9  new java.lang.IllegalArgumentException [177]
	    12  dup
	    13  ldc <String "rows less than zero."> [19]
	    15  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    18  athrow
	    19  iload_1 [arg0]
	    20  iload_2
	    21  if_icmpeq 33
	    24  aload_0 [this]
	    25  iload_1 [arg0]
	    26  putfield javax.swing.JTextArea.rows : int [300]
	    29  aload_0 [this]
	    30  invokevirtual javax.swing.JTextArea.invalidate() : void [326]
	    33  return
	    Stack map table: number of frames 2
	        [pc: 19, append: {int}]
	        [pc: 33, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 2, Locals: 2
	  protected int getRowHeight();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.rowHeight : int [299]
	     4  ifne 24
	     7  aload_0 [this]
	     8  aload_0 [this]
	     9  invokevirtual javax.swing.JTextArea.getFont() : java.awt.Font [328]
	    12  invokevirtual javax.swing.JTextArea.getFontMetrics(java.awt.Font) : java.awt.FontMetrics [337]
	    15  astore_1
	    16  aload_0 [this]
	    17  aload_1
	    18  invokevirtual java.awt.FontMetrics.getHeight() : int [306]
	    21  putfield javax.swing.JTextArea.rowHeight : int [299]
	    24  aload_0 [this]
	    25  getfield javax.swing.JTextArea.rowHeight : int [299]
	    28  ireturn
	    Stack map table: number of frames 1
	        [pc: 24, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 1
	  public int getColumns();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.columns : int [298]
	    4  ireturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 3, Locals: 3
	  public void setColumns(int arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.columns : int [298]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 19
	     9  new java.lang.IllegalArgumentException [177]
	    12  dup
	    13  ldc <String "columns less than zero."> [12]
	    15  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    18  athrow
	    19  iload_1 [arg0]
	    20  iload_2
	    21  if_icmpeq 33
	    24  aload_0 [this]
	    25  iload_1 [arg0]
	    26  putfield javax.swing.JTextArea.columns : int [298]
	    29  aload_0 [this]
	    30  invokevirtual javax.swing.JTextArea.invalidate() : void [326]
	    33  return
	    Stack map table: number of frames 2
	        [pc: 19, append: {int}]
	        [pc: 33, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 3, Locals: 2
	  protected int getColumnWidth();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.columnWidth : int [297]
	     4  ifne 26
	     7  aload_0 [this]
	     8  aload_0 [this]
	     9  invokevirtual javax.swing.JTextArea.getFont() : java.awt.Font [328]
	    12  invokevirtual javax.swing.JTextArea.getFontMetrics(java.awt.Font) : java.awt.FontMetrics [337]
	    15  astore_1
	    16  aload_0 [this]
	    17  aload_1
	    18  bipush 109
	    20  invokevirtual java.awt.FontMetrics.charWidth(char) : int [307]
	    23  putfield javax.swing.JTextArea.columnWidth : int [297]
	    26  aload_0 [this]
	    27  getfield javax.swing.JTextArea.columnWidth : int [297]
	    30  ireturn
	    Stack map table: number of frames 1
	        [pc: 26, same]
	  
	  // Method descriptor #195 ()Ljava/awt/Dimension;
	  // Stack: 4, Locals: 3
	  public java.awt.Dimension getPreferredSize();
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent.getPreferredSize() : java.awt.Dimension [348]
	      4  astore_1
	      5  aload_1
	      6  ifnonnull 25
	      9  new java.awt.Dimension [172]
	     12  dup
	     13  sipush 400
	     16  sipush 400
	     19  invokespecial java.awt.Dimension(int, int) [305]
	     22  goto 26
	     25  aload_1
	     26  astore_1
	     27  aload_0 [this]
	     28  invokevirtual javax.swing.JTextArea.getInsets() : java.awt.Insets [329]
	     31  astore_2
	     32  aload_0 [this]
	     33  getfield javax.swing.JTextArea.columns : int [298]
	     36  ifeq 69
	     39  aload_1
	     40  aload_1
	     41  getfield java.awt.Dimension.width : int [292]
	     44  aload_0 [this]
	     45  getfield javax.swing.JTextArea.columns : int [298]
	     48  aload_0 [this]
	     49  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	     52  imul
	     53  aload_2
	     54  getfield java.awt.Insets.left : int [294]
	     57  iadd
	     58  aload_2
	     59  getfield java.awt.Insets.right : int [295]
	     62  iadd
	     63  invokestatic java.lang.Math.max(int, int) : int [312]
	     66  putfield java.awt.Dimension.width : int [292]
	     69  aload_0 [this]
	     70  getfield javax.swing.JTextArea.rows : int [300]
	     73  ifeq 106
	     76  aload_1
	     77  aload_1
	     78  getfield java.awt.Dimension.height : int [291]
	     81  aload_0 [this]
	     82  getfield javax.swing.JTextArea.rows : int [300]
	     85  aload_0 [this]
	     86  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	     89  imul
	     90  aload_2
	     91  getfield java.awt.Insets.top : int [296]
	     94  iadd
	     95  aload_2
	     96  getfield java.awt.Insets.bottom : int [293]
	     99  iadd
	    100  invokestatic java.lang.Math.max(int, int) : int [312]
	    103  putfield java.awt.Dimension.height : int [291]
	    106  aload_1
	    107  areturn
	    Stack map table: number of frames 4
	        [pc: 25, append: {java.awt.Dimension}]
	        [pc: 26, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 69, append: {java.awt.Insets}]
	        [pc: 106, same]
	  
	  // Method descriptor #197 (Ljava/awt/Font;)V
	  // Stack: 2, Locals: 2
	  public void setFont(java.awt.Font arg0);
	     0  aload_0 [this]
	     1  aload_1 [arg0]
	     2  invokespecial javax.swing.text.JTextComponent.setFont(java.awt.Font) : void [349]
	     5  aload_0 [this]
	     6  iconst_0
	     7  putfield javax.swing.JTextArea.rowHeight : int [299]
	    10  aload_0 [this]
	    11  iconst_0
	    12  putfield javax.swing.JTextArea.columnWidth : int [297]
	    15  return

	  
	  // Method descriptor #25 ()Ljava/lang/String;
	  // Stack: 2, Locals: 3
	  protected java.lang.String paramString();
	      0  aload_0 [this]
	      1  getfield javax.swing.JTextArea.wrap : boolean [302]
	      4  ifeq 12
	      7  ldc <String "true"> [22]
	      9  goto 14
	     12  ldc <String "false"> [15]
	     14  astore_1
	     15  aload_0 [this]
	     16  getfield javax.swing.JTextArea.word : boolean [301]
	     19  ifeq 27
	     22  ldc <String "true"> [22]
	     24  goto 29
	     27  ldc <String "false"> [15]
	     29  astore_2
	     30  new java.lang.StringBuilder [181]
	     33  dup
	     34  invokespecial java.lang.StringBuilder() [314]
	     37  aload_0 [this]
	     38  invokespecial javax.swing.text.JTextComponent.paramString() : java.lang.String [350]
	     41  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     44  ldc <String ",colums="> [2]
	     46  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     49  aload_0 [this]
	     50  getfield javax.swing.JTextArea.columns : int [298]
	     53  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     56  ldc <String ",columWidth="> [1]
	     58  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     61  aload_0 [this]
	     62  getfield javax.swing.JTextArea.columnWidth : int [297]
	     65  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     68  ldc <String ",rows="> [4]
	     70  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     73  aload_0 [this]
	     74  getfield javax.swing.JTextArea.rows : int [300]
	     77  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     80  ldc <String ",rowHeight="> [3]
	     82  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     85  aload_0 [this]
	     86  getfield javax.swing.JTextArea.rowHeight : int [299]
	     89  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     92  ldc <String ",word="> [5]
	     94  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     97  aload_2
	     98  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    101  ldc <String ",wrap="> [6]
	    103  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    106  aload_1
	    107  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    110  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    113  areturn
	    Stack map table: number of frames 4
	        [pc: 12, same]
	        [pc: 14, same_locals_1_stack_item, stack: {java.lang.String}]
	        [pc: 27, append: {java.lang.String}]
	        [pc: 29, same_locals_1_stack_item, stack: {java.lang.String}]
	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getScrollableTracksViewportWidth();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.wrap : boolean [302]
	     4  ifeq 11
	     7  iconst_1
	     8  goto 15
	    11  aload_0 [this]
	    12  invokespecial javax.swing.text.JTextComponent.getScrollableTracksViewportWidth() : boolean [346]
	    15  ireturn
	    Stack map table: number of frames 2
	        [pc: 11, same]
	        [pc: 15, same_locals_1_stack_item, stack: {int}]
	  
	  // Method descriptor #195 ()Ljava/awt/Dimension;
	  // Stack: 4, Locals: 3
	  public java.awt.Dimension getPreferredScrollableViewportSize();
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent.getPreferredScrollableViewportSize() : java.awt.Dimension [347]
	      4  astore_1
	      5  aload_1
	      6  ifnonnull 25
	      9  new java.awt.Dimension [172]
	     12  dup
	     13  sipush 400
	     16  sipush 400
	     19  invokespecial java.awt.Dimension(int, int) [305]
	     22  goto 26
	     25  aload_1
	     26  astore_1
	     27  aload_0 [this]
	     28  invokevirtual javax.swing.JTextArea.getInsets() : java.awt.Insets [329]
	     31  astore_2
	     32  aload_1
	     33  aload_0 [this]
	     34  getfield javax.swing.JTextArea.columns : int [298]
	     37  ifne 47
	     40  aload_1
	     41  getfield java.awt.Dimension.width : int [292]
	     44  goto 66
	     47  aload_0 [this]
	     48  getfield javax.swing.JTextArea.columns : int [298]
	     51  aload_0 [this]
	     52  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	     55  imul
	     56  aload_2
	     57  getfield java.awt.Insets.left : int [294]
	     60  iadd
	     61  aload_2
	     62  getfield java.awt.Insets.right : int [295]
	     65  iadd
	     66  putfield java.awt.Dimension.width : int [292]
	     69  aload_1
	     70  aload_0 [this]
	     71  getfield javax.swing.JTextArea.rows : int [300]
	     74  ifne 84
	     77  aload_1
	     78  getfield java.awt.Dimension.height : int [291]
	     81  goto 103
	     84  aload_0 [this]
	     85  getfield javax.swing.JTextArea.rows : int [300]
	     88  aload_0 [this]
	     89  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	     92  imul
	     93  aload_2
	     94  getfield java.awt.Insets.top : int [296]
	     97  iadd
	     98  aload_2
	     99  getfield java.awt.Insets.bottom : int [293]
	    102  iadd
	    103  putfield java.awt.Dimension.height : int [291]
	    106  aload_1
	    107  areturn
	    Stack map table: number of frames 6
	        [pc: 25, append: {java.awt.Dimension}]
	        [pc: 26, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 47, full, stack: {java.awt.Dimension}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	        [pc: 66, full, stack: {java.awt.Dimension, int}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	        [pc: 84, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 103, full, stack: {java.awt.Dimension, int}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	  
	  // Method descriptor #199 (Ljava/awt/Rectangle;II)I
	  // Stack: 4, Locals: 4
	  public int getScrollableUnitIncrement(java.awt.Rectangle arg0, int arg1, int arg2);
	     0  iload_2 [arg1]
	     1  lookupswitch default: 38
	          case 0: 33
	          case 1: 28
	    28  aload_0 [this]
	    29  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	    32  ireturn
	    33  aload_0 [this]
	    34  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	    37  ireturn
	    38  new java.lang.IllegalArgumentException [177]
	    41  dup
	    42  new java.lang.StringBuilder [181]
	    45  dup
	    46  invokespecial java.lang.StringBuilder() [314]
	    49  ldc <String "Invalid orientation: "> [8]
	    51  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    54  iload_2 [arg1]
	    55  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	    58  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    61  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    64  athrow
	    Stack map table: number of frames 3
	        [pc: 28, same]
	        [pc: 33, same]
	        [pc: 38, same]
	  
	  // Method descriptor #33 (Ljava/io/ObjectOutputStream;)V
	  // Stack: 3, Locals: 3
	  private void writeObject(java.io.ObjectOutputStream arg0) throws java.io.IOException;
	     0  aload_1 [arg0]
	     1  invokevirtual java.io.ObjectOutputStream.defaultWriteObject() : void [308]
	     4  aload_0 [this]
	     5  invokevirtual javax.swing.JTextArea.getUIClassID() : java.lang.String [330]
	     8  ldc <String "TextAreaUI"> [11]
	    10  invokevirtual java.lang.String.equals(java.lang.Object) : boolean [313]
	    13  ifeq 50
	    16  aload_0 [this]
	    17  invokestatic javax.swing.JComponent.getWriteObjCounter(javax.swing.JComponent) : byte [320]
	    20  istore_2
	    21  aload_0 [this]
	    22  iload_2
	    23  iconst_1
	    24  isub
	    25  i2b
	    26  istore_2
	    27  iload_2
	    28  invokestatic javax.swing.JComponent.setWriteObjCounter(javax.swing.JComponent, byte) : void [321]
	    31  iload_2
	    32  ifne 50
	    35  aload_0 [this]
	    36  getfield javax.swing.JTextArea.ui : javax.swing.plaf.ComponentUI [304]
	    39  ifnull 50
	    42  aload_0 [this]
	    43  getfield javax.swing.JTextArea.ui : javax.swing.plaf.ComponentUI [304]
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.plaf.ComponentUI.installUI(javax.swing.JComponent) : void [341]
	    50  return
	    Stack map table: number of frames 1
	        [pc: 50, same]
	  
	  // Method descriptor #206 ()Ljavax/accessibility/AccessibleContext;
	  // Stack: 4, Locals: 1
	  public javax.accessibility.AccessibleContext getAccessibleContext();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	     4  ifnonnull 19
	     7  aload_0 [this]
	     8  new javax.swing.JTextArea$AccessibleJTextArea [184]
	    11  dup
	    12  aload_0 [this]
	    13  invokespecial javax.swing.JTextArea$AccessibleJTextArea(javax.swing.JTextArea) [339]
	    16  putfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	    19  aload_0 [this]
	    20  getfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	    23  areturn
	    Stack map table: number of frames 1
	        [pc: 19, same]

	  Inner classes:
	    [inner class info: #184 javax/swing/JTextArea$AccessibleJTextArea, outer class info: #183 javax/swing/JTextArea
	     inner name: #363 AccessibleJTextArea, accessflags: 4 protected]
	}//  (version 1.8 : 52.0, super bit)
public class javax.swing.JTextArea extends javax.swing.text.JTextComponent {
	  
	  // Field descriptor #53 Ljava/lang/String;
	  private static final java.lang.String uiClassID = "TextAreaUI";
	  
	  // Field descriptor #50 I
	  private int rows;
	  
	  // Field descriptor #50 I
	  private int columns;
	  
	  // Field descriptor #50 I
	  private int columnWidth;
	  
	  // Field descriptor #50 I
	  private int rowHeight;
	  
	  // Field descriptor #58 Z
	  private boolean wrap;
	  
	  // Field descriptor #58 Z
	  private boolean word;
	  
	  // Method descriptor #26 ()V
	  // Stack: 5, Locals: 1
	  public JTextArea();
	    0  aload_0 [this]
	    1  aconst_null
	    2  aconst_null
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #37 (Ljava/lang/String;)V
	  // Stack: 5, Locals: 2
	  public JTextArea(java.lang.String arg0);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aload_1 [arg0]
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #32 (II)V
	  // Stack: 5, Locals: 3
	  public JTextArea(int arg0, int arg1);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aconst_null
	    3  iload_1 [arg0]
	    4  iload_2 [arg1]
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #202 (Ljava/lang/String;II)V
	  // Stack: 5, Locals: 4
	  public JTextArea(java.lang.String arg0, int arg1, int arg2);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aload_1 [arg0]
	    3  iload_2 [arg1]
	    4  iload_3 [arg2]
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #212 (Ljavax/swing/text/Document;)V
	  // Stack: 5, Locals: 2
	  public JTextArea(javax.swing.text.Document arg0);
	    0  aload_0 [this]
	    1  aload_1 [arg0]
	    2  aconst_null
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #216 (Ljavax/swing/text/Document;Ljava/lang/String;II)V
	  // Stack: 4, Locals: 5
	  public JTextArea(javax.swing.text.Document arg0, java.lang.String arg1, int arg2, int arg3);
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent() [345]
	      4  aload_0 [this]
	      5  iload_3 [arg2]
	      6  putfield javax.swing.JTextArea.rows : int [300]
	      9  aload_0 [this]
	     10  iload 4 [arg3]
	     12  putfield javax.swing.JTextArea.columns : int [298]
	     15  aload_1 [arg0]
	     16  ifnonnull 24
	     19  aload_0 [this]
	     20  invokevirtual javax.swing.JTextArea.createDefaultModel() : javax.swing.text.Document [334]
	     23  astore_1 [arg0]
	     24  aload_0 [this]
	     25  aload_1 [arg0]
	     26  invokevirtual javax.swing.JTextArea.setDocument(javax.swing.text.Document) : void [336]
	     29  aload_2 [arg1]
	     30  ifnull 44
	     33  aload_0 [this]
	     34  aload_2 [arg1]
	     35  invokevirtual javax.swing.JTextArea.setText(java.lang.String) : void [331]
	     38  aload_0 [this]
	     39  iconst_0
	     40  iconst_0
	     41  invokevirtual javax.swing.JTextArea.select(int, int) : void [327]
	     44  iload_3 [arg2]
	     45  ifge 75
	     48  new java.lang.IllegalArgumentException [177]
	     51  dup
	     52  new java.lang.StringBuilder [181]
	     55  dup
	     56  invokespecial java.lang.StringBuilder() [314]
	     59  ldc <String "rows: "> [20]
	     61  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     64  iload_3 [arg2]
	     65  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     68  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	     71  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	     74  athrow
	     75  iload 4 [arg3]
	     77  ifge 108
	     80  new java.lang.IllegalArgumentException [177]
	     83  dup
	     84  new java.lang.StringBuilder [181]
	     87  dup
	     88  invokespecial java.lang.StringBuilder() [314]
	     91  ldc <String "columns: "> [13]
	     93  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     96  iload 4 [arg3]
	     98  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	    101  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    104  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    107  athrow
	    108  aload_0 [this]
	    109  ldc <String "focusTraversalKeysForward"> [17]
	    111  invokestatic javax.swing.JComponent.getManagingFocusForwardTraversalKeys() : java.util.Set [319]
	    114  invokestatic javax.swing.LookAndFeel.installProperty(javax.swing.JComponent, java.lang.String, java.lang.Object) : void [340]
	    117  aload_0 [this]
	    118  ldc <String "focusTraversalKeysBackward"> [16]
	    120  invokestatic javax.swing.JComponent.getManagingFocusBackwardTraversalKeys() : java.util.Set [318]
	    123  invokestatic javax.swing.LookAndFeel.installProperty(javax.swing.JComponent, java.lang.String, java.lang.Object) : void [340]
	    126  return
	    Stack map table: number of frames 4
	        [pc: 24, full, stack: {}, locals: {javax.swing.JTextArea, javax.swing.text.Document, java.lang.String, int, int}]
	        [pc: 44, same]
	        [pc: 75, same]
	        [pc: 108, same]
	  
	  // Method descriptor #25 ()Ljava/lang/String;
	  // Stack: 1, Locals: 1
	  public java.lang.String getUIClassID();
	    0  ldc <String "TextAreaUI"> [11]
	    2  areturn

	  
	  // Method descriptor #211 ()Ljavax/swing/text/Document;
	  // Stack: 2, Locals: 1
	  protected javax.swing.text.Document createDefaultModel();
	    0  new javax.swing.text.PlainDocument [192]
	    3  dup
	    4  invokespecial javax.swing.text.PlainDocument() [351]
	    7  areturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 4, Locals: 4
	  public void setTabSize(int arg0);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  aload_2
	     6  ifnull 34
	     9  aload_0 [this]
	    10  invokevirtual javax.swing.JTextArea.getTabSize() : int [325]
	    13  istore_3
	    14  aload_2
	    15  ldc <String "tabSize"> [21]
	    17  iload_1 [arg0]
	    18  invokestatic java.lang.Integer.valueOf(int) : java.lang.Integer [311]
	    21  invokeinterface javax.swing.text.Document.putProperty(java.lang.Object, java.lang.Object) : void [356] [nargs: 3]
	    26  aload_0 [this]
	    27  ldc <String "tabSize"> [21]
	    29  iload_3
	    30  iload_1 [arg0]
	    31  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, int, int) : void [332]
	    34  return
	    Stack map table: number of frames 1
	        [pc: 34, append: {javax.swing.text.Document}]
	  
	  // Method descriptor #24 ()I
	  // Stack: 2, Locals: 4
	  public int getTabSize();
	     0  bipush 8
	     2  istore_1
	     3  aload_0 [this]
	     4  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     7  astore_2
	     8  aload_2
	     9  ifnull 33
	    12  aload_2
	    13  ldc <String "tabSize"> [21]
	    15  invokeinterface javax.swing.text.Document.getProperty(java.lang.Object) : java.lang.Object [355] [nargs: 2]
	    20  checkcast java.lang.Integer [178]
	    23  astore_3
	    24  aload_3
	    25  ifnull 33
	    28  aload_3
	    29  invokevirtual java.lang.Integer.intValue() : int [310]
	    32  istore_1
	    33  iload_1
	    34  ireturn
	    Stack map table: number of frames 1
	        [pc: 33, append: {int, javax.swing.text.Document}]
	  
	  // Method descriptor #38 (Z)V
	  // Stack: 4, Locals: 3
	  public void setLineWrap(boolean arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.wrap : boolean [302]
	     4  istore_2
	     5  aload_0 [this]
	     6  iload_1 [arg0]
	     7  putfield javax.swing.JTextArea.wrap : boolean [302]
	    10  aload_0 [this]
	    11  ldc <String "lineWrap"> [18]
	    13  iload_2
	    14  iload_1 [arg0]
	    15  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, boolean, boolean) : void [333]
	    18  return

	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getLineWrap();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.wrap : boolean [302]
	    4  ireturn

	  
	  // Method descriptor #38 (Z)V
	  // Stack: 4, Locals: 3
	  public void setWrapStyleWord(boolean arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.word : boolean [301]
	     4  istore_2
	     5  aload_0 [this]
	     6  iload_1 [arg0]
	     7  putfield javax.swing.JTextArea.word : boolean [301]
	    10  aload_0 [this]
	    11  ldc <String "wrapStyleWord"> [23]
	    13  iload_2
	    14  iload_1 [arg0]
	    15  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, boolean, boolean) : void [333]
	    18  return

	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getWrapStyleWord();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.word : boolean [301]
	    4  ireturn

	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 4
	  public int getLineOfOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Can't translate offset to line"> [7]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  aload_2
	    22  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    27  if_icmple 48
	    30  new javax.swing.text.BadLocationException [188]
	    33  dup
	    34  ldc <String "Can't translate offset to line"> [7]
	    36  aload_2
	    37  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    42  iconst_1
	    43  iadd
	    44  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    47  athrow
	    48  aload_0 [this]
	    49  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    52  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    57  astore_3
	    58  aload_3
	    59  iload_1 [arg0]
	    60  invokeinterface javax.swing.text.Element.getElementIndex(int) : int [361] [nargs: 2]
	    65  ireturn
	    Stack map table: number of frames 2
	        [pc: 20, append: {javax.swing.text.Document}]
	        [pc: 48, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 2
	  public int getLineCount();
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	     9  astore_1
	    10  aload_1
	    11  invokeinterface javax.swing.text.Element.getElementCount() : int [358] [nargs: 1]
	    16  ireturn

	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 5
	  public int getLineStartOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getLineCount() : int [323]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Negative line"> [9]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  iload_2
	    22  if_icmplt 46
	    25  new javax.swing.text.BadLocationException [188]
	    28  dup
	    29  ldc <String "No such line"> [10]
	    31  aload_0 [this]
	    32  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    35  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    40  iconst_1
	    41  iadd
	    42  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    45  athrow
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    50  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    55  astore_3
	    56  aload_3
	    57  iload_1 [arg0]
	    58  invokeinterface javax.swing.text.Element.getElement(int) : javax.swing.text.Element [362] [nargs: 2]
	    63  astore 4
	    65  aload 4
	    67  invokeinterface javax.swing.text.Element.getStartOffset() : int [360] [nargs: 1]
	    72  ireturn
	    Stack map table: number of frames 2
	        [pc: 20, append: {int}]
	        [pc: 46, same]
	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 6
	  public int getLineEndOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getLineCount() : int [323]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Negative line"> [9]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  iload_2
	    22  if_icmplt 46
	    25  new javax.swing.text.BadLocationException [188]
	    28  dup
	    29  ldc <String "No such line"> [10]
	    31  aload_0 [this]
	    32  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    35  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    40  iconst_1
	    41  iadd
	    42  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    45  athrow
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    50  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    55  astore_3
	    56  aload_3
	    57  iload_1 [arg0]
	    58  invokeinterface javax.swing.text.Element.getElement(int) : javax.swing.text.Element [362] [nargs: 2]
	    63  astore 4
	    65  aload 4
	    67  invokeinterface javax.swing.text.Element.getEndOffset() : int [359] [nargs: 1]
	    72  istore 5
	    74  iload_1 [arg0]
	    75  iload_2
	    76  iconst_1
	    77  isub
	    78  if_icmpne 88
	    81  iload 5
	    83  iconst_1
	    84  isub
	    85  goto 90
	    88  iload 5
	    90  ireturn
	    Stack map table: number of frames 4
	        [pc: 20, append: {int}]
	        [pc: 46, same]
	        [pc: 88, append: {javax.swing.text.Element, javax.swing.text.Element, int}]
	        [pc: 90, same_locals_1_stack_item, stack: {int}]
	  
	  // Method descriptor #201 (Ljava/lang/String;I)V
	  // Stack: 4, Locals: 5
	  public void insert(java.lang.String arg0, int arg1);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_3
	     5  aload_3
	     6  ifnull 36
	     9  aload_3
	    10  iload_2 [arg1]
	    11  aload_1 [arg0]
	    12  aconst_null
	    13  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    18  goto 36
	    21  astore 4
	    23  new java.lang.IllegalArgumentException [177]
	    26  dup
	    27  aload 4
	    29  invokevirtual javax.swing.text.BadLocationException.getMessage() : java.lang.String [343]
	    32  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    35  athrow
	    36  return
	      Exception Table:
	        [pc: 9, pc: 18] -> 21 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 2
	        [pc: 21, full, stack: {javax.swing.text.BadLocationException}, locals: {javax.swing.JTextArea, java.lang.String, int, javax.swing.text.Document}]
	        [pc: 36, same]
	  
	  // Method descriptor #37 (Ljava/lang/String;)V
	  // Stack: 4, Locals: 4
	  public void append(java.lang.String arg0);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  aload_2
	     6  ifnull 27
	     9  aload_2
	    10  aload_2
	    11  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    16  aload_1 [arg0]
	    17  aconst_null
	    18  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    23  goto 27
	    26  astore_3
	    27  return
	      Exception Table:
	        [pc: 9, pc: 23] -> 26 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 2
	        [pc: 26, full, stack: {javax.swing.text.BadLocationException}, locals: {javax.swing.JTextArea, java.lang.String, javax.swing.text.Document}]
	        [pc: 27, same]
	  
	  // Method descriptor #202 (Ljava/lang/String;II)V
	  // Stack: 5, Locals: 6
	  public void replaceRange(java.lang.String arg0, int arg1, int arg2);
	     0  iload_3 [arg2]
	     1  iload_2 [arg1]
	     2  if_icmpge 15
	     5  new java.lang.IllegalArgumentException [177]
	     8  dup
	     9  ldc <String "end before start"> [14]
	    11  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    14  athrow
	    15  aload_0 [this]
	    16  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    19  astore 4
	    21  aload 4
	    23  ifnull 90
	    26  aload 4
	    28  instanceof javax.swing.text.AbstractDocument [187]
	    31  ifeq 51
	    34  aload 4
	    36  checkcast javax.swing.text.AbstractDocument [187]
	    39  iload_2 [arg1]
	    40  iload_3 [arg2]
	    41  iload_2 [arg1]
	    42  isub
	    43  aload_1 [arg0]
	    44  aconst_null
	    45  invokevirtual javax.swing.text.AbstractDocument.replace(int, int, java.lang.String, javax.swing.text.AttributeSet) : void [342]
	    48  goto 72
	    51  aload 4
	    53  iload_2 [arg1]
	    54  iload_3 [arg2]
	    55  iload_2 [arg1]
	    56  isub
	    57  invokeinterface javax.swing.text.Document.remove(int, int) : void [353] [nargs: 3]
	    62  aload 4
	    64  iload_2 [arg1]
	    65  aload_1 [arg0]
	    66  aconst_null
	    67  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    72  goto 90
	    75  astore 5
	    77  new java.lang.IllegalArgumentException [177]
	    80  dup
	    81  aload 5
	    83  invokevirtual javax.swing.text.BadLocationException.getMessage() : java.lang.String [343]
	    86  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    89  athrow
	    90  return
	      Exception Table:
	        [pc: 26, pc: 72] -> 75 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 5
	        [pc: 15, same]
	        [pc: 51, append: {javax.swing.text.Document}]
	        [pc: 72, same]
	        [pc: 75, same_locals_1_stack_item, stack: {javax.swing.text.BadLocationException}]
	        [pc: 90, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 1
	  public int getRows();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.rows : int [300]
	    4  ireturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 3, Locals: 3
	  public void setRows(int arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.rows : int [300]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 19
	     9  new java.lang.IllegalArgumentException [177]
	    12  dup
	    13  ldc <String "rows less than zero."> [19]
	    15  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    18  athrow
	    19  iload_1 [arg0]
	    20  iload_2
	    21  if_icmpeq 33
	    24  aload_0 [this]
	    25  iload_1 [arg0]
	    26  putfield javax.swing.JTextArea.rows : int [300]
	    29  aload_0 [this]
	    30  invokevirtual javax.swing.JTextArea.invalidate() : void [326]
	    33  return
	    Stack map table: number of frames 2
	        [pc: 19, append: {int}]
	        [pc: 33, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 2, Locals: 2
	  protected int getRowHeight();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.rowHeight : int [299]
	     4  ifne 24
	     7  aload_0 [this]
	     8  aload_0 [this]
	     9  invokevirtual javax.swing.JTextArea.getFont() : java.awt.Font [328]
	    12  invokevirtual javax.swing.JTextArea.getFontMetrics(java.awt.Font) : java.awt.FontMetrics [337]
	    15  astore_1
	    16  aload_0 [this]
	    17  aload_1
	    18  invokevirtual java.awt.FontMetrics.getHeight() : int [306]
	    21  putfield javax.swing.JTextArea.rowHeight : int [299]
	    24  aload_0 [this]
	    25  getfield javax.swing.JTextArea.rowHeight : int [299]
	    28  ireturn
	    Stack map table: number of frames 1
	        [pc: 24, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 1
	  public int getColumns();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.columns : int [298]
	    4  ireturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 3, Locals: 3
	  public void setColumns(int arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.columns : int [298]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 19
	     9  new java.lang.IllegalArgumentException [177]
	    12  dup
	    13  ldc <String "columns less than zero."> [12]
	    15  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    18  athrow
	    19  iload_1 [arg0]
	    20  iload_2
	    21  if_icmpeq 33
	    24  aload_0 [this]
	    25  iload_1 [arg0]
	    26  putfield javax.swing.JTextArea.columns : int [298]
	    29  aload_0 [this]
	    30  invokevirtual javax.swing.JTextArea.invalidate() : void [326]
	    33  return
	    Stack map table: number of frames 2
	        [pc: 19, append: {int}]
	        [pc: 33, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 3, Locals: 2
	  protected int getColumnWidth();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.columnWidth : int [297]
	     4  ifne 26
	     7  aload_0 [this]
	     8  aload_0 [this]
	     9  invokevirtual javax.swing.JTextArea.getFont() : java.awt.Font [328]
	    12  invokevirtual javax.swing.JTextArea.getFontMetrics(java.awt.Font) : java.awt.FontMetrics [337]
	    15  astore_1
	    16  aload_0 [this]
	    17  aload_1
	    18  bipush 109
	    20  invokevirtual java.awt.FontMetrics.charWidth(char) : int [307]
	    23  putfield javax.swing.JTextArea.columnWidth : int [297]
	    26  aload_0 [this]
	    27  getfield javax.swing.JTextArea.columnWidth : int [297]
	    30  ireturn
	    Stack map table: number of frames 1
	        [pc: 26, same]
	  
	  // Method descriptor #195 ()Ljava/awt/Dimension;
	  // Stack: 4, Locals: 3
	  public java.awt.Dimension getPreferredSize();
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent.getPreferredSize() : java.awt.Dimension [348]
	      4  astore_1
	      5  aload_1
	      6  ifnonnull 25
	      9  new java.awt.Dimension [172]
	     12  dup
	     13  sipush 400
	     16  sipush 400
	     19  invokespecial java.awt.Dimension(int, int) [305]
	     22  goto 26
	     25  aload_1
	     26  astore_1
	     27  aload_0 [this]
	     28  invokevirtual javax.swing.JTextArea.getInsets() : java.awt.Insets [329]
	     31  astore_2
	     32  aload_0 [this]
	     33  getfield javax.swing.JTextArea.columns : int [298]
	     36  ifeq 69
	     39  aload_1
	     40  aload_1
	     41  getfield java.awt.Dimension.width : int [292]
	     44  aload_0 [this]
	     45  getfield javax.swing.JTextArea.columns : int [298]
	     48  aload_0 [this]
	     49  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	     52  imul
	     53  aload_2
	     54  getfield java.awt.Insets.left : int [294]
	     57  iadd
	     58  aload_2
	     59  getfield java.awt.Insets.right : int [295]
	     62  iadd
	     63  invokestatic java.lang.Math.max(int, int) : int [312]
	     66  putfield java.awt.Dimension.width : int [292]
	     69  aload_0 [this]
	     70  getfield javax.swing.JTextArea.rows : int [300]
	     73  ifeq 106
	     76  aload_1
	     77  aload_1
	     78  getfield java.awt.Dimension.height : int [291]
	     81  aload_0 [this]
	     82  getfield javax.swing.JTextArea.rows : int [300]
	     85  aload_0 [this]
	     86  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	     89  imul
	     90  aload_2
	     91  getfield java.awt.Insets.top : int [296]
	     94  iadd
	     95  aload_2
	     96  getfield java.awt.Insets.bottom : int [293]
	     99  iadd
	    100  invokestatic java.lang.Math.max(int, int) : int [312]
	    103  putfield java.awt.Dimension.height : int [291]
	    106  aload_1
	    107  areturn
	    Stack map table: number of frames 4
	        [pc: 25, append: {java.awt.Dimension}]
	        [pc: 26, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 69, append: {java.awt.Insets}]
	        [pc: 106, same]
	  
	  // Method descriptor #197 (Ljava/awt/Font;)V
	  // Stack: 2, Locals: 2
	  public void setFont(java.awt.Font arg0);
	     0  aload_0 [this]
	     1  aload_1 [arg0]
	     2  invokespecial javax.swing.text.JTextComponent.setFont(java.awt.Font) : void [349]
	     5  aload_0 [this]
	     6  iconst_0
	     7  putfield javax.swing.JTextArea.rowHeight : int [299]
	    10  aload_0 [this]
	    11  iconst_0
	    12  putfield javax.swing.JTextArea.columnWidth : int [297]
	    15  return

	  
	  // Method descriptor #25 ()Ljava/lang/String;
	  // Stack: 2, Locals: 3
	  protected java.lang.String paramString();
	      0  aload_0 [this]
	      1  getfield javax.swing.JTextArea.wrap : boolean [302]
	      4  ifeq 12
	      7  ldc <String "true"> [22]
	      9  goto 14
	     12  ldc <String "false"> [15]
	     14  astore_1
	     15  aload_0 [this]
	     16  getfield javax.swing.JTextArea.word : boolean [301]
	     19  ifeq 27
	     22  ldc <String "true"> [22]
	     24  goto 29
	     27  ldc <String "false"> [15]
	     29  astore_2
	     30  new java.lang.StringBuilder [181]
	     33  dup
	     34  invokespecial java.lang.StringBuilder() [314]
	     37  aload_0 [this]
	     38  invokespecial javax.swing.text.JTextComponent.paramString() : java.lang.String [350]
	     41  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     44  ldc <String ",colums="> [2]
	     46  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     49  aload_0 [this]
	     50  getfield javax.swing.JTextArea.columns : int [298]
	     53  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     56  ldc <String ",columWidth="> [1]
	     58  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     61  aload_0 [this]
	     62  getfield javax.swing.JTextArea.columnWidth : int [297]
	     65  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     68  ldc <String ",rows="> [4]
	     70  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     73  aload_0 [this]
	     74  getfield javax.swing.JTextArea.rows : int [300]
	     77  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     80  ldc <String ",rowHeight="> [3]
	     82  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     85  aload_0 [this]
	     86  getfield javax.swing.JTextArea.rowHeight : int [299]
	     89  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     92  ldc <String ",word="> [5]
	     94  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     97  aload_2
	     98  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    101  ldc <String ",wrap="> [6]
	    103  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    106  aload_1
	    107  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    110  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    113  areturn
	    Stack map table: number of frames 4
	        [pc: 12, same]
	        [pc: 14, same_locals_1_stack_item, stack: {java.lang.String}]
	        [pc: 27, append: {java.lang.String}]
	        [pc: 29, same_locals_1_stack_item, stack: {java.lang.String}]
	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getScrollableTracksViewportWidth();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.wrap : boolean [302]
	     4  ifeq 11
	     7  iconst_1
	     8  goto 15
	    11  aload_0 [this]
	    12  invokespecial javax.swing.text.JTextComponent.getScrollableTracksViewportWidth() : boolean [346]
	    15  ireturn
	    Stack map table: number of frames 2
	        [pc: 11, same]
	        [pc: 15, same_locals_1_stack_item, stack: {int}]
	  
	  // Method descriptor #195 ()Ljava/awt/Dimension;
	  // Stack: 4, Locals: 3
	  public java.awt.Dimension getPreferredScrollableViewportSize();
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent.getPreferredScrollableViewportSize() : java.awt.Dimension [347]
	      4  astore_1
	      5  aload_1
	      6  ifnonnull 25
	      9  new java.awt.Dimension [172]
	     12  dup
	     13  sipush 400
	     16  sipush 400
	     19  invokespecial java.awt.Dimension(int, int) [305]
	     22  goto 26
	     25  aload_1
	     26  astore_1
	     27  aload_0 [this]
	     28  invokevirtual javax.swing.JTextArea.getInsets() : java.awt.Insets [329]
	     31  astore_2
	     32  aload_1
	     33  aload_0 [this]
	     34  getfield javax.swing.JTextArea.columns : int [298]
	     37  ifne 47
	     40  aload_1
	     41  getfield java.awt.Dimension.width : int [292]
	     44  goto 66
	     47  aload_0 [this]
	     48  getfield javax.swing.JTextArea.columns : int [298]
	     51  aload_0 [this]
	     52  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	     55  imul
	     56  aload_2
	     57  getfield java.awt.Insets.left : int [294]
	     60  iadd
	     61  aload_2
	     62  getfield java.awt.Insets.right : int [295]
	     65  iadd
	     66  putfield java.awt.Dimension.width : int [292]
	     69  aload_1
	     70  aload_0 [this]
	     71  getfield javax.swing.JTextArea.rows : int [300]
	     74  ifne 84
	     77  aload_1
	     78  getfield java.awt.Dimension.height : int [291]
	     81  goto 103
	     84  aload_0 [this]
	     85  getfield javax.swing.JTextArea.rows : int [300]
	     88  aload_0 [this]
	     89  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	     92  imul
	     93  aload_2
	     94  getfield java.awt.Insets.top : int [296]
	     97  iadd
	     98  aload_2
	     99  getfield java.awt.Insets.bottom : int [293]
	    102  iadd
	    103  putfield java.awt.Dimension.height : int [291]
	    106  aload_1
	    107  areturn
	    Stack map table: number of frames 6
	        [pc: 25, append: {java.awt.Dimension}]
	        [pc: 26, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 47, full, stack: {java.awt.Dimension}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	        [pc: 66, full, stack: {java.awt.Dimension, int}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	        [pc: 84, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 103, full, stack: {java.awt.Dimension, int}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	  
	  // Method descriptor #199 (Ljava/awt/Rectangle;II)I
	  // Stack: 4, Locals: 4
	  public int getScrollableUnitIncrement(java.awt.Rectangle arg0, int arg1, int arg2);
	     0  iload_2 [arg1]
	     1  lookupswitch default: 38
	          case 0: 33
	          case 1: 28
	    28  aload_0 [this]
	    29  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	    32  ireturn
	    33  aload_0 [this]
	    34  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	    37  ireturn
	    38  new java.lang.IllegalArgumentException [177]
	    41  dup
	    42  new java.lang.StringBuilder [181]
	    45  dup
	    46  invokespecial java.lang.StringBuilder() [314]
	    49  ldc <String "Invalid orientation: "> [8]
	    51  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    54  iload_2 [arg1]
	    55  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	    58  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    61  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    64  athrow
	    Stack map table: number of frames 3
	        [pc: 28, same]
	        [pc: 33, same]
	        [pc: 38, same]
	  
	  // Method descriptor #33 (Ljava/io/ObjectOutputStream;)V
	  // Stack: 3, Locals: 3
	  private void writeObject(java.io.ObjectOutputStream arg0) throws java.io.IOException;
	     0  aload_1 [arg0]
	     1  invokevirtual java.io.ObjectOutputStream.defaultWriteObject() : void [308]
	     4  aload_0 [this]
	     5  invokevirtual javax.swing.JTextArea.getUIClassID() : java.lang.String [330]
	     8  ldc <String "TextAreaUI"> [11]
	    10  invokevirtual java.lang.String.equals(java.lang.Object) : boolean [313]
	    13  ifeq 50
	    16  aload_0 [this]
	    17  invokestatic javax.swing.JComponent.getWriteObjCounter(javax.swing.JComponent) : byte [320]
	    20  istore_2
	    21  aload_0 [this]
	    22  iload_2
	    23  iconst_1
	    24  isub
	    25  i2b
	    26  istore_2
	    27  iload_2
	    28  invokestatic javax.swing.JComponent.setWriteObjCounter(javax.swing.JComponent, byte) : void [321]
	    31  iload_2
	    32  ifne 50
	    35  aload_0 [this]
	    36  getfield javax.swing.JTextArea.ui : javax.swing.plaf.ComponentUI [304]
	    39  ifnull 50
	    42  aload_0 [this]
	    43  getfield javax.swing.JTextArea.ui : javax.swing.plaf.ComponentUI [304]
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.plaf.ComponentUI.installUI(javax.swing.JComponent) : void [341]
	    50  return
	    Stack map table: number of frames 1
	        [pc: 50, same]
	  
	  // Method descriptor #206 ()Ljavax/accessibility/AccessibleContext;
	  // Stack: 4, Locals: 1
	  public javax.accessibility.AccessibleContext getAccessibleContext();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	     4  ifnonnull 19
	     7  aload_0 [this]
	     8  new javax.swing.JTextArea$AccessibleJTextArea [184]
	    11  dup
	    12  aload_0 [this]
	    13  invokespecial javax.swing.JTextArea$AccessibleJTextArea(javax.swing.JTextArea) [339]
	    16  putfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	    19  aload_0 [this]
	    20  getfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	    23  areturn
	    Stack map table: number of frames 1
	        [pc: 19, same]

	  Inner classes:
	    [inner class info: #184 javax/swing/JTextArea$AccessibleJTextArea, outer class info: #183 javax/swing/JTextArea
	     inner name: #363 AccessibleJTextArea, accessflags: 4 protected]
	}//  (version 1.8 : 52.0, super bit)
public class javax.swing.JTextArea extends javax.swing.text.JTextComponent {
	  
	  // Field descriptor #53 Ljava/lang/String;
	  private static final java.lang.String uiClassID = "TextAreaUI";
	  
	  // Field descriptor #50 I
	  private int rows;
	  
	  // Field descriptor #50 I
	  private int columns;
	  
	  // Field descriptor #50 I
	  private int columnWidth;
	  
	  // Field descriptor #50 I
	  private int rowHeight;
	  
	  // Field descriptor #58 Z
	  private boolean wrap;
	  
	  // Field descriptor #58 Z
	  private boolean word;
	  
	  // Method descriptor #26 ()V
	  // Stack: 5, Locals: 1
	  public JTextArea();
	    0  aload_0 [this]
	    1  aconst_null
	    2  aconst_null
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #37 (Ljava/lang/String;)V
	  // Stack: 5, Locals: 2
	  public JTextArea(java.lang.String arg0);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aload_1 [arg0]
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #32 (II)V
	  // Stack: 5, Locals: 3
	  public JTextArea(int arg0, int arg1);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aconst_null
	    3  iload_1 [arg0]
	    4  iload_2 [arg1]
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #202 (Ljava/lang/String;II)V
	  // Stack: 5, Locals: 4
	  public JTextArea(java.lang.String arg0, int arg1, int arg2);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aload_1 [arg0]
	    3  iload_2 [arg1]
	    4  iload_3 [arg2]
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #212 (Ljavax/swing/text/Document;)V
	  // Stack: 5, Locals: 2
	  public JTextArea(javax.swing.text.Document arg0);
	    0  aload_0 [this]
	    1  aload_1 [arg0]
	    2  aconst_null
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #216 (Ljavax/swing/text/Document;Ljava/lang/String;II)V
	  // Stack: 4, Locals: 5
	  public JTextArea(javax.swing.text.Document arg0, java.lang.String arg1, int arg2, int arg3);
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent() [345]
	      4  aload_0 [this]
	      5  iload_3 [arg2]
	      6  putfield javax.swing.JTextArea.rows : int [300]
	      9  aload_0 [this]
	     10  iload 4 [arg3]
	     12  putfield javax.swing.JTextArea.columns : int [298]
	     15  aload_1 [arg0]
	     16  ifnonnull 24
	     19  aload_0 [this]
	     20  invokevirtual javax.swing.JTextArea.createDefaultModel() : javax.swing.text.Document [334]
	     23  astore_1 [arg0]
	     24  aload_0 [this]
	     25  aload_1 [arg0]
	     26  invokevirtual javax.swing.JTextArea.setDocument(javax.swing.text.Document) : void [336]
	     29  aload_2 [arg1]
	     30  ifnull 44
	     33  aload_0 [this]
	     34  aload_2 [arg1]
	     35  invokevirtual javax.swing.JTextArea.setText(java.lang.String) : void [331]
	     38  aload_0 [this]
	     39  iconst_0
	     40  iconst_0
	     41  invokevirtual javax.swing.JTextArea.select(int, int) : void [327]
	     44  iload_3 [arg2]
	     45  ifge 75
	     48  new java.lang.IllegalArgumentException [177]
	     51  dup
	     52  new java.lang.StringBuilder [181]
	     55  dup
	     56  invokespecial java.lang.StringBuilder() [314]
	     59  ldc <String "rows: "> [20]
	     61  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     64  iload_3 [arg2]
	     65  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     68  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	     71  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	     74  athrow
	     75  iload 4 [arg3]
	     77  ifge 108
	     80  new java.lang.IllegalArgumentException [177]
	     83  dup
	     84  new java.lang.StringBuilder [181]
	     87  dup
	     88  invokespecial java.lang.StringBuilder() [314]
	     91  ldc <String "columns: "> [13]
	     93  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     96  iload 4 [arg3]
	     98  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	    101  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    104  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    107  athrow
	    108  aload_0 [this]
	    109  ldc <String "focusTraversalKeysForward"> [17]
	    111  invokestatic javax.swing.JComponent.getManagingFocusForwardTraversalKeys() : java.util.Set [319]
	    114  invokestatic javax.swing.LookAndFeel.installProperty(javax.swing.JComponent, java.lang.String, java.lang.Object) : void [340]
	    117  aload_0 [this]
	    118  ldc <String "focusTraversalKeysBackward"> [16]
	    120  invokestatic javax.swing.JComponent.getManagingFocusBackwardTraversalKeys() : java.util.Set [318]
	    123  invokestatic javax.swing.LookAndFeel.installProperty(javax.swing.JComponent, java.lang.String, java.lang.Object) : void [340]
	    126  return
	    Stack map table: number of frames 4
	        [pc: 24, full, stack: {}, locals: {javax.swing.JTextArea, javax.swing.text.Document, java.lang.String, int, int}]
	        [pc: 44, same]
	        [pc: 75, same]
	        [pc: 108, same]
	  
	  // Method descriptor #25 ()Ljava/lang/String;
	  // Stack: 1, Locals: 1
	  public java.lang.String getUIClassID();
	    0  ldc <String "TextAreaUI"> [11]
	    2  areturn

	  
	  // Method descriptor #211 ()Ljavax/swing/text/Document;
	  // Stack: 2, Locals: 1
	  protected javax.swing.text.Document createDefaultModel();
	    0  new javax.swing.text.PlainDocument [192]
	    3  dup
	    4  invokespecial javax.swing.text.PlainDocument() [351]
	    7  areturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 4, Locals: 4
	  public void setTabSize(int arg0);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  aload_2
	     6  ifnull 34
	     9  aload_0 [this]
	    10  invokevirtual javax.swing.JTextArea.getTabSize() : int [325]
	    13  istore_3
	    14  aload_2
	    15  ldc <String "tabSize"> [21]
	    17  iload_1 [arg0]
	    18  invokestatic java.lang.Integer.valueOf(int) : java.lang.Integer [311]
	    21  invokeinterface javax.swing.text.Document.putProperty(java.lang.Object, java.lang.Object) : void [356] [nargs: 3]
	    26  aload_0 [this]
	    27  ldc <String "tabSize"> [21]
	    29  iload_3
	    30  iload_1 [arg0]
	    31  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, int, int) : void [332]
	    34  return
	    Stack map table: number of frames 1
	        [pc: 34, append: {javax.swing.text.Document}]
	  
	  // Method descriptor #24 ()I
	  // Stack: 2, Locals: 4
	  public int getTabSize();
	     0  bipush 8
	     2  istore_1
	     3  aload_0 [this]
	     4  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     7  astore_2
	     8  aload_2
	     9  ifnull 33
	    12  aload_2
	    13  ldc <String "tabSize"> [21]
	    15  invokeinterface javax.swing.text.Document.getProperty(java.lang.Object) : java.lang.Object [355] [nargs: 2]
	    20  checkcast java.lang.Integer [178]
	    23  astore_3
	    24  aload_3
	    25  ifnull 33
	    28  aload_3
	    29  invokevirtual java.lang.Integer.intValue() : int [310]
	    32  istore_1
	    33  iload_1
	    34  ireturn
	    Stack map table: number of frames 1
	        [pc: 33, append: {int, javax.swing.text.Document}]
	  
	  // Method descriptor #38 (Z)V
	  // Stack: 4, Locals: 3
	  public void setLineWrap(boolean arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.wrap : boolean [302]
	     4  istore_2
	     5  aload_0 [this]
	     6  iload_1 [arg0]
	     7  putfield javax.swing.JTextArea.wrap : boolean [302]
	    10  aload_0 [this]
	    11  ldc <String "lineWrap"> [18]
	    13  iload_2
	    14  iload_1 [arg0]
	    15  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, boolean, boolean) : void [333]
	    18  return

	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getLineWrap();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.wrap : boolean [302]
	    4  ireturn

	  
	  // Method descriptor #38 (Z)V
	  // Stack: 4, Locals: 3
	  public void setWrapStyleWord(boolean arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.word : boolean [301]
	     4  istore_2
	     5  aload_0 [this]
	     6  iload_1 [arg0]
	     7  putfield javax.swing.JTextArea.word : boolean [301]
	    10  aload_0 [this]
	    11  ldc <String "wrapStyleWord"> [23]
	    13  iload_2
	    14  iload_1 [arg0]
	    15  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, boolean, boolean) : void [333]
	    18  return

	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getWrapStyleWord();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.word : boolean [301]
	    4  ireturn

	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 4
	  public int getLineOfOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Can't translate offset to line"> [7]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  aload_2
	    22  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    27  if_icmple 48
	    30  new javax.swing.text.BadLocationException [188]
	    33  dup
	    34  ldc <String "Can't translate offset to line"> [7]
	    36  aload_2
	    37  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    42  iconst_1
	    43  iadd
	    44  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    47  athrow
	    48  aload_0 [this]
	    49  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    52  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    57  astore_3
	    58  aload_3
	    59  iload_1 [arg0]
	    60  invokeinterface javax.swing.text.Element.getElementIndex(int) : int [361] [nargs: 2]
	    65  ireturn
	    Stack map table: number of frames 2
	        [pc: 20, append: {javax.swing.text.Document}]
	        [pc: 48, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 2
	  public int getLineCount();
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	     9  astore_1
	    10  aload_1
	    11  invokeinterface javax.swing.text.Element.getElementCount() : int [358] [nargs: 1]
	    16  ireturn

	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 5
	  public int getLineStartOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getLineCount() : int [323]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Negative line"> [9]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  iload_2
	    22  if_icmplt 46
	    25  new javax.swing.text.BadLocationException [188]
	    28  dup
	    29  ldc <String "No such line"> [10]
	    31  aload_0 [this]
	    32  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    35  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    40  iconst_1
	    41  iadd
	    42  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    45  athrow
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    50  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    55  astore_3
	    56  aload_3
	    57  iload_1 [arg0]
	    58  invokeinterface javax.swing.text.Element.getElement(int) : javax.swing.text.Element [362] [nargs: 2]
	    63  astore 4
	    65  aload 4
	    67  invokeinterface javax.swing.text.Element.getStartOffset() : int [360] [nargs: 1]
	    72  ireturn
	    Stack map table: number of frames 2
	        [pc: 20, append: {int}]
	        [pc: 46, same]
	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 6
	  public int getLineEndOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getLineCount() : int [323]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Negative line"> [9]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  iload_2
	    22  if_icmplt 46
	    25  new javax.swing.text.BadLocationException [188]
	    28  dup
	    29  ldc <String "No such line"> [10]
	    31  aload_0 [this]
	    32  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    35  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    40  iconst_1
	    41  iadd
	    42  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    45  athrow
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    50  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    55  astore_3
	    56  aload_3
	    57  iload_1 [arg0]
	    58  invokeinterface javax.swing.text.Element.getElement(int) : javax.swing.text.Element [362] [nargs: 2]
	    63  astore 4
	    65  aload 4
	    67  invokeinterface javax.swing.text.Element.getEndOffset() : int [359] [nargs: 1]
	    72  istore 5
	    74  iload_1 [arg0]
	    75  iload_2
	    76  iconst_1
	    77  isub
	    78  if_icmpne 88
	    81  iload 5
	    83  iconst_1
	    84  isub
	    85  goto 90
	    88  iload 5
	    90  ireturn
	    Stack map table: number of frames 4
	        [pc: 20, append: {int}]
	        [pc: 46, same]
	        [pc: 88, append: {javax.swing.text.Element, javax.swing.text.Element, int}]
	        [pc: 90, same_locals_1_stack_item, stack: {int}]
	  
	  // Method descriptor #201 (Ljava/lang/String;I)V
	  // Stack: 4, Locals: 5
	  public void insert(java.lang.String arg0, int arg1);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_3
	     5  aload_3
	     6  ifnull 36
	     9  aload_3
	    10  iload_2 [arg1]
	    11  aload_1 [arg0]
	    12  aconst_null
	    13  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    18  goto 36
	    21  astore 4
	    23  new java.lang.IllegalArgumentException [177]
	    26  dup
	    27  aload 4
	    29  invokevirtual javax.swing.text.BadLocationException.getMessage() : java.lang.String [343]
	    32  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    35  athrow
	    36  return
	      Exception Table:
	        [pc: 9, pc: 18] -> 21 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 2
	        [pc: 21, full, stack: {javax.swing.text.BadLocationException}, locals: {javax.swing.JTextArea, java.lang.String, int, javax.swing.text.Document}]
	        [pc: 36, same]
	  
	  // Method descriptor #37 (Ljava/lang/String;)V
	  // Stack: 4, Locals: 4
	  public void append(java.lang.String arg0);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  aload_2
	     6  ifnull 27
	     9  aload_2
	    10  aload_2
	    11  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    16  aload_1 [arg0]
	    17  aconst_null
	    18  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    23  goto 27
	    26  astore_3
	    27  return
	      Exception Table:
	        [pc: 9, pc: 23] -> 26 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 2
	        [pc: 26, full, stack: {javax.swing.text.BadLocationException}, locals: {javax.swing.JTextArea, java.lang.String, javax.swing.text.Document}]
	        [pc: 27, same]
	  
	  // Method descriptor #202 (Ljava/lang/String;II)V
	  // Stack: 5, Locals: 6
	  public void replaceRange(java.lang.String arg0, int arg1, int arg2);
	     0  iload_3 [arg2]
	     1  iload_2 [arg1]
	     2  if_icmpge 15
	     5  new java.lang.IllegalArgumentException [177]
	     8  dup
	     9  ldc <String "end before start"> [14]
	    11  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    14  athrow
	    15  aload_0 [this]
	    16  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    19  astore 4
	    21  aload 4
	    23  ifnull 90
	    26  aload 4
	    28  instanceof javax.swing.text.AbstractDocument [187]
	    31  ifeq 51
	    34  aload 4
	    36  checkcast javax.swing.text.AbstractDocument [187]
	    39  iload_2 [arg1]
	    40  iload_3 [arg2]
	    41  iload_2 [arg1]
	    42  isub
	    43  aload_1 [arg0]
	    44  aconst_null
	    45  invokevirtual javax.swing.text.AbstractDocument.replace(int, int, java.lang.String, javax.swing.text.AttributeSet) : void [342]
	    48  goto 72
	    51  aload 4
	    53  iload_2 [arg1]
	    54  iload_3 [arg2]
	    55  iload_2 [arg1]
	    56  isub
	    57  invokeinterface javax.swing.text.Document.remove(int, int) : void [353] [nargs: 3]
	    62  aload 4
	    64  iload_2 [arg1]
	    65  aload_1 [arg0]
	    66  aconst_null
	    67  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    72  goto 90
	    75  astore 5
	    77  new java.lang.IllegalArgumentException [177]
	    80  dup
	    81  aload 5
	    83  invokevirtual javax.swing.text.BadLocationException.getMessage() : java.lang.String [343]
	    86  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    89  athrow
	    90  return
	      Exception Table:
	        [pc: 26, pc: 72] -> 75 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 5
	        [pc: 15, same]
	        [pc: 51, append: {javax.swing.text.Document}]
	        [pc: 72, same]
	        [pc: 75, same_locals_1_stack_item, stack: {javax.swing.text.BadLocationException}]
	        [pc: 90, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 1
	  public int getRows();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.rows : int [300]
	    4  ireturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 3, Locals: 3
	  public void setRows(int arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.rows : int [300]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 19
	     9  new java.lang.IllegalArgumentException [177]
	    12  dup
	    13  ldc <String "rows less than zero."> [19]
	    15  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    18  athrow
	    19  iload_1 [arg0]
	    20  iload_2
	    21  if_icmpeq 33
	    24  aload_0 [this]
	    25  iload_1 [arg0]
	    26  putfield javax.swing.JTextArea.rows : int [300]
	    29  aload_0 [this]
	    30  invokevirtual javax.swing.JTextArea.invalidate() : void [326]
	    33  return
	    Stack map table: number of frames 2
	        [pc: 19, append: {int}]
	        [pc: 33, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 2, Locals: 2
	  protected int getRowHeight();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.rowHeight : int [299]
	     4  ifne 24
	     7  aload_0 [this]
	     8  aload_0 [this]
	     9  invokevirtual javax.swing.JTextArea.getFont() : java.awt.Font [328]
	    12  invokevirtual javax.swing.JTextArea.getFontMetrics(java.awt.Font) : java.awt.FontMetrics [337]
	    15  astore_1
	    16  aload_0 [this]
	    17  aload_1
	    18  invokevirtual java.awt.FontMetrics.getHeight() : int [306]
	    21  putfield javax.swing.JTextArea.rowHeight : int [299]
	    24  aload_0 [this]
	    25  getfield javax.swing.JTextArea.rowHeight : int [299]
	    28  ireturn
	    Stack map table: number of frames 1
	        [pc: 24, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 1
	  public int getColumns();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.columns : int [298]
	    4  ireturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 3, Locals: 3
	  public void setColumns(int arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.columns : int [298]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 19
	     9  new java.lang.IllegalArgumentException [177]
	    12  dup
	    13  ldc <String "columns less than zero."> [12]
	    15  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    18  athrow
	    19  iload_1 [arg0]
	    20  iload_2
	    21  if_icmpeq 33
	    24  aload_0 [this]
	    25  iload_1 [arg0]
	    26  putfield javax.swing.JTextArea.columns : int [298]
	    29  aload_0 [this]
	    30  invokevirtual javax.swing.JTextArea.invalidate() : void [326]
	    33  return
	    Stack map table: number of frames 2
	        [pc: 19, append: {int}]
	        [pc: 33, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 3, Locals: 2
	  protected int getColumnWidth();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.columnWidth : int [297]
	     4  ifne 26
	     7  aload_0 [this]
	     8  aload_0 [this]
	     9  invokevirtual javax.swing.JTextArea.getFont() : java.awt.Font [328]
	    12  invokevirtual javax.swing.JTextArea.getFontMetrics(java.awt.Font) : java.awt.FontMetrics [337]
	    15  astore_1
	    16  aload_0 [this]
	    17  aload_1
	    18  bipush 109
	    20  invokevirtual java.awt.FontMetrics.charWidth(char) : int [307]
	    23  putfield javax.swing.JTextArea.columnWidth : int [297]
	    26  aload_0 [this]
	    27  getfield javax.swing.JTextArea.columnWidth : int [297]
	    30  ireturn
	    Stack map table: number of frames 1
	        [pc: 26, same]
	  
	  // Method descriptor #195 ()Ljava/awt/Dimension;
	  // Stack: 4, Locals: 3
	  public java.awt.Dimension getPreferredSize();
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent.getPreferredSize() : java.awt.Dimension [348]
	      4  astore_1
	      5  aload_1
	      6  ifnonnull 25
	      9  new java.awt.Dimension [172]
	     12  dup
	     13  sipush 400
	     16  sipush 400
	     19  invokespecial java.awt.Dimension(int, int) [305]
	     22  goto 26
	     25  aload_1
	     26  astore_1
	     27  aload_0 [this]
	     28  invokevirtual javax.swing.JTextArea.getInsets() : java.awt.Insets [329]
	     31  astore_2
	     32  aload_0 [this]
	     33  getfield javax.swing.JTextArea.columns : int [298]
	     36  ifeq 69
	     39  aload_1
	     40  aload_1
	     41  getfield java.awt.Dimension.width : int [292]
	     44  aload_0 [this]
	     45  getfield javax.swing.JTextArea.columns : int [298]
	     48  aload_0 [this]
	     49  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	     52  imul
	     53  aload_2
	     54  getfield java.awt.Insets.left : int [294]
	     57  iadd
	     58  aload_2
	     59  getfield java.awt.Insets.right : int [295]
	     62  iadd
	     63  invokestatic java.lang.Math.max(int, int) : int [312]
	     66  putfield java.awt.Dimension.width : int [292]
	     69  aload_0 [this]
	     70  getfield javax.swing.JTextArea.rows : int [300]
	     73  ifeq 106
	     76  aload_1
	     77  aload_1
	     78  getfield java.awt.Dimension.height : int [291]
	     81  aload_0 [this]
	     82  getfield javax.swing.JTextArea.rows : int [300]
	     85  aload_0 [this]
	     86  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	     89  imul
	     90  aload_2
	     91  getfield java.awt.Insets.top : int [296]
	     94  iadd
	     95  aload_2
	     96  getfield java.awt.Insets.bottom : int [293]
	     99  iadd
	    100  invokestatic java.lang.Math.max(int, int) : int [312]
	    103  putfield java.awt.Dimension.height : int [291]
	    106  aload_1
	    107  areturn
	    Stack map table: number of frames 4
	        [pc: 25, append: {java.awt.Dimension}]
	        [pc: 26, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 69, append: {java.awt.Insets}]
	        [pc: 106, same]
	  
	  // Method descriptor #197 (Ljava/awt/Font;)V
	  // Stack: 2, Locals: 2
	  public void setFont(java.awt.Font arg0);
	     0  aload_0 [this]
	     1  aload_1 [arg0]
	     2  invokespecial javax.swing.text.JTextComponent.setFont(java.awt.Font) : void [349]
	     5  aload_0 [this]
	     6  iconst_0
	     7  putfield javax.swing.JTextArea.rowHeight : int [299]
	    10  aload_0 [this]
	    11  iconst_0
	    12  putfield javax.swing.JTextArea.columnWidth : int [297]
	    15  return

	  
	  // Method descriptor #25 ()Ljava/lang/String;
	  // Stack: 2, Locals: 3
	  protected java.lang.String paramString();
	      0  aload_0 [this]
	      1  getfield javax.swing.JTextArea.wrap : boolean [302]
	      4  ifeq 12
	      7  ldc <String "true"> [22]
	      9  goto 14
	     12  ldc <String "false"> [15]
	     14  astore_1
	     15  aload_0 [this]
	     16  getfield javax.swing.JTextArea.word : boolean [301]
	     19  ifeq 27
	     22  ldc <String "true"> [22]
	     24  goto 29
	     27  ldc <String "false"> [15]
	     29  astore_2
	     30  new java.lang.StringBuilder [181]
	     33  dup
	     34  invokespecial java.lang.StringBuilder() [314]
	     37  aload_0 [this]
	     38  invokespecial javax.swing.text.JTextComponent.paramString() : java.lang.String [350]
	     41  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     44  ldc <String ",colums="> [2]
	     46  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     49  aload_0 [this]
	     50  getfield javax.swing.JTextArea.columns : int [298]
	     53  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     56  ldc <String ",columWidth="> [1]
	     58  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     61  aload_0 [this]
	     62  getfield javax.swing.JTextArea.columnWidth : int [297]
	     65  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     68  ldc <String ",rows="> [4]
	     70  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     73  aload_0 [this]
	     74  getfield javax.swing.JTextArea.rows : int [300]
	     77  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     80  ldc <String ",rowHeight="> [3]
	     82  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     85  aload_0 [this]
	     86  getfield javax.swing.JTextArea.rowHeight : int [299]
	     89  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     92  ldc <String ",word="> [5]
	     94  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     97  aload_2
	     98  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    101  ldc <String ",wrap="> [6]
	    103  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    106  aload_1
	    107  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    110  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    113  areturn
	    Stack map table: number of frames 4
	        [pc: 12, same]
	        [pc: 14, same_locals_1_stack_item, stack: {java.lang.String}]
	        [pc: 27, append: {java.lang.String}]
	        [pc: 29, same_locals_1_stack_item, stack: {java.lang.String}]
	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getScrollableTracksViewportWidth();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.wrap : boolean [302]
	     4  ifeq 11
	     7  iconst_1
	     8  goto 15
	    11  aload_0 [this]
	    12  invokespecial javax.swing.text.JTextComponent.getScrollableTracksViewportWidth() : boolean [346]
	    15  ireturn
	    Stack map table: number of frames 2
	        [pc: 11, same]
	        [pc: 15, same_locals_1_stack_item, stack: {int}]
	  
	  // Method descriptor #195 ()Ljava/awt/Dimension;
	  // Stack: 4, Locals: 3
	  public java.awt.Dimension getPreferredScrollableViewportSize();
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent.getPreferredScrollableViewportSize() : java.awt.Dimension [347]
	      4  astore_1
	      5  aload_1
	      6  ifnonnull 25
	      9  new java.awt.Dimension [172]
	     12  dup
	     13  sipush 400
	     16  sipush 400
	     19  invokespecial java.awt.Dimension(int, int) [305]
	     22  goto 26
	     25  aload_1
	     26  astore_1
	     27  aload_0 [this]
	     28  invokevirtual javax.swing.JTextArea.getInsets() : java.awt.Insets [329]
	     31  astore_2
	     32  aload_1
	     33  aload_0 [this]
	     34  getfield javax.swing.JTextArea.columns : int [298]
	     37  ifne 47
	     40  aload_1
	     41  getfield java.awt.Dimension.width : int [292]
	     44  goto 66
	     47  aload_0 [this]
	     48  getfield javax.swing.JTextArea.columns : int [298]
	     51  aload_0 [this]
	     52  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	     55  imul
	     56  aload_2
	     57  getfield java.awt.Insets.left : int [294]
	     60  iadd
	     61  aload_2
	     62  getfield java.awt.Insets.right : int [295]
	     65  iadd
	     66  putfield java.awt.Dimension.width : int [292]
	     69  aload_1
	     70  aload_0 [this]
	     71  getfield javax.swing.JTextArea.rows : int [300]
	     74  ifne 84
	     77  aload_1
	     78  getfield java.awt.Dimension.height : int [291]
	     81  goto 103
	     84  aload_0 [this]
	     85  getfield javax.swing.JTextArea.rows : int [300]
	     88  aload_0 [this]
	     89  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	     92  imul
	     93  aload_2
	     94  getfield java.awt.Insets.top : int [296]
	     97  iadd
	     98  aload_2
	     99  getfield java.awt.Insets.bottom : int [293]
	    102  iadd
	    103  putfield java.awt.Dimension.height : int [291]
	    106  aload_1
	    107  areturn
	    Stack map table: number of frames 6
	        [pc: 25, append: {java.awt.Dimension}]
	        [pc: 26, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 47, full, stack: {java.awt.Dimension}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	        [pc: 66, full, stack: {java.awt.Dimension, int}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	        [pc: 84, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 103, full, stack: {java.awt.Dimension, int}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	  
	  // Method descriptor #199 (Ljava/awt/Rectangle;II)I
	  // Stack: 4, Locals: 4
	  public int getScrollableUnitIncrement(java.awt.Rectangle arg0, int arg1, int arg2);
	     0  iload_2 [arg1]
	     1  lookupswitch default: 38
	          case 0: 33
	          case 1: 28
	    28  aload_0 [this]
	    29  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	    32  ireturn
	    33  aload_0 [this]
	    34  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	    37  ireturn
	    38  new java.lang.IllegalArgumentException [177]
	    41  dup
	    42  new java.lang.StringBuilder [181]
	    45  dup
	    46  invokespecial java.lang.StringBuilder() [314]
	    49  ldc <String "Invalid orientation: "> [8]
	    51  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    54  iload_2 [arg1]
	    55  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	    58  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    61  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    64  athrow
	    Stack map table: number of frames 3
	        [pc: 28, same]
	        [pc: 33, same]
	        [pc: 38, same]
	  
	  // Method descriptor #33 (Ljava/io/ObjectOutputStream;)V
	  // Stack: 3, Locals: 3
	  private void writeObject(java.io.ObjectOutputStream arg0) throws java.io.IOException;
	     0  aload_1 [arg0]
	     1  invokevirtual java.io.ObjectOutputStream.defaultWriteObject() : void [308]
	     4  aload_0 [this]
	     5  invokevirtual javax.swing.JTextArea.getUIClassID() : java.lang.String [330]
	     8  ldc <String "TextAreaUI"> [11]
	    10  invokevirtual java.lang.String.equals(java.lang.Object) : boolean [313]
	    13  ifeq 50
	    16  aload_0 [this]
	    17  invokestatic javax.swing.JComponent.getWriteObjCounter(javax.swing.JComponent) : byte [320]
	    20  istore_2
	    21  aload_0 [this]
	    22  iload_2
	    23  iconst_1
	    24  isub
	    25  i2b
	    26  istore_2
	    27  iload_2
	    28  invokestatic javax.swing.JComponent.setWriteObjCounter(javax.swing.JComponent, byte) : void [321]
	    31  iload_2
	    32  ifne 50
	    35  aload_0 [this]
	    36  getfield javax.swing.JTextArea.ui : javax.swing.plaf.ComponentUI [304]
	    39  ifnull 50
	    42  aload_0 [this]
	    43  getfield javax.swing.JTextArea.ui : javax.swing.plaf.ComponentUI [304]
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.plaf.ComponentUI.installUI(javax.swing.JComponent) : void [341]
	    50  return
	    Stack map table: number of frames 1
	        [pc: 50, same]
	  
	  // Method descriptor #206 ()Ljavax/accessibility/AccessibleContext;
	  // Stack: 4, Locals: 1
	  public javax.accessibility.AccessibleContext getAccessibleContext();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	     4  ifnonnull 19
	     7  aload_0 [this]
	     8  new javax.swing.JTextArea$AccessibleJTextArea [184]
	    11  dup
	    12  aload_0 [this]
	    13  invokespecial javax.swing.JTextArea$AccessibleJTextArea(javax.swing.JTextArea) [339]
	    16  putfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	    19  aload_0 [this]
	    20  getfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	    23  areturn
	    Stack map table: number of frames 1
	        [pc: 19, same]

	  Inner classes:
	    [inner class info: #184 javax/swing/JTextArea$AccessibleJTextArea, outer class info: #183 javax/swing/JTextArea
	     inner name: #363 AccessibleJTextArea, accessflags: 4 protected]
	}//  (version 1.8 : 52.0, super bit)
public class javax.swing.JTextArea extends javax.swing.text.JTextComponent {
	  
	  // Field descriptor #53 Ljava/lang/String;
	  private static final java.lang.String uiClassID = "TextAreaUI";
	  
	  // Field descriptor #50 I
	  private int rows;
	  
	  // Field descriptor #50 I
	  private int columns;
	  
	  // Field descriptor #50 I
	  private int columnWidth;
	  
	  // Field descriptor #50 I
	  private int rowHeight;
	  
	  // Field descriptor #58 Z
	  private boolean wrap;
	  
	  // Field descriptor #58 Z
	  private boolean word;
	  
	  // Method descriptor #26 ()V
	  // Stack: 5, Locals: 1
	  public JTextArea();
	    0  aload_0 [this]
	    1  aconst_null
	    2  aconst_null
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #37 (Ljava/lang/String;)V
	  // Stack: 5, Locals: 2
	  public JTextArea(java.lang.String arg0);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aload_1 [arg0]
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #32 (II)V
	  // Stack: 5, Locals: 3
	  public JTextArea(int arg0, int arg1);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aconst_null
	    3  iload_1 [arg0]
	    4  iload_2 [arg1]
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #202 (Ljava/lang/String;II)V
	  // Stack: 5, Locals: 4
	  public JTextArea(java.lang.String arg0, int arg1, int arg2);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aload_1 [arg0]
	    3  iload_2 [arg1]
	    4  iload_3 [arg2]
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #212 (Ljavax/swing/text/Document;)V
	  // Stack: 5, Locals: 2
	  public JTextArea(javax.swing.text.Document arg0);
	    0  aload_0 [this]
	    1  aload_1 [arg0]
	    2  aconst_null
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #216 (Ljavax/swing/text/Document;Ljava/lang/String;II)V
	  // Stack: 4, Locals: 5
	  public JTextArea(javax.swing.text.Document arg0, java.lang.String arg1, int arg2, int arg3);
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent() [345]
	      4  aload_0 [this]
	      5  iload_3 [arg2]
	      6  putfield javax.swing.JTextArea.rows : int [300]
	      9  aload_0 [this]
	     10  iload 4 [arg3]
	     12  putfield javax.swing.JTextArea.columns : int [298]
	     15  aload_1 [arg0]
	     16  ifnonnull 24
	     19  aload_0 [this]
	     20  invokevirtual javax.swing.JTextArea.createDefaultModel() : javax.swing.text.Document [334]
	     23  astore_1 [arg0]
	     24  aload_0 [this]
	     25  aload_1 [arg0]
	     26  invokevirtual javax.swing.JTextArea.setDocument(javax.swing.text.Document) : void [336]
	     29  aload_2 [arg1]
	     30  ifnull 44
	     33  aload_0 [this]
	     34  aload_2 [arg1]
	     35  invokevirtual javax.swing.JTextArea.setText(java.lang.String) : void [331]
	     38  aload_0 [this]
	     39  iconst_0
	     40  iconst_0
	     41  invokevirtual javax.swing.JTextArea.select(int, int) : void [327]
	     44  iload_3 [arg2]
	     45  ifge 75
	     48  new java.lang.IllegalArgumentException [177]
	     51  dup
	     52  new java.lang.StringBuilder [181]
	     55  dup
	     56  invokespecial java.lang.StringBuilder() [314]
	     59  ldc <String "rows: "> [20]
	     61  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     64  iload_3 [arg2]
	     65  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     68  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	     71  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	     74  athrow
	     75  iload 4 [arg3]
	     77  ifge 108
	     80  new java.lang.IllegalArgumentException [177]
	     83  dup
	     84  new java.lang.StringBuilder [181]
	     87  dup
	     88  invokespecial java.lang.StringBuilder() [314]
	     91  ldc <String "columns: "> [13]
	     93  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     96  iload 4 [arg3]
	     98  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	    101  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    104  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    107  athrow
	    108  aload_0 [this]
	    109  ldc <String "focusTraversalKeysForward"> [17]
	    111  invokestatic javax.swing.JComponent.getManagingFocusForwardTraversalKeys() : java.util.Set [319]
	    114  invokestatic javax.swing.LookAndFeel.installProperty(javax.swing.JComponent, java.lang.String, java.lang.Object) : void [340]
	    117  aload_0 [this]
	    118  ldc <String "focusTraversalKeysBackward"> [16]
	    120  invokestatic javax.swing.JComponent.getManagingFocusBackwardTraversalKeys() : java.util.Set [318]
	    123  invokestatic javax.swing.LookAndFeel.installProperty(javax.swing.JComponent, java.lang.String, java.lang.Object) : void [340]
	    126  return
	    Stack map table: number of frames 4
	        [pc: 24, full, stack: {}, locals: {javax.swing.JTextArea, javax.swing.text.Document, java.lang.String, int, int}]
	        [pc: 44, same]
	        [pc: 75, same]
	        [pc: 108, same]
	  
	  // Method descriptor #25 ()Ljava/lang/String;
	  // Stack: 1, Locals: 1
	  public java.lang.String getUIClassID();
	    0  ldc <String "TextAreaUI"> [11]
	    2  areturn

	  
	  // Method descriptor #211 ()Ljavax/swing/text/Document;
	  // Stack: 2, Locals: 1
	  protected javax.swing.text.Document createDefaultModel();
	    0  new javax.swing.text.PlainDocument [192]
	    3  dup
	    4  invokespecial javax.swing.text.PlainDocument() [351]
	    7  areturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 4, Locals: 4
	  public void setTabSize(int arg0);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  aload_2
	     6  ifnull 34
	     9  aload_0 [this]
	    10  invokevirtual javax.swing.JTextArea.getTabSize() : int [325]
	    13  istore_3
	    14  aload_2
	    15  ldc <String "tabSize"> [21]
	    17  iload_1 [arg0]
	    18  invokestatic java.lang.Integer.valueOf(int) : java.lang.Integer [311]
	    21  invokeinterface javax.swing.text.Document.putProperty(java.lang.Object, java.lang.Object) : void [356] [nargs: 3]
	    26  aload_0 [this]
	    27  ldc <String "tabSize"> [21]
	    29  iload_3
	    30  iload_1 [arg0]
	    31  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, int, int) : void [332]
	    34  return
	    Stack map table: number of frames 1
	        [pc: 34, append: {javax.swing.text.Document}]
	  
	  // Method descriptor #24 ()I
	  // Stack: 2, Locals: 4
	  public int getTabSize();
	     0  bipush 8
	     2  istore_1
	     3  aload_0 [this]
	     4  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     7  astore_2
	     8  aload_2
	     9  ifnull 33
	    12  aload_2
	    13  ldc <String "tabSize"> [21]
	    15  invokeinterface javax.swing.text.Document.getProperty(java.lang.Object) : java.lang.Object [355] [nargs: 2]
	    20  checkcast java.lang.Integer [178]
	    23  astore_3
	    24  aload_3
	    25  ifnull 33
	    28  aload_3
	    29  invokevirtual java.lang.Integer.intValue() : int [310]
	    32  istore_1
	    33  iload_1
	    34  ireturn
	    Stack map table: number of frames 1
	        [pc: 33, append: {int, javax.swing.text.Document}]
	  
	  // Method descriptor #38 (Z)V
	  // Stack: 4, Locals: 3
	  public void setLineWrap(boolean arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.wrap : boolean [302]
	     4  istore_2
	     5  aload_0 [this]
	     6  iload_1 [arg0]
	     7  putfield javax.swing.JTextArea.wrap : boolean [302]
	    10  aload_0 [this]
	    11  ldc <String "lineWrap"> [18]
	    13  iload_2
	    14  iload_1 [arg0]
	    15  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, boolean, boolean) : void [333]
	    18  return

	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getLineWrap();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.wrap : boolean [302]
	    4  ireturn

	  
	  // Method descriptor #38 (Z)V
	  // Stack: 4, Locals: 3
	  public void setWrapStyleWord(boolean arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.word : boolean [301]
	     4  istore_2
	     5  aload_0 [this]
	     6  iload_1 [arg0]
	     7  putfield javax.swing.JTextArea.word : boolean [301]
	    10  aload_0 [this]
	    11  ldc <String "wrapStyleWord"> [23]
	    13  iload_2
	    14  iload_1 [arg0]
	    15  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, boolean, boolean) : void [333]
	    18  return

	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getWrapStyleWord();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.word : boolean [301]
	    4  ireturn

	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 4
	  public int getLineOfOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Can't translate offset to line"> [7]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  aload_2
	    22  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    27  if_icmple 48
	    30  new javax.swing.text.BadLocationException [188]
	    33  dup
	    34  ldc <String "Can't translate offset to line"> [7]
	    36  aload_2
	    37  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    42  iconst_1
	    43  iadd
	    44  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    47  athrow
	    48  aload_0 [this]
	    49  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    52  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    57  astore_3
	    58  aload_3
	    59  iload_1 [arg0]
	    60  invokeinterface javax.swing.text.Element.getElementIndex(int) : int [361] [nargs: 2]
	    65  ireturn
	    Stack map table: number of frames 2
	        [pc: 20, append: {javax.swing.text.Document}]
	        [pc: 48, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 2
	  public int getLineCount();
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	     9  astore_1
	    10  aload_1
	    11  invokeinterface javax.swing.text.Element.getElementCount() : int [358] [nargs: 1]
	    16  ireturn

	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 5
	  public int getLineStartOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getLineCount() : int [323]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Negative line"> [9]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  iload_2
	    22  if_icmplt 46
	    25  new javax.swing.text.BadLocationException [188]
	    28  dup
	    29  ldc <String "No such line"> [10]
	    31  aload_0 [this]
	    32  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    35  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    40  iconst_1
	    41  iadd
	    42  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    45  athrow
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    50  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    55  astore_3
	    56  aload_3
	    57  iload_1 [arg0]
	    58  invokeinterface javax.swing.text.Element.getElement(int) : javax.swing.text.Element [362] [nargs: 2]
	    63  astore 4
	    65  aload 4
	    67  invokeinterface javax.swing.text.Element.getStartOffset() : int [360] [nargs: 1]
	    72  ireturn
	    Stack map table: number of frames 2
	        [pc: 20, append: {int}]
	        [pc: 46, same]
	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 6
	  public int getLineEndOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getLineCount() : int [323]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Negative line"> [9]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  iload_2
	    22  if_icmplt 46
	    25  new javax.swing.text.BadLocationException [188]
	    28  dup
	    29  ldc <String "No such line"> [10]
	    31  aload_0 [this]
	    32  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    35  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    40  iconst_1
	    41  iadd
	    42  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    45  athrow
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    50  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    55  astore_3
	    56  aload_3
	    57  iload_1 [arg0]
	    58  invokeinterface javax.swing.text.Element.getElement(int) : javax.swing.text.Element [362] [nargs: 2]
	    63  astore 4
	    65  aload 4
	    67  invokeinterface javax.swing.text.Element.getEndOffset() : int [359] [nargs: 1]
	    72  istore 5
	    74  iload_1 [arg0]
	    75  iload_2
	    76  iconst_1
	    77  isub
	    78  if_icmpne 88
	    81  iload 5
	    83  iconst_1
	    84  isub
	    85  goto 90
	    88  iload 5
	    90  ireturn
	    Stack map table: number of frames 4
	        [pc: 20, append: {int}]
	        [pc: 46, same]
	        [pc: 88, append: {javax.swing.text.Element, javax.swing.text.Element, int}]
	        [pc: 90, same_locals_1_stack_item, stack: {int}]
	  
	  // Method descriptor #201 (Ljava/lang/String;I)V
	  // Stack: 4, Locals: 5
	  public void insert(java.lang.String arg0, int arg1);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_3
	     5  aload_3
	     6  ifnull 36
	     9  aload_3
	    10  iload_2 [arg1]
	    11  aload_1 [arg0]
	    12  aconst_null
	    13  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    18  goto 36
	    21  astore 4
	    23  new java.lang.IllegalArgumentException [177]
	    26  dup
	    27  aload 4
	    29  invokevirtual javax.swing.text.BadLocationException.getMessage() : java.lang.String [343]
	    32  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    35  athrow
	    36  return
	      Exception Table:
	        [pc: 9, pc: 18] -> 21 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 2
	        [pc: 21, full, stack: {javax.swing.text.BadLocationException}, locals: {javax.swing.JTextArea, java.lang.String, int, javax.swing.text.Document}]
	        [pc: 36, same]
	  
	  // Method descriptor #37 (Ljava/lang/String;)V
	  // Stack: 4, Locals: 4
	  public void append(java.lang.String arg0);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  aload_2
	     6  ifnull 27
	     9  aload_2
	    10  aload_2
	    11  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    16  aload_1 [arg0]
	    17  aconst_null
	    18  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    23  goto 27
	    26  astore_3
	    27  return
	      Exception Table:
	        [pc: 9, pc: 23] -> 26 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 2
	        [pc: 26, full, stack: {javax.swing.text.BadLocationException}, locals: {javax.swing.JTextArea, java.lang.String, javax.swing.text.Document}]
	        [pc: 27, same]
	  
	  // Method descriptor #202 (Ljava/lang/String;II)V
	  // Stack: 5, Locals: 6
	  public void replaceRange(java.lang.String arg0, int arg1, int arg2);
	     0  iload_3 [arg2]
	     1  iload_2 [arg1]
	     2  if_icmpge 15
	     5  new java.lang.IllegalArgumentException [177]
	     8  dup
	     9  ldc <String "end before start"> [14]
	    11  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    14  athrow
	    15  aload_0 [this]
	    16  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    19  astore 4
	    21  aload 4
	    23  ifnull 90
	    26  aload 4
	    28  instanceof javax.swing.text.AbstractDocument [187]
	    31  ifeq 51
	    34  aload 4
	    36  checkcast javax.swing.text.AbstractDocument [187]
	    39  iload_2 [arg1]
	    40  iload_3 [arg2]
	    41  iload_2 [arg1]
	    42  isub
	    43  aload_1 [arg0]
	    44  aconst_null
	    45  invokevirtual javax.swing.text.AbstractDocument.replace(int, int, java.lang.String, javax.swing.text.AttributeSet) : void [342]
	    48  goto 72
	    51  aload 4
	    53  iload_2 [arg1]
	    54  iload_3 [arg2]
	    55  iload_2 [arg1]
	    56  isub
	    57  invokeinterface javax.swing.text.Document.remove(int, int) : void [353] [nargs: 3]
	    62  aload 4
	    64  iload_2 [arg1]
	    65  aload_1 [arg0]
	    66  aconst_null
	    67  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    72  goto 90
	    75  astore 5
	    77  new java.lang.IllegalArgumentException [177]
	    80  dup
	    81  aload 5
	    83  invokevirtual javax.swing.text.BadLocationException.getMessage() : java.lang.String [343]
	    86  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    89  athrow
	    90  return
	      Exception Table:
	        [pc: 26, pc: 72] -> 75 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 5
	        [pc: 15, same]
	        [pc: 51, append: {javax.swing.text.Document}]
	        [pc: 72, same]
	        [pc: 75, same_locals_1_stack_item, stack: {javax.swing.text.BadLocationException}]
	        [pc: 90, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 1
	  public int getRows();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.rows : int [300]
	    4  ireturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 3, Locals: 3
	  public void setRows(int arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.rows : int [300]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 19
	     9  new java.lang.IllegalArgumentException [177]
	    12  dup
	    13  ldc <String "rows less than zero."> [19]
	    15  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    18  athrow
	    19  iload_1 [arg0]
	    20  iload_2
	    21  if_icmpeq 33
	    24  aload_0 [this]
	    25  iload_1 [arg0]
	    26  putfield javax.swing.JTextArea.rows : int [300]
	    29  aload_0 [this]
	    30  invokevirtual javax.swing.JTextArea.invalidate() : void [326]
	    33  return
	    Stack map table: number of frames 2
	        [pc: 19, append: {int}]
	        [pc: 33, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 2, Locals: 2
	  protected int getRowHeight();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.rowHeight : int [299]
	     4  ifne 24
	     7  aload_0 [this]
	     8  aload_0 [this]
	     9  invokevirtual javax.swing.JTextArea.getFont() : java.awt.Font [328]
	    12  invokevirtual javax.swing.JTextArea.getFontMetrics(java.awt.Font) : java.awt.FontMetrics [337]
	    15  astore_1
	    16  aload_0 [this]
	    17  aload_1
	    18  invokevirtual java.awt.FontMetrics.getHeight() : int [306]
	    21  putfield javax.swing.JTextArea.rowHeight : int [299]
	    24  aload_0 [this]
	    25  getfield javax.swing.JTextArea.rowHeight : int [299]
	    28  ireturn
	    Stack map table: number of frames 1
	        [pc: 24, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 1
	  public int getColumns();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.columns : int [298]
	    4  ireturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 3, Locals: 3
	  public void setColumns(int arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.columns : int [298]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 19
	     9  new java.lang.IllegalArgumentException [177]
	    12  dup
	    13  ldc <String "columns less than zero."> [12]
	    15  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    18  athrow
	    19  iload_1 [arg0]
	    20  iload_2
	    21  if_icmpeq 33
	    24  aload_0 [this]
	    25  iload_1 [arg0]
	    26  putfield javax.swing.JTextArea.columns : int [298]
	    29  aload_0 [this]
	    30  invokevirtual javax.swing.JTextArea.invalidate() : void [326]
	    33  return
	    Stack map table: number of frames 2
	        [pc: 19, append: {int}]
	        [pc: 33, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 3, Locals: 2
	  protected int getColumnWidth();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.columnWidth : int [297]
	     4  ifne 26
	     7  aload_0 [this]
	     8  aload_0 [this]
	     9  invokevirtual javax.swing.JTextArea.getFont() : java.awt.Font [328]
	    12  invokevirtual javax.swing.JTextArea.getFontMetrics(java.awt.Font) : java.awt.FontMetrics [337]
	    15  astore_1
	    16  aload_0 [this]
	    17  aload_1
	    18  bipush 109
	    20  invokevirtual java.awt.FontMetrics.charWidth(char) : int [307]
	    23  putfield javax.swing.JTextArea.columnWidth : int [297]
	    26  aload_0 [this]
	    27  getfield javax.swing.JTextArea.columnWidth : int [297]
	    30  ireturn
	    Stack map table: number of frames 1
	        [pc: 26, same]
	  
	  // Method descriptor #195 ()Ljava/awt/Dimension;
	  // Stack: 4, Locals: 3
	  public java.awt.Dimension getPreferredSize();
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent.getPreferredSize() : java.awt.Dimension [348]
	      4  astore_1
	      5  aload_1
	      6  ifnonnull 25
	      9  new java.awt.Dimension [172]
	     12  dup
	     13  sipush 400
	     16  sipush 400
	     19  invokespecial java.awt.Dimension(int, int) [305]
	     22  goto 26
	     25  aload_1
	     26  astore_1
	     27  aload_0 [this]
	     28  invokevirtual javax.swing.JTextArea.getInsets() : java.awt.Insets [329]
	     31  astore_2
	     32  aload_0 [this]
	     33  getfield javax.swing.JTextArea.columns : int [298]
	     36  ifeq 69
	     39  aload_1
	     40  aload_1
	     41  getfield java.awt.Dimension.width : int [292]
	     44  aload_0 [this]
	     45  getfield javax.swing.JTextArea.columns : int [298]
	     48  aload_0 [this]
	     49  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	     52  imul
	     53  aload_2
	     54  getfield java.awt.Insets.left : int [294]
	     57  iadd
	     58  aload_2
	     59  getfield java.awt.Insets.right : int [295]
	     62  iadd
	     63  invokestatic java.lang.Math.max(int, int) : int [312]
	     66  putfield java.awt.Dimension.width : int [292]
	     69  aload_0 [this]
	     70  getfield javax.swing.JTextArea.rows : int [300]
	     73  ifeq 106
	     76  aload_1
	     77  aload_1
	     78  getfield java.awt.Dimension.height : int [291]
	     81  aload_0 [this]
	     82  getfield javax.swing.JTextArea.rows : int [300]
	     85  aload_0 [this]
	     86  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	     89  imul
	     90  aload_2
	     91  getfield java.awt.Insets.top : int [296]
	     94  iadd
	     95  aload_2
	     96  getfield java.awt.Insets.bottom : int [293]
	     99  iadd
	    100  invokestatic java.lang.Math.max(int, int) : int [312]
	    103  putfield java.awt.Dimension.height : int [291]
	    106  aload_1
	    107  areturn
	    Stack map table: number of frames 4
	        [pc: 25, append: {java.awt.Dimension}]
	        [pc: 26, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 69, append: {java.awt.Insets}]
	        [pc: 106, same]
	  
	  // Method descriptor #197 (Ljava/awt/Font;)V
	  // Stack: 2, Locals: 2
	  public void setFont(java.awt.Font arg0);
	     0  aload_0 [this]
	     1  aload_1 [arg0]
	     2  invokespecial javax.swing.text.JTextComponent.setFont(java.awt.Font) : void [349]
	     5  aload_0 [this]
	     6  iconst_0
	     7  putfield javax.swing.JTextArea.rowHeight : int [299]
	    10  aload_0 [this]
	    11  iconst_0
	    12  putfield javax.swing.JTextArea.columnWidth : int [297]
	    15  return

	  
	  // Method descriptor #25 ()Ljava/lang/String;
	  // Stack: 2, Locals: 3
	  protected java.lang.String paramString();
	      0  aload_0 [this]
	      1  getfield javax.swing.JTextArea.wrap : boolean [302]
	      4  ifeq 12
	      7  ldc <String "true"> [22]
	      9  goto 14
	     12  ldc <String "false"> [15]
	     14  astore_1
	     15  aload_0 [this]
	     16  getfield javax.swing.JTextArea.word : boolean [301]
	     19  ifeq 27
	     22  ldc <String "true"> [22]
	     24  goto 29
	     27  ldc <String "false"> [15]
	     29  astore_2
	     30  new java.lang.StringBuilder [181]
	     33  dup
	     34  invokespecial java.lang.StringBuilder() [314]
	     37  aload_0 [this]
	     38  invokespecial javax.swing.text.JTextComponent.paramString() : java.lang.String [350]
	     41  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     44  ldc <String ",colums="> [2]
	     46  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     49  aload_0 [this]
	     50  getfield javax.swing.JTextArea.columns : int [298]
	     53  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     56  ldc <String ",columWidth="> [1]
	     58  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     61  aload_0 [this]
	     62  getfield javax.swing.JTextArea.columnWidth : int [297]
	     65  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     68  ldc <String ",rows="> [4]
	     70  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     73  aload_0 [this]
	     74  getfield javax.swing.JTextArea.rows : int [300]
	     77  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     80  ldc <String ",rowHeight="> [3]
	     82  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     85  aload_0 [this]
	     86  getfield javax.swing.JTextArea.rowHeight : int [299]
	     89  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     92  ldc <String ",word="> [5]
	     94  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     97  aload_2
	     98  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    101  ldc <String ",wrap="> [6]
	    103  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    106  aload_1
	    107  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    110  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    113  areturn
	    Stack map table: number of frames 4
	        [pc: 12, same]
	        [pc: 14, same_locals_1_stack_item, stack: {java.lang.String}]
	        [pc: 27, append: {java.lang.String}]
	        [pc: 29, same_locals_1_stack_item, stack: {java.lang.String}]
	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getScrollableTracksViewportWidth();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.wrap : boolean [302]
	     4  ifeq 11
	     7  iconst_1
	     8  goto 15
	    11  aload_0 [this]
	    12  invokespecial javax.swing.text.JTextComponent.getScrollableTracksViewportWidth() : boolean [346]
	    15  ireturn
	    Stack map table: number of frames 2
	        [pc: 11, same]
	        [pc: 15, same_locals_1_stack_item, stack: {int}]
	  
	  // Method descriptor #195 ()Ljava/awt/Dimension;
	  // Stack: 4, Locals: 3
	  public java.awt.Dimension getPreferredScrollableViewportSize();
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent.getPreferredScrollableViewportSize() : java.awt.Dimension [347]
	      4  astore_1
	      5  aload_1
	      6  ifnonnull 25
	      9  new java.awt.Dimension [172]
	     12  dup
	     13  sipush 400
	     16  sipush 400
	     19  invokespecial java.awt.Dimension(int, int) [305]
	     22  goto 26
	     25  aload_1
	     26  astore_1
	     27  aload_0 [this]
	     28  invokevirtual javax.swing.JTextArea.getInsets() : java.awt.Insets [329]
	     31  astore_2
	     32  aload_1
	     33  aload_0 [this]
	     34  getfield javax.swing.JTextArea.columns : int [298]
	     37  ifne 47
	     40  aload_1
	     41  getfield java.awt.Dimension.width : int [292]
	     44  goto 66
	     47  aload_0 [this]
	     48  getfield javax.swing.JTextArea.columns : int [298]
	     51  aload_0 [this]
	     52  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	     55  imul
	     56  aload_2
	     57  getfield java.awt.Insets.left : int [294]
	     60  iadd
	     61  aload_2
	     62  getfield java.awt.Insets.right : int [295]
	     65  iadd
	     66  putfield java.awt.Dimension.width : int [292]
	     69  aload_1
	     70  aload_0 [this]
	     71  getfield javax.swing.JTextArea.rows : int [300]
	     74  ifne 84
	     77  aload_1
	     78  getfield java.awt.Dimension.height : int [291]
	     81  goto 103
	     84  aload_0 [this]
	     85  getfield javax.swing.JTextArea.rows : int [300]
	     88  aload_0 [this]
	     89  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	     92  imul
	     93  aload_2
	     94  getfield java.awt.Insets.top : int [296]
	     97  iadd
	     98  aload_2
	     99  getfield java.awt.Insets.bottom : int [293]
	    102  iadd
	    103  putfield java.awt.Dimension.height : int [291]
	    106  aload_1
	    107  areturn
	    Stack map table: number of frames 6
	        [pc: 25, append: {java.awt.Dimension}]
	        [pc: 26, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 47, full, stack: {java.awt.Dimension}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	        [pc: 66, full, stack: {java.awt.Dimension, int}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	        [pc: 84, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 103, full, stack: {java.awt.Dimension, int}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	  
	  // Method descriptor #199 (Ljava/awt/Rectangle;II)I
	  // Stack: 4, Locals: 4
	  public int getScrollableUnitIncrement(java.awt.Rectangle arg0, int arg1, int arg2);
	     0  iload_2 [arg1]
	     1  lookupswitch default: 38
	          case 0: 33
	          case 1: 28
	    28  aload_0 [this]
	    29  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	    32  ireturn
	    33  aload_0 [this]
	    34  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	    37  ireturn
	    38  new java.lang.IllegalArgumentException [177]
	    41  dup
	    42  new java.lang.StringBuilder [181]
	    45  dup
	    46  invokespecial java.lang.StringBuilder() [314]
	    49  ldc <String "Invalid orientation: "> [8]
	    51  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    54  iload_2 [arg1]
	    55  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	    58  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    61  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    64  athrow
	    Stack map table: number of frames 3
	        [pc: 28, same]
	        [pc: 33, same]
	        [pc: 38, same]
	  
	  // Method descriptor #33 (Ljava/io/ObjectOutputStream;)V
	  // Stack: 3, Locals: 3
	  private void writeObject(java.io.ObjectOutputStream arg0) throws java.io.IOException;
	     0  aload_1 [arg0]
	     1  invokevirtual java.io.ObjectOutputStream.defaultWriteObject() : void [308]
	     4  aload_0 [this]
	     5  invokevirtual javax.swing.JTextArea.getUIClassID() : java.lang.String [330]
	     8  ldc <String "TextAreaUI"> [11]
	    10  invokevirtual java.lang.String.equals(java.lang.Object) : boolean [313]
	    13  ifeq 50
	    16  aload_0 [this]
	    17  invokestatic javax.swing.JComponent.getWriteObjCounter(javax.swing.JComponent) : byte [320]
	    20  istore_2
	    21  aload_0 [this]
	    22  iload_2
	    23  iconst_1
	    24  isub
	    25  i2b
	    26  istore_2
	    27  iload_2
	    28  invokestatic javax.swing.JComponent.setWriteObjCounter(javax.swing.JComponent, byte) : void [321]
	    31  iload_2
	    32  ifne 50
	    35  aload_0 [this]
	    36  getfield javax.swing.JTextArea.ui : javax.swing.plaf.ComponentUI [304]
	    39  ifnull 50
	    42  aload_0 [this]
	    43  getfield javax.swing.JTextArea.ui : javax.swing.plaf.ComponentUI [304]
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.plaf.ComponentUI.installUI(javax.swing.JComponent) : void [341]
	    50  return
	    Stack map table: number of frames 1
	        [pc: 50, same]
	  
	  // Method descriptor #206 ()Ljavax/accessibility/AccessibleContext;
	  // Stack: 4, Locals: 1
	  public javax.accessibility.AccessibleContext getAccessibleContext();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	     4  ifnonnull 19
	     7  aload_0 [this]
	     8  new javax.swing.JTextArea$AccessibleJTextArea [184]
	    11  dup
	    12  aload_0 [this]
	    13  invokespecial javax.swing.JTextArea$AccessibleJTextArea(javax.swing.JTextArea) [339]
	    16  putfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	    19  aload_0 [this]
	    20  getfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	    23  areturn
	    Stack map table: number of frames 1
	        [pc: 19, same]

	  Inner classes:
	    [inner class info: #184 javax/swing/JTextArea$AccessibleJTextArea, outer class info: #183 javax/swing/JTextArea
	     inner name: #363 AccessibleJTextArea, accessflags: 4 protected]
	}//  (version 1.8 : 52.0, super bit)
public class javax.swing.JTextArea extends javax.swing.text.JTextComponent {
	  
	  // Field descriptor #53 Ljava/lang/String;
	  private static final java.lang.String uiClassID = "TextAreaUI";
	  
	  // Field descriptor #50 I
	  private int rows;
	  
	  // Field descriptor #50 I
	  private int columns;
	  
	  // Field descriptor #50 I
	  private int columnWidth;
	  
	  // Field descriptor #50 I
	  private int rowHeight;
	  
	  // Field descriptor #58 Z
	  private boolean wrap;
	  
	  // Field descriptor #58 Z
	  private boolean word;
	  
	  // Method descriptor #26 ()V
	  // Stack: 5, Locals: 1
	  public JTextArea();
	    0  aload_0 [this]
	    1  aconst_null
	    2  aconst_null
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #37 (Ljava/lang/String;)V
	  // Stack: 5, Locals: 2
	  public JTextArea(java.lang.String arg0);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aload_1 [arg0]
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #32 (II)V
	  // Stack: 5, Locals: 3
	  public JTextArea(int arg0, int arg1);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aconst_null
	    3  iload_1 [arg0]
	    4  iload_2 [arg1]
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #202 (Ljava/lang/String;II)V
	  // Stack: 5, Locals: 4
	  public JTextArea(java.lang.String arg0, int arg1, int arg2);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aload_1 [arg0]
	    3  iload_2 [arg1]
	    4  iload_3 [arg2]
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #212 (Ljavax/swing/text/Document;)V
	  // Stack: 5, Locals: 2
	  public JTextArea(javax.swing.text.Document arg0);
	    0  aload_0 [this]
	    1  aload_1 [arg0]
	    2  aconst_null
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #216 (Ljavax/swing/text/Document;Ljava/lang/String;II)V
	  // Stack: 4, Locals: 5
	  public JTextArea(javax.swing.text.Document arg0, java.lang.String arg1, int arg2, int arg3);
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent() [345]
	      4  aload_0 [this]
	      5  iload_3 [arg2]
	      6  putfield javax.swing.JTextArea.rows : int [300]
	      9  aload_0 [this]
	     10  iload 4 [arg3]
	     12  putfield javax.swing.JTextArea.columns : int [298]
	     15  aload_1 [arg0]
	     16  ifnonnull 24
	     19  aload_0 [this]
	     20  invokevirtual javax.swing.JTextArea.createDefaultModel() : javax.swing.text.Document [334]
	     23  astore_1 [arg0]
	     24  aload_0 [this]
	     25  aload_1 [arg0]
	     26  invokevirtual javax.swing.JTextArea.setDocument(javax.swing.text.Document) : void [336]
	     29  aload_2 [arg1]
	     30  ifnull 44
	     33  aload_0 [this]
	     34  aload_2 [arg1]
	     35  invokevirtual javax.swing.JTextArea.setText(java.lang.String) : void [331]
	     38  aload_0 [this]
	     39  iconst_0
	     40  iconst_0
	     41  invokevirtual javax.swing.JTextArea.select(int, int) : void [327]
	     44  iload_3 [arg2]
	     45  ifge 75
	     48  new java.lang.IllegalArgumentException [177]
	     51  dup
	     52  new java.lang.StringBuilder [181]
	     55  dup
	     56  invokespecial java.lang.StringBuilder() [314]
	     59  ldc <String "rows: "> [20]
	     61  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     64  iload_3 [arg2]
	     65  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     68  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	     71  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	     74  athrow
	     75  iload 4 [arg3]
	     77  ifge 108
	     80  new java.lang.IllegalArgumentException [177]
	     83  dup
	     84  new java.lang.StringBuilder [181]
	     87  dup
	     88  invokespecial java.lang.StringBuilder() [314]
	     91  ldc <String "columns: "> [13]
	     93  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     96  iload 4 [arg3]
	     98  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	    101  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    104  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    107  athrow
	    108  aload_0 [this]
	    109  ldc <String "focusTraversalKeysForward"> [17]
	    111  invokestatic javax.swing.JComponent.getManagingFocusForwardTraversalKeys() : java.util.Set [319]
	    114  invokestatic javax.swing.LookAndFeel.installProperty(javax.swing.JComponent, java.lang.String, java.lang.Object) : void [340]
	    117  aload_0 [this]
	    118  ldc <String "focusTraversalKeysBackward"> [16]
	    120  invokestatic javax.swing.JComponent.getManagingFocusBackwardTraversalKeys() : java.util.Set [318]
	    123  invokestatic javax.swing.LookAndFeel.installProperty(javax.swing.JComponent, java.lang.String, java.lang.Object) : void [340]
	    126  return
	    Stack map table: number of frames 4
	        [pc: 24, full, stack: {}, locals: {javax.swing.JTextArea, javax.swing.text.Document, java.lang.String, int, int}]
	        [pc: 44, same]
	        [pc: 75, same]
	        [pc: 108, same]
	  
	  // Method descriptor #25 ()Ljava/lang/String;
	  // Stack: 1, Locals: 1
	  public java.lang.String getUIClassID();
	    0  ldc <String "TextAreaUI"> [11]
	    2  areturn

	  
	  // Method descriptor #211 ()Ljavax/swing/text/Document;
	  // Stack: 2, Locals: 1
	  protected javax.swing.text.Document createDefaultModel();
	    0  new javax.swing.text.PlainDocument [192]
	    3  dup
	    4  invokespecial javax.swing.text.PlainDocument() [351]
	    7  areturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 4, Locals: 4
	  public void setTabSize(int arg0);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  aload_2
	     6  ifnull 34
	     9  aload_0 [this]
	    10  invokevirtual javax.swing.JTextArea.getTabSize() : int [325]
	    13  istore_3
	    14  aload_2
	    15  ldc <String "tabSize"> [21]
	    17  iload_1 [arg0]
	    18  invokestatic java.lang.Integer.valueOf(int) : java.lang.Integer [311]
	    21  invokeinterface javax.swing.text.Document.putProperty(java.lang.Object, java.lang.Object) : void [356] [nargs: 3]
	    26  aload_0 [this]
	    27  ldc <String "tabSize"> [21]
	    29  iload_3
	    30  iload_1 [arg0]
	    31  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, int, int) : void [332]
	    34  return
	    Stack map table: number of frames 1
	        [pc: 34, append: {javax.swing.text.Document}]
	  
	  // Method descriptor #24 ()I
	  // Stack: 2, Locals: 4
	  public int getTabSize();
	     0  bipush 8
	     2  istore_1
	     3  aload_0 [this]
	     4  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     7  astore_2
	     8  aload_2
	     9  ifnull 33
	    12  aload_2
	    13  ldc <String "tabSize"> [21]
	    15  invokeinterface javax.swing.text.Document.getProperty(java.lang.Object) : java.lang.Object [355] [nargs: 2]
	    20  checkcast java.lang.Integer [178]
	    23  astore_3
	    24  aload_3
	    25  ifnull 33
	    28  aload_3
	    29  invokevirtual java.lang.Integer.intValue() : int [310]
	    32  istore_1
	    33  iload_1
	    34  ireturn
	    Stack map table: number of frames 1
	        [pc: 33, append: {int, javax.swing.text.Document}]
	  
	  // Method descriptor #38 (Z)V
	  // Stack: 4, Locals: 3
	  public void setLineWrap(boolean arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.wrap : boolean [302]
	     4  istore_2
	     5  aload_0 [this]
	     6  iload_1 [arg0]
	     7  putfield javax.swing.JTextArea.wrap : boolean [302]
	    10  aload_0 [this]
	    11  ldc <String "lineWrap"> [18]
	    13  iload_2
	    14  iload_1 [arg0]
	    15  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, boolean, boolean) : void [333]
	    18  return

	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getLineWrap();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.wrap : boolean [302]
	    4  ireturn

	  
	  // Method descriptor #38 (Z)V
	  // Stack: 4, Locals: 3
	  public void setWrapStyleWord(boolean arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.word : boolean [301]
	     4  istore_2
	     5  aload_0 [this]
	     6  iload_1 [arg0]
	     7  putfield javax.swing.JTextArea.word : boolean [301]
	    10  aload_0 [this]
	    11  ldc <String "wrapStyleWord"> [23]
	    13  iload_2
	    14  iload_1 [arg0]
	    15  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, boolean, boolean) : void [333]
	    18  return

	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getWrapStyleWord();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.word : boolean [301]
	    4  ireturn

	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 4
	  public int getLineOfOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Can't translate offset to line"> [7]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  aload_2
	    22  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    27  if_icmple 48
	    30  new javax.swing.text.BadLocationException [188]
	    33  dup
	    34  ldc <String "Can't translate offset to line"> [7]
	    36  aload_2
	    37  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    42  iconst_1
	    43  iadd
	    44  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    47  athrow
	    48  aload_0 [this]
	    49  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    52  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    57  astore_3
	    58  aload_3
	    59  iload_1 [arg0]
	    60  invokeinterface javax.swing.text.Element.getElementIndex(int) : int [361] [nargs: 2]
	    65  ireturn
	    Stack map table: number of frames 2
	        [pc: 20, append: {javax.swing.text.Document}]
	        [pc: 48, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 2
	  public int getLineCount();
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	     9  astore_1
	    10  aload_1
	    11  invokeinterface javax.swing.text.Element.getElementCount() : int [358] [nargs: 1]
	    16  ireturn

	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 5
	  public int getLineStartOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getLineCount() : int [323]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Negative line"> [9]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  iload_2
	    22  if_icmplt 46
	    25  new javax.swing.text.BadLocationException [188]
	    28  dup
	    29  ldc <String "No such line"> [10]
	    31  aload_0 [this]
	    32  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    35  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    40  iconst_1
	    41  iadd
	    42  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    45  athrow
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    50  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    55  astore_3
	    56  aload_3
	    57  iload_1 [arg0]
	    58  invokeinterface javax.swing.text.Element.getElement(int) : javax.swing.text.Element [362] [nargs: 2]
	    63  astore 4
	    65  aload 4
	    67  invokeinterface javax.swing.text.Element.getStartOffset() : int [360] [nargs: 1]
	    72  ireturn
	    Stack map table: number of frames 2
	        [pc: 20, append: {int}]
	        [pc: 46, same]
	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 6
	  public int getLineEndOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getLineCount() : int [323]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Negative line"> [9]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  iload_2
	    22  if_icmplt 46
	    25  new javax.swing.text.BadLocationException [188]
	    28  dup
	    29  ldc <String "No such line"> [10]
	    31  aload_0 [this]
	    32  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    35  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    40  iconst_1
	    41  iadd
	    42  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    45  athrow
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    50  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    55  astore_3
	    56  aload_3
	    57  iload_1 [arg0]
	    58  invokeinterface javax.swing.text.Element.getElement(int) : javax.swing.text.Element [362] [nargs: 2]
	    63  astore 4
	    65  aload 4
	    67  invokeinterface javax.swing.text.Element.getEndOffset() : int [359] [nargs: 1]
	    72  istore 5
	    74  iload_1 [arg0]
	    75  iload_2
	    76  iconst_1
	    77  isub
	    78  if_icmpne 88
	    81  iload 5
	    83  iconst_1
	    84  isub
	    85  goto 90
	    88  iload 5
	    90  ireturn
	    Stack map table: number of frames 4
	        [pc: 20, append: {int}]
	        [pc: 46, same]
	        [pc: 88, append: {javax.swing.text.Element, javax.swing.text.Element, int}]
	        [pc: 90, same_locals_1_stack_item, stack: {int}]
	  
	  // Method descriptor #201 (Ljava/lang/String;I)V
	  // Stack: 4, Locals: 5
	  public void insert(java.lang.String arg0, int arg1);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_3
	     5  aload_3
	     6  ifnull 36
	     9  aload_3
	    10  iload_2 [arg1]
	    11  aload_1 [arg0]
	    12  aconst_null
	    13  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    18  goto 36
	    21  astore 4
	    23  new java.lang.IllegalArgumentException [177]
	    26  dup
	    27  aload 4
	    29  invokevirtual javax.swing.text.BadLocationException.getMessage() : java.lang.String [343]
	    32  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    35  athrow
	    36  return
	      Exception Table:
	        [pc: 9, pc: 18] -> 21 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 2
	        [pc: 21, full, stack: {javax.swing.text.BadLocationException}, locals: {javax.swing.JTextArea, java.lang.String, int, javax.swing.text.Document}]
	        [pc: 36, same]
	  
	  // Method descriptor #37 (Ljava/lang/String;)V
	  // Stack: 4, Locals: 4
	  public void append(java.lang.String arg0);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  aload_2
	     6  ifnull 27
	     9  aload_2
	    10  aload_2
	    11  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    16  aload_1 [arg0]
	    17  aconst_null
	    18  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    23  goto 27
	    26  astore_3
	    27  return
	      Exception Table:
	        [pc: 9, pc: 23] -> 26 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 2
	        [pc: 26, full, stack: {javax.swing.text.BadLocationException}, locals: {javax.swing.JTextArea, java.lang.String, javax.swing.text.Document}]
	        [pc: 27, same]
	  
	  // Method descriptor #202 (Ljava/lang/String;II)V
	  // Stack: 5, Locals: 6
	  public void replaceRange(java.lang.String arg0, int arg1, int arg2);
	     0  iload_3 [arg2]
	     1  iload_2 [arg1]
	     2  if_icmpge 15
	     5  new java.lang.IllegalArgumentException [177]
	     8  dup
	     9  ldc <String "end before start"> [14]
	    11  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    14  athrow
	    15  aload_0 [this]
	    16  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    19  astore 4
	    21  aload 4
	    23  ifnull 90
	    26  aload 4
	    28  instanceof javax.swing.text.AbstractDocument [187]
	    31  ifeq 51
	    34  aload 4
	    36  checkcast javax.swing.text.AbstractDocument [187]
	    39  iload_2 [arg1]
	    40  iload_3 [arg2]
	    41  iload_2 [arg1]
	    42  isub
	    43  aload_1 [arg0]
	    44  aconst_null
	    45  invokevirtual javax.swing.text.AbstractDocument.replace(int, int, java.lang.String, javax.swing.text.AttributeSet) : void [342]
	    48  goto 72
	    51  aload 4
	    53  iload_2 [arg1]
	    54  iload_3 [arg2]
	    55  iload_2 [arg1]
	    56  isub
	    57  invokeinterface javax.swing.text.Document.remove(int, int) : void [353] [nargs: 3]
	    62  aload 4
	    64  iload_2 [arg1]
	    65  aload_1 [arg0]
	    66  aconst_null
	    67  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    72  goto 90
	    75  astore 5
	    77  new java.lang.IllegalArgumentException [177]
	    80  dup
	    81  aload 5
	    83  invokevirtual javax.swing.text.BadLocationException.getMessage() : java.lang.String [343]
	    86  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    89  athrow
	    90  return
	      Exception Table:
	        [pc: 26, pc: 72] -> 75 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 5
	        [pc: 15, same]
	        [pc: 51, append: {javax.swing.text.Document}]
	        [pc: 72, same]
	        [pc: 75, same_locals_1_stack_item, stack: {javax.swing.text.BadLocationException}]
	        [pc: 90, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 1
	  public int getRows();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.rows : int [300]
	    4  ireturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 3, Locals: 3
	  public void setRows(int arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.rows : int [300]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 19
	     9  new java.lang.IllegalArgumentException [177]
	    12  dup
	    13  ldc <String "rows less than zero."> [19]
	    15  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    18  athrow
	    19  iload_1 [arg0]
	    20  iload_2
	    21  if_icmpeq 33
	    24  aload_0 [this]
	    25  iload_1 [arg0]
	    26  putfield javax.swing.JTextArea.rows : int [300]
	    29  aload_0 [this]
	    30  invokevirtual javax.swing.JTextArea.invalidate() : void [326]
	    33  return
	    Stack map table: number of frames 2
	        [pc: 19, append: {int}]
	        [pc: 33, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 2, Locals: 2
	  protected int getRowHeight();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.rowHeight : int [299]
	     4  ifne 24
	     7  aload_0 [this]
	     8  aload_0 [this]
	     9  invokevirtual javax.swing.JTextArea.getFont() : java.awt.Font [328]
	    12  invokevirtual javax.swing.JTextArea.getFontMetrics(java.awt.Font) : java.awt.FontMetrics [337]
	    15  astore_1
	    16  aload_0 [this]
	    17  aload_1
	    18  invokevirtual java.awt.FontMetrics.getHeight() : int [306]
	    21  putfield javax.swing.JTextArea.rowHeight : int [299]
	    24  aload_0 [this]
	    25  getfield javax.swing.JTextArea.rowHeight : int [299]
	    28  ireturn
	    Stack map table: number of frames 1
	        [pc: 24, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 1
	  public int getColumns();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.columns : int [298]
	    4  ireturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 3, Locals: 3
	  public void setColumns(int arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.columns : int [298]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 19
	     9  new java.lang.IllegalArgumentException [177]
	    12  dup
	    13  ldc <String "columns less than zero."> [12]
	    15  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    18  athrow
	    19  iload_1 [arg0]
	    20  iload_2
	    21  if_icmpeq 33
	    24  aload_0 [this]
	    25  iload_1 [arg0]
	    26  putfield javax.swing.JTextArea.columns : int [298]
	    29  aload_0 [this]
	    30  invokevirtual javax.swing.JTextArea.invalidate() : void [326]
	    33  return
	    Stack map table: number of frames 2
	        [pc: 19, append: {int}]
	        [pc: 33, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 3, Locals: 2
	  protected int getColumnWidth();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.columnWidth : int [297]
	     4  ifne 26
	     7  aload_0 [this]
	     8  aload_0 [this]
	     9  invokevirtual javax.swing.JTextArea.getFont() : java.awt.Font [328]
	    12  invokevirtual javax.swing.JTextArea.getFontMetrics(java.awt.Font) : java.awt.FontMetrics [337]
	    15  astore_1
	    16  aload_0 [this]
	    17  aload_1
	    18  bipush 109
	    20  invokevirtual java.awt.FontMetrics.charWidth(char) : int [307]
	    23  putfield javax.swing.JTextArea.columnWidth : int [297]
	    26  aload_0 [this]
	    27  getfield javax.swing.JTextArea.columnWidth : int [297]
	    30  ireturn
	    Stack map table: number of frames 1
	        [pc: 26, same]
	  
	  // Method descriptor #195 ()Ljava/awt/Dimension;
	  // Stack: 4, Locals: 3
	  public java.awt.Dimension getPreferredSize();
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent.getPreferredSize() : java.awt.Dimension [348]
	      4  astore_1
	      5  aload_1
	      6  ifnonnull 25
	      9  new java.awt.Dimension [172]
	     12  dup
	     13  sipush 400
	     16  sipush 400
	     19  invokespecial java.awt.Dimension(int, int) [305]
	     22  goto 26
	     25  aload_1
	     26  astore_1
	     27  aload_0 [this]
	     28  invokevirtual javax.swing.JTextArea.getInsets() : java.awt.Insets [329]
	     31  astore_2
	     32  aload_0 [this]
	     33  getfield javax.swing.JTextArea.columns : int [298]
	     36  ifeq 69
	     39  aload_1
	     40  aload_1
	     41  getfield java.awt.Dimension.width : int [292]
	     44  aload_0 [this]
	     45  getfield javax.swing.JTextArea.columns : int [298]
	     48  aload_0 [this]
	     49  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	     52  imul
	     53  aload_2
	     54  getfield java.awt.Insets.left : int [294]
	     57  iadd
	     58  aload_2
	     59  getfield java.awt.Insets.right : int [295]
	     62  iadd
	     63  invokestatic java.lang.Math.max(int, int) : int [312]
	     66  putfield java.awt.Dimension.width : int [292]
	     69  aload_0 [this]
	     70  getfield javax.swing.JTextArea.rows : int [300]
	     73  ifeq 106
	     76  aload_1
	     77  aload_1
	     78  getfield java.awt.Dimension.height : int [291]
	     81  aload_0 [this]
	     82  getfield javax.swing.JTextArea.rows : int [300]
	     85  aload_0 [this]
	     86  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	     89  imul
	     90  aload_2
	     91  getfield java.awt.Insets.top : int [296]
	     94  iadd
	     95  aload_2
	     96  getfield java.awt.Insets.bottom : int [293]
	     99  iadd
	    100  invokestatic java.lang.Math.max(int, int) : int [312]
	    103  putfield java.awt.Dimension.height : int [291]
	    106  aload_1
	    107  areturn
	    Stack map table: number of frames 4
	        [pc: 25, append: {java.awt.Dimension}]
	        [pc: 26, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 69, append: {java.awt.Insets}]
	        [pc: 106, same]
	  
	  // Method descriptor #197 (Ljava/awt/Font;)V
	  // Stack: 2, Locals: 2
	  public void setFont(java.awt.Font arg0);
	     0  aload_0 [this]
	     1  aload_1 [arg0]
	     2  invokespecial javax.swing.text.JTextComponent.setFont(java.awt.Font) : void [349]
	     5  aload_0 [this]
	     6  iconst_0
	     7  putfield javax.swing.JTextArea.rowHeight : int [299]
	    10  aload_0 [this]
	    11  iconst_0
	    12  putfield javax.swing.JTextArea.columnWidth : int [297]
	    15  return

	  
	  // Method descriptor #25 ()Ljava/lang/String;
	  // Stack: 2, Locals: 3
	  protected java.lang.String paramString();
	      0  aload_0 [this]
	      1  getfield javax.swing.JTextArea.wrap : boolean [302]
	      4  ifeq 12
	      7  ldc <String "true"> [22]
	      9  goto 14
	     12  ldc <String "false"> [15]
	     14  astore_1
	     15  aload_0 [this]
	     16  getfield javax.swing.JTextArea.word : boolean [301]
	     19  ifeq 27
	     22  ldc <String "true"> [22]
	     24  goto 29
	     27  ldc <String "false"> [15]
	     29  astore_2
	     30  new java.lang.StringBuilder [181]
	     33  dup
	     34  invokespecial java.lang.StringBuilder() [314]
	     37  aload_0 [this]
	     38  invokespecial javax.swing.text.JTextComponent.paramString() : java.lang.String [350]
	     41  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     44  ldc <String ",colums="> [2]
	     46  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     49  aload_0 [this]
	     50  getfield javax.swing.JTextArea.columns : int [298]
	     53  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     56  ldc <String ",columWidth="> [1]
	     58  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     61  aload_0 [this]
	     62  getfield javax.swing.JTextArea.columnWidth : int [297]
	     65  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     68  ldc <String ",rows="> [4]
	     70  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     73  aload_0 [this]
	     74  getfield javax.swing.JTextArea.rows : int [300]
	     77  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     80  ldc <String ",rowHeight="> [3]
	     82  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     85  aload_0 [this]
	     86  getfield javax.swing.JTextArea.rowHeight : int [299]
	     89  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     92  ldc <String ",word="> [5]
	     94  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     97  aload_2
	     98  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    101  ldc <String ",wrap="> [6]
	    103  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    106  aload_1
	    107  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    110  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    113  areturn
	    Stack map table: number of frames 4
	        [pc: 12, same]
	        [pc: 14, same_locals_1_stack_item, stack: {java.lang.String}]
	        [pc: 27, append: {java.lang.String}]
	        [pc: 29, same_locals_1_stack_item, stack: {java.lang.String}]
	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getScrollableTracksViewportWidth();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.wrap : boolean [302]
	     4  ifeq 11
	     7  iconst_1
	     8  goto 15
	    11  aload_0 [this]
	    12  invokespecial javax.swing.text.JTextComponent.getScrollableTracksViewportWidth() : boolean [346]
	    15  ireturn
	    Stack map table: number of frames 2
	        [pc: 11, same]
	        [pc: 15, same_locals_1_stack_item, stack: {int}]
	  
	  // Method descriptor #195 ()Ljava/awt/Dimension;
	  // Stack: 4, Locals: 3
	  public java.awt.Dimension getPreferredScrollableViewportSize();
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent.getPreferredScrollableViewportSize() : java.awt.Dimension [347]
	      4  astore_1
	      5  aload_1
	      6  ifnonnull 25
	      9  new java.awt.Dimension [172]
	     12  dup
	     13  sipush 400
	     16  sipush 400
	     19  invokespecial java.awt.Dimension(int, int) [305]
	     22  goto 26
	     25  aload_1
	     26  astore_1
	     27  aload_0 [this]
	     28  invokevirtual javax.swing.JTextArea.getInsets() : java.awt.Insets [329]
	     31  astore_2
	     32  aload_1
	     33  aload_0 [this]
	     34  getfield javax.swing.JTextArea.columns : int [298]
	     37  ifne 47
	     40  aload_1
	     41  getfield java.awt.Dimension.width : int [292]
	     44  goto 66
	     47  aload_0 [this]
	     48  getfield javax.swing.JTextArea.columns : int [298]
	     51  aload_0 [this]
	     52  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	     55  imul
	     56  aload_2
	     57  getfield java.awt.Insets.left : int [294]
	     60  iadd
	     61  aload_2
	     62  getfield java.awt.Insets.right : int [295]
	     65  iadd
	     66  putfield java.awt.Dimension.width : int [292]
	     69  aload_1
	     70  aload_0 [this]
	     71  getfield javax.swing.JTextArea.rows : int [300]
	     74  ifne 84
	     77  aload_1
	     78  getfield java.awt.Dimension.height : int [291]
	     81  goto 103
	     84  aload_0 [this]
	     85  getfield javax.swing.JTextArea.rows : int [300]
	     88  aload_0 [this]
	     89  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	     92  imul
	     93  aload_2
	     94  getfield java.awt.Insets.top : int [296]
	     97  iadd
	     98  aload_2
	     99  getfield java.awt.Insets.bottom : int [293]
	    102  iadd
	    103  putfield java.awt.Dimension.height : int [291]
	    106  aload_1
	    107  areturn
	    Stack map table: number of frames 6
	        [pc: 25, append: {java.awt.Dimension}]
	        [pc: 26, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 47, full, stack: {java.awt.Dimension}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	        [pc: 66, full, stack: {java.awt.Dimension, int}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	        [pc: 84, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 103, full, stack: {java.awt.Dimension, int}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	  
	  // Method descriptor #199 (Ljava/awt/Rectangle;II)I
	  // Stack: 4, Locals: 4
	  public int getScrollableUnitIncrement(java.awt.Rectangle arg0, int arg1, int arg2);
	     0  iload_2 [arg1]
	     1  lookupswitch default: 38
	          case 0: 33
	          case 1: 28
	    28  aload_0 [this]
	    29  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	    32  ireturn
	    33  aload_0 [this]
	    34  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	    37  ireturn
	    38  new java.lang.IllegalArgumentException [177]
	    41  dup
	    42  new java.lang.StringBuilder [181]
	    45  dup
	    46  invokespecial java.lang.StringBuilder() [314]
	    49  ldc <String "Invalid orientation: "> [8]
	    51  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    54  iload_2 [arg1]
	    55  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	    58  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    61  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    64  athrow
	    Stack map table: number of frames 3
	        [pc: 28, same]
	        [pc: 33, same]
	        [pc: 38, same]
	  
	  // Method descriptor #33 (Ljava/io/ObjectOutputStream;)V
	  // Stack: 3, Locals: 3
	  private void writeObject(java.io.ObjectOutputStream arg0) throws java.io.IOException;
	     0  aload_1 [arg0]
	     1  invokevirtual java.io.ObjectOutputStream.defaultWriteObject() : void [308]
	     4  aload_0 [this]
	     5  invokevirtual javax.swing.JTextArea.getUIClassID() : java.lang.String [330]
	     8  ldc <String "TextAreaUI"> [11]
	    10  invokevirtual java.lang.String.equals(java.lang.Object) : boolean [313]
	    13  ifeq 50
	    16  aload_0 [this]
	    17  invokestatic javax.swing.JComponent.getWriteObjCounter(javax.swing.JComponent) : byte [320]
	    20  istore_2
	    21  aload_0 [this]
	    22  iload_2
	    23  iconst_1
	    24  isub
	    25  i2b
	    26  istore_2
	    27  iload_2
	    28  invokestatic javax.swing.JComponent.setWriteObjCounter(javax.swing.JComponent, byte) : void [321]
	    31  iload_2
	    32  ifne 50
	    35  aload_0 [this]
	    36  getfield javax.swing.JTextArea.ui : javax.swing.plaf.ComponentUI [304]
	    39  ifnull 50
	    42  aload_0 [this]
	    43  getfield javax.swing.JTextArea.ui : javax.swing.plaf.ComponentUI [304]
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.plaf.ComponentUI.installUI(javax.swing.JComponent) : void [341]
	    50  return
	    Stack map table: number of frames 1
	        [pc: 50, same]
	  
	  // Method descriptor #206 ()Ljavax/accessibility/AccessibleContext;
	  // Stack: 4, Locals: 1
	  public javax.accessibility.AccessibleContext getAccessibleContext();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	     4  ifnonnull 19
	     7  aload_0 [this]
	     8  new javax.swing.JTextArea$AccessibleJTextArea [184]
	    11  dup
	    12  aload_0 [this]
	    13  invokespecial javax.swing.JTextArea$AccessibleJTextArea(javax.swing.JTextArea) [339]
	    16  putfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	    19  aload_0 [this]
	    20  getfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	    23  areturn
	    Stack map table: number of frames 1
	        [pc: 19, same]

	  Inner classes:
	    [inner class info: #184 javax/swing/JTextArea$AccessibleJTextArea, outer class info: #183 javax/swing/JTextArea
	     inner name: #363 AccessibleJTextArea, accessflags: 4 protected]
	}//  (version 1.8 : 52.0, super bit)
public class javax.swing.JTextArea extends javax.swing.text.JTextComponent {
	  
	  // Field descriptor #53 Ljava/lang/String;
	  private static final java.lang.String uiClassID = "TextAreaUI";
	  
	  // Field descriptor #50 I
	  private int rows;
	  
	  // Field descriptor #50 I
	  private int columns;
	  
	  // Field descriptor #50 I
	  private int columnWidth;
	  
	  // Field descriptor #50 I
	  private int rowHeight;
	  
	  // Field descriptor #58 Z
	  private boolean wrap;
	  
	  // Field descriptor #58 Z
	  private boolean word;
	  
	  // Method descriptor #26 ()V
	  // Stack: 5, Locals: 1
	  public JTextArea();
	    0  aload_0 [this]
	    1  aconst_null
	    2  aconst_null
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #37 (Ljava/lang/String;)V
	  // Stack: 5, Locals: 2
	  public JTextArea(java.lang.String arg0);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aload_1 [arg0]
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #32 (II)V
	  // Stack: 5, Locals: 3
	  public JTextArea(int arg0, int arg1);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aconst_null
	    3  iload_1 [arg0]
	    4  iload_2 [arg1]
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #202 (Ljava/lang/String;II)V
	  // Stack: 5, Locals: 4
	  public JTextArea(java.lang.String arg0, int arg1, int arg2);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aload_1 [arg0]
	    3  iload_2 [arg1]
	    4  iload_3 [arg2]
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #212 (Ljavax/swing/text/Document;)V
	  // Stack: 5, Locals: 2
	  public JTextArea(javax.swing.text.Document arg0);
	    0  aload_0 [this]
	    1  aload_1 [arg0]
	    2  aconst_null
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #216 (Ljavax/swing/text/Document;Ljava/lang/String;II)V
	  // Stack: 4, Locals: 5
	  public JTextArea(javax.swing.text.Document arg0, java.lang.String arg1, int arg2, int arg3);
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent() [345]
	      4  aload_0 [this]
	      5  iload_3 [arg2]
	      6  putfield javax.swing.JTextArea.rows : int [300]
	      9  aload_0 [this]
	     10  iload 4 [arg3]
	     12  putfield javax.swing.JTextArea.columns : int [298]
	     15  aload_1 [arg0]
	     16  ifnonnull 24
	     19  aload_0 [this]
	     20  invokevirtual javax.swing.JTextArea.createDefaultModel() : javax.swing.text.Document [334]
	     23  astore_1 [arg0]
	     24  aload_0 [this]
	     25  aload_1 [arg0]
	     26  invokevirtual javax.swing.JTextArea.setDocument(javax.swing.text.Document) : void [336]
	     29  aload_2 [arg1]
	     30  ifnull 44
	     33  aload_0 [this]
	     34  aload_2 [arg1]
	     35  invokevirtual javax.swing.JTextArea.setText(java.lang.String) : void [331]
	     38  aload_0 [this]
	     39  iconst_0
	     40  iconst_0
	     41  invokevirtual javax.swing.JTextArea.select(int, int) : void [327]
	     44  iload_3 [arg2]
	     45  ifge 75
	     48  new java.lang.IllegalArgumentException [177]
	     51  dup
	     52  new java.lang.StringBuilder [181]
	     55  dup
	     56  invokespecial java.lang.StringBuilder() [314]
	     59  ldc <String "rows: "> [20]
	     61  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     64  iload_3 [arg2]
	     65  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     68  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	     71  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	     74  athrow
	     75  iload 4 [arg3]
	     77  ifge 108
	     80  new java.lang.IllegalArgumentException [177]
	     83  dup
	     84  new java.lang.StringBuilder [181]
	     87  dup
	     88  invokespecial java.lang.StringBuilder() [314]
	     91  ldc <String "columns: "> [13]
	     93  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     96  iload 4 [arg3]
	     98  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	    101  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    104  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    107  athrow
	    108  aload_0 [this]
	    109  ldc <String "focusTraversalKeysForward"> [17]
	    111  invokestatic javax.swing.JComponent.getManagingFocusForwardTraversalKeys() : java.util.Set [319]
	    114  invokestatic javax.swing.LookAndFeel.installProperty(javax.swing.JComponent, java.lang.String, java.lang.Object) : void [340]
	    117  aload_0 [this]
	    118  ldc <String "focusTraversalKeysBackward"> [16]
	    120  invokestatic javax.swing.JComponent.getManagingFocusBackwardTraversalKeys() : java.util.Set [318]
	    123  invokestatic javax.swing.LookAndFeel.installProperty(javax.swing.JComponent, java.lang.String, java.lang.Object) : void [340]
	    126  return
	    Stack map table: number of frames 4
	        [pc: 24, full, stack: {}, locals: {javax.swing.JTextArea, javax.swing.text.Document, java.lang.String, int, int}]
	        [pc: 44, same]
	        [pc: 75, same]
	        [pc: 108, same]
	  
	  // Method descriptor #25 ()Ljava/lang/String;
	  // Stack: 1, Locals: 1
	  public java.lang.String getUIClassID();
	    0  ldc <String "TextAreaUI"> [11]
	    2  areturn

	  
	  // Method descriptor #211 ()Ljavax/swing/text/Document;
	  // Stack: 2, Locals: 1
	  protected javax.swing.text.Document createDefaultModel();
	    0  new javax.swing.text.PlainDocument [192]
	    3  dup
	    4  invokespecial javax.swing.text.PlainDocument() [351]
	    7  areturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 4, Locals: 4
	  public void setTabSize(int arg0);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  aload_2
	     6  ifnull 34
	     9  aload_0 [this]
	    10  invokevirtual javax.swing.JTextArea.getTabSize() : int [325]
	    13  istore_3
	    14  aload_2
	    15  ldc <String "tabSize"> [21]
	    17  iload_1 [arg0]
	    18  invokestatic java.lang.Integer.valueOf(int) : java.lang.Integer [311]
	    21  invokeinterface javax.swing.text.Document.putProperty(java.lang.Object, java.lang.Object) : void [356] [nargs: 3]
	    26  aload_0 [this]
	    27  ldc <String "tabSize"> [21]
	    29  iload_3
	    30  iload_1 [arg0]
	    31  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, int, int) : void [332]
	    34  return
	    Stack map table: number of frames 1
	        [pc: 34, append: {javax.swing.text.Document}]
	  
	  // Method descriptor #24 ()I
	  // Stack: 2, Locals: 4
	  public int getTabSize();
	     0  bipush 8
	     2  istore_1
	     3  aload_0 [this]
	     4  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     7  astore_2
	     8  aload_2
	     9  ifnull 33
	    12  aload_2
	    13  ldc <String "tabSize"> [21]
	    15  invokeinterface javax.swing.text.Document.getProperty(java.lang.Object) : java.lang.Object [355] [nargs: 2]
	    20  checkcast java.lang.Integer [178]
	    23  astore_3
	    24  aload_3
	    25  ifnull 33
	    28  aload_3
	    29  invokevirtual java.lang.Integer.intValue() : int [310]
	    32  istore_1
	    33  iload_1
	    34  ireturn
	    Stack map table: number of frames 1
	        [pc: 33, append: {int, javax.swing.text.Document}]
	  
	  // Method descriptor #38 (Z)V
	  // Stack: 4, Locals: 3
	  public void setLineWrap(boolean arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.wrap : boolean [302]
	     4  istore_2
	     5  aload_0 [this]
	     6  iload_1 [arg0]
	     7  putfield javax.swing.JTextArea.wrap : boolean [302]
	    10  aload_0 [this]
	    11  ldc <String "lineWrap"> [18]
	    13  iload_2
	    14  iload_1 [arg0]
	    15  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, boolean, boolean) : void [333]
	    18  return

	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getLineWrap();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.wrap : boolean [302]
	    4  ireturn

	  
	  // Method descriptor #38 (Z)V
	  // Stack: 4, Locals: 3
	  public void setWrapStyleWord(boolean arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.word : boolean [301]
	     4  istore_2
	     5  aload_0 [this]
	     6  iload_1 [arg0]
	     7  putfield javax.swing.JTextArea.word : boolean [301]
	    10  aload_0 [this]
	    11  ldc <String "wrapStyleWord"> [23]
	    13  iload_2
	    14  iload_1 [arg0]
	    15  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, boolean, boolean) : void [333]
	    18  return

	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getWrapStyleWord();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.word : boolean [301]
	    4  ireturn

	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 4
	  public int getLineOfOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Can't translate offset to line"> [7]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  aload_2
	    22  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    27  if_icmple 48
	    30  new javax.swing.text.BadLocationException [188]
	    33  dup
	    34  ldc <String "Can't translate offset to line"> [7]
	    36  aload_2
	    37  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    42  iconst_1
	    43  iadd
	    44  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    47  athrow
	    48  aload_0 [this]
	    49  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    52  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    57  astore_3
	    58  aload_3
	    59  iload_1 [arg0]
	    60  invokeinterface javax.swing.text.Element.getElementIndex(int) : int [361] [nargs: 2]
	    65  ireturn
	    Stack map table: number of frames 2
	        [pc: 20, append: {javax.swing.text.Document}]
	        [pc: 48, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 2
	  public int getLineCount();
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	     9  astore_1
	    10  aload_1
	    11  invokeinterface javax.swing.text.Element.getElementCount() : int [358] [nargs: 1]
	    16  ireturn

	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 5
	  public int getLineStartOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getLineCount() : int [323]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Negative line"> [9]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  iload_2
	    22  if_icmplt 46
	    25  new javax.swing.text.BadLocationException [188]
	    28  dup
	    29  ldc <String "No such line"> [10]
	    31  aload_0 [this]
	    32  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    35  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    40  iconst_1
	    41  iadd
	    42  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    45  athrow
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    50  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    55  astore_3
	    56  aload_3
	    57  iload_1 [arg0]
	    58  invokeinterface javax.swing.text.Element.getElement(int) : javax.swing.text.Element [362] [nargs: 2]
	    63  astore 4
	    65  aload 4
	    67  invokeinterface javax.swing.text.Element.getStartOffset() : int [360] [nargs: 1]
	    72  ireturn
	    Stack map table: number of frames 2
	        [pc: 20, append: {int}]
	        [pc: 46, same]
	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 6
	  public int getLineEndOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getLineCount() : int [323]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Negative line"> [9]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  iload_2
	    22  if_icmplt 46
	    25  new javax.swing.text.BadLocationException [188]
	    28  dup
	    29  ldc <String "No such line"> [10]
	    31  aload_0 [this]
	    32  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    35  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    40  iconst_1
	    41  iadd
	    42  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    45  athrow
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    50  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    55  astore_3
	    56  aload_3
	    57  iload_1 [arg0]
	    58  invokeinterface javax.swing.text.Element.getElement(int) : javax.swing.text.Element [362] [nargs: 2]
	    63  astore 4
	    65  aload 4
	    67  invokeinterface javax.swing.text.Element.getEndOffset() : int [359] [nargs: 1]
	    72  istore 5
	    74  iload_1 [arg0]
	    75  iload_2
	    76  iconst_1
	    77  isub
	    78  if_icmpne 88
	    81  iload 5
	    83  iconst_1
	    84  isub
	    85  goto 90
	    88  iload 5
	    90  ireturn
	    Stack map table: number of frames 4
	        [pc: 20, append: {int}]
	        [pc: 46, same]
	        [pc: 88, append: {javax.swing.text.Element, javax.swing.text.Element, int}]
	        [pc: 90, same_locals_1_stack_item, stack: {int}]
	  
	  // Method descriptor #201 (Ljava/lang/String;I)V
	  // Stack: 4, Locals: 5
	  public void insert(java.lang.String arg0, int arg1);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_3
	     5  aload_3
	     6  ifnull 36
	     9  aload_3
	    10  iload_2 [arg1]
	    11  aload_1 [arg0]
	    12  aconst_null
	    13  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    18  goto 36
	    21  astore 4
	    23  new java.lang.IllegalArgumentException [177]
	    26  dup
	    27  aload 4
	    29  invokevirtual javax.swing.text.BadLocationException.getMessage() : java.lang.String [343]
	    32  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    35  athrow
	    36  return
	      Exception Table:
	        [pc: 9, pc: 18] -> 21 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 2
	        [pc: 21, full, stack: {javax.swing.text.BadLocationException}, locals: {javax.swing.JTextArea, java.lang.String, int, javax.swing.text.Document}]
	        [pc: 36, same]
	  
	  // Method descriptor #37 (Ljava/lang/String;)V
	  // Stack: 4, Locals: 4
	  public void append(java.lang.String arg0);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  aload_2
	     6  ifnull 27
	     9  aload_2
	    10  aload_2
	    11  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    16  aload_1 [arg0]
	    17  aconst_null
	    18  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    23  goto 27
	    26  astore_3
	    27  return
	      Exception Table:
	        [pc: 9, pc: 23] -> 26 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 2
	        [pc: 26, full, stack: {javax.swing.text.BadLocationException}, locals: {javax.swing.JTextArea, java.lang.String, javax.swing.text.Document}]
	        [pc: 27, same]
	  
	  // Method descriptor #202 (Ljava/lang/String;II)V
	  // Stack: 5, Locals: 6
	  public void replaceRange(java.lang.String arg0, int arg1, int arg2);
	     0  iload_3 [arg2]
	     1  iload_2 [arg1]
	     2  if_icmpge 15
	     5  new java.lang.IllegalArgumentException [177]
	     8  dup
	     9  ldc <String "end before start"> [14]
	    11  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    14  athrow
	    15  aload_0 [this]
	    16  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    19  astore 4
	    21  aload 4
	    23  ifnull 90
	    26  aload 4
	    28  instanceof javax.swing.text.AbstractDocument [187]
	    31  ifeq 51
	    34  aload 4
	    36  checkcast javax.swing.text.AbstractDocument [187]
	    39  iload_2 [arg1]
	    40  iload_3 [arg2]
	    41  iload_2 [arg1]
	    42  isub
	    43  aload_1 [arg0]
	    44  aconst_null
	    45  invokevirtual javax.swing.text.AbstractDocument.replace(int, int, java.lang.String, javax.swing.text.AttributeSet) : void [342]
	    48  goto 72
	    51  aload 4
	    53  iload_2 [arg1]
	    54  iload_3 [arg2]
	    55  iload_2 [arg1]
	    56  isub
	    57  invokeinterface javax.swing.text.Document.remove(int, int) : void [353] [nargs: 3]
	    62  aload 4
	    64  iload_2 [arg1]
	    65  aload_1 [arg0]
	    66  aconst_null
	    67  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    72  goto 90
	    75  astore 5
	    77  new java.lang.IllegalArgumentException [177]
	    80  dup
	    81  aload 5
	    83  invokevirtual javax.swing.text.BadLocationException.getMessage() : java.lang.String [343]
	    86  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    89  athrow
	    90  return
	      Exception Table:
	        [pc: 26, pc: 72] -> 75 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 5
	        [pc: 15, same]
	        [pc: 51, append: {javax.swing.text.Document}]
	        [pc: 72, same]
	        [pc: 75, same_locals_1_stack_item, stack: {javax.swing.text.BadLocationException}]
	        [pc: 90, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 1
	  public int getRows();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.rows : int [300]
	    4  ireturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 3, Locals: 3
	  public void setRows(int arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.rows : int [300]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 19
	     9  new java.lang.IllegalArgumentException [177]
	    12  dup
	    13  ldc <String "rows less than zero."> [19]
	    15  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    18  athrow
	    19  iload_1 [arg0]
	    20  iload_2
	    21  if_icmpeq 33
	    24  aload_0 [this]
	    25  iload_1 [arg0]
	    26  putfield javax.swing.JTextArea.rows : int [300]
	    29  aload_0 [this]
	    30  invokevirtual javax.swing.JTextArea.invalidate() : void [326]
	    33  return
	    Stack map table: number of frames 2
	        [pc: 19, append: {int}]
	        [pc: 33, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 2, Locals: 2
	  protected int getRowHeight();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.rowHeight : int [299]
	     4  ifne 24
	     7  aload_0 [this]
	     8  aload_0 [this]
	     9  invokevirtual javax.swing.JTextArea.getFont() : java.awt.Font [328]
	    12  invokevirtual javax.swing.JTextArea.getFontMetrics(java.awt.Font) : java.awt.FontMetrics [337]
	    15  astore_1
	    16  aload_0 [this]
	    17  aload_1
	    18  invokevirtual java.awt.FontMetrics.getHeight() : int [306]
	    21  putfield javax.swing.JTextArea.rowHeight : int [299]
	    24  aload_0 [this]
	    25  getfield javax.swing.JTextArea.rowHeight : int [299]
	    28  ireturn
	    Stack map table: number of frames 1
	        [pc: 24, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 1
	  public int getColumns();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.columns : int [298]
	    4  ireturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 3, Locals: 3
	  public void setColumns(int arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.columns : int [298]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 19
	     9  new java.lang.IllegalArgumentException [177]
	    12  dup
	    13  ldc <String "columns less than zero."> [12]
	    15  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    18  athrow
	    19  iload_1 [arg0]
	    20  iload_2
	    21  if_icmpeq 33
	    24  aload_0 [this]
	    25  iload_1 [arg0]
	    26  putfield javax.swing.JTextArea.columns : int [298]
	    29  aload_0 [this]
	    30  invokevirtual javax.swing.JTextArea.invalidate() : void [326]
	    33  return
	    Stack map table: number of frames 2
	        [pc: 19, append: {int}]
	        [pc: 33, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 3, Locals: 2
	  protected int getColumnWidth();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.columnWidth : int [297]
	     4  ifne 26
	     7  aload_0 [this]
	     8  aload_0 [this]
	     9  invokevirtual javax.swing.JTextArea.getFont() : java.awt.Font [328]
	    12  invokevirtual javax.swing.JTextArea.getFontMetrics(java.awt.Font) : java.awt.FontMetrics [337]
	    15  astore_1
	    16  aload_0 [this]
	    17  aload_1
	    18  bipush 109
	    20  invokevirtual java.awt.FontMetrics.charWidth(char) : int [307]
	    23  putfield javax.swing.JTextArea.columnWidth : int [297]
	    26  aload_0 [this]
	    27  getfield javax.swing.JTextArea.columnWidth : int [297]
	    30  ireturn
	    Stack map table: number of frames 1
	        [pc: 26, same]
	  
	  // Method descriptor #195 ()Ljava/awt/Dimension;
	  // Stack: 4, Locals: 3
	  public java.awt.Dimension getPreferredSize();
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent.getPreferredSize() : java.awt.Dimension [348]
	      4  astore_1
	      5  aload_1
	      6  ifnonnull 25
	      9  new java.awt.Dimension [172]
	     12  dup
	     13  sipush 400
	     16  sipush 400
	     19  invokespecial java.awt.Dimension(int, int) [305]
	     22  goto 26
	     25  aload_1
	     26  astore_1
	     27  aload_0 [this]
	     28  invokevirtual javax.swing.JTextArea.getInsets() : java.awt.Insets [329]
	     31  astore_2
	     32  aload_0 [this]
	     33  getfield javax.swing.JTextArea.columns : int [298]
	     36  ifeq 69
	     39  aload_1
	     40  aload_1
	     41  getfield java.awt.Dimension.width : int [292]
	     44  aload_0 [this]
	     45  getfield javax.swing.JTextArea.columns : int [298]
	     48  aload_0 [this]
	     49  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	     52  imul
	     53  aload_2
	     54  getfield java.awt.Insets.left : int [294]
	     57  iadd
	     58  aload_2
	     59  getfield java.awt.Insets.right : int [295]
	     62  iadd
	     63  invokestatic java.lang.Math.max(int, int) : int [312]
	     66  putfield java.awt.Dimension.width : int [292]
	     69  aload_0 [this]
	     70  getfield javax.swing.JTextArea.rows : int [300]
	     73  ifeq 106
	     76  aload_1
	     77  aload_1
	     78  getfield java.awt.Dimension.height : int [291]
	     81  aload_0 [this]
	     82  getfield javax.swing.JTextArea.rows : int [300]
	     85  aload_0 [this]
	     86  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	     89  imul
	     90  aload_2
	     91  getfield java.awt.Insets.top : int [296]
	     94  iadd
	     95  aload_2
	     96  getfield java.awt.Insets.bottom : int [293]
	     99  iadd
	    100  invokestatic java.lang.Math.max(int, int) : int [312]
	    103  putfield java.awt.Dimension.height : int [291]
	    106  aload_1
	    107  areturn
	    Stack map table: number of frames 4
	        [pc: 25, append: {java.awt.Dimension}]
	        [pc: 26, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 69, append: {java.awt.Insets}]
	        [pc: 106, same]
	  
	  // Method descriptor #197 (Ljava/awt/Font;)V
	  // Stack: 2, Locals: 2
	  public void setFont(java.awt.Font arg0);
	     0  aload_0 [this]
	     1  aload_1 [arg0]
	     2  invokespecial javax.swing.text.JTextComponent.setFont(java.awt.Font) : void [349]
	     5  aload_0 [this]
	     6  iconst_0
	     7  putfield javax.swing.JTextArea.rowHeight : int [299]
	    10  aload_0 [this]
	    11  iconst_0
	    12  putfield javax.swing.JTextArea.columnWidth : int [297]
	    15  return

	  
	  // Method descriptor #25 ()Ljava/lang/String;
	  // Stack: 2, Locals: 3
	  protected java.lang.String paramString();
	      0  aload_0 [this]
	      1  getfield javax.swing.JTextArea.wrap : boolean [302]
	      4  ifeq 12
	      7  ldc <String "true"> [22]
	      9  goto 14
	     12  ldc <String "false"> [15]
	     14  astore_1
	     15  aload_0 [this]
	     16  getfield javax.swing.JTextArea.word : boolean [301]
	     19  ifeq 27
	     22  ldc <String "true"> [22]
	     24  goto 29
	     27  ldc <String "false"> [15]
	     29  astore_2
	     30  new java.lang.StringBuilder [181]
	     33  dup
	     34  invokespecial java.lang.StringBuilder() [314]
	     37  aload_0 [this]
	     38  invokespecial javax.swing.text.JTextComponent.paramString() : java.lang.String [350]
	     41  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     44  ldc <String ",colums="> [2]
	     46  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     49  aload_0 [this]
	     50  getfield javax.swing.JTextArea.columns : int [298]
	     53  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     56  ldc <String ",columWidth="> [1]
	     58  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     61  aload_0 [this]
	     62  getfield javax.swing.JTextArea.columnWidth : int [297]
	     65  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     68  ldc <String ",rows="> [4]
	     70  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     73  aload_0 [this]
	     74  getfield javax.swing.JTextArea.rows : int [300]
	     77  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     80  ldc <String ",rowHeight="> [3]
	     82  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     85  aload_0 [this]
	     86  getfield javax.swing.JTextArea.rowHeight : int [299]
	     89  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     92  ldc <String ",word="> [5]
	     94  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     97  aload_2
	     98  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    101  ldc <String ",wrap="> [6]
	    103  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    106  aload_1
	    107  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    110  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    113  areturn
	    Stack map table: number of frames 4
	        [pc: 12, same]
	        [pc: 14, same_locals_1_stack_item, stack: {java.lang.String}]
	        [pc: 27, append: {java.lang.String}]
	        [pc: 29, same_locals_1_stack_item, stack: {java.lang.String}]
	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getScrollableTracksViewportWidth();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.wrap : boolean [302]
	     4  ifeq 11
	     7  iconst_1
	     8  goto 15
	    11  aload_0 [this]
	    12  invokespecial javax.swing.text.JTextComponent.getScrollableTracksViewportWidth() : boolean [346]
	    15  ireturn
	    Stack map table: number of frames 2
	        [pc: 11, same]
	        [pc: 15, same_locals_1_stack_item, stack: {int}]
	  
	  // Method descriptor #195 ()Ljava/awt/Dimension;
	  // Stack: 4, Locals: 3
	  public java.awt.Dimension getPreferredScrollableViewportSize();
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent.getPreferredScrollableViewportSize() : java.awt.Dimension [347]
	      4  astore_1
	      5  aload_1
	      6  ifnonnull 25
	      9  new java.awt.Dimension [172]
	     12  dup
	     13  sipush 400
	     16  sipush 400
	     19  invokespecial java.awt.Dimension(int, int) [305]
	     22  goto 26
	     25  aload_1
	     26  astore_1
	     27  aload_0 [this]
	     28  invokevirtual javax.swing.JTextArea.getInsets() : java.awt.Insets [329]
	     31  astore_2
	     32  aload_1
	     33  aload_0 [this]
	     34  getfield javax.swing.JTextArea.columns : int [298]
	     37  ifne 47
	     40  aload_1
	     41  getfield java.awt.Dimension.width : int [292]
	     44  goto 66
	     47  aload_0 [this]
	     48  getfield javax.swing.JTextArea.columns : int [298]
	     51  aload_0 [this]
	     52  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	     55  imul
	     56  aload_2
	     57  getfield java.awt.Insets.left : int [294]
	     60  iadd
	     61  aload_2
	     62  getfield java.awt.Insets.right : int [295]
	     65  iadd
	     66  putfield java.awt.Dimension.width : int [292]
	     69  aload_1
	     70  aload_0 [this]
	     71  getfield javax.swing.JTextArea.rows : int [300]
	     74  ifne 84
	     77  aload_1
	     78  getfield java.awt.Dimension.height : int [291]
	     81  goto 103
	     84  aload_0 [this]
	     85  getfield javax.swing.JTextArea.rows : int [300]
	     88  aload_0 [this]
	     89  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	     92  imul
	     93  aload_2
	     94  getfield java.awt.Insets.top : int [296]
	     97  iadd
	     98  aload_2
	     99  getfield java.awt.Insets.bottom : int [293]
	    102  iadd
	    103  putfield java.awt.Dimension.height : int [291]
	    106  aload_1
	    107  areturn
	    Stack map table: number of frames 6
	        [pc: 25, append: {java.awt.Dimension}]
	        [pc: 26, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 47, full, stack: {java.awt.Dimension}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	        [pc: 66, full, stack: {java.awt.Dimension, int}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	        [pc: 84, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 103, full, stack: {java.awt.Dimension, int}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	  
	  // Method descriptor #199 (Ljava/awt/Rectangle;II)I
	  // Stack: 4, Locals: 4
	  public int getScrollableUnitIncrement(java.awt.Rectangle arg0, int arg1, int arg2);
	     0  iload_2 [arg1]
	     1  lookupswitch default: 38
	          case 0: 33
	          case 1: 28
	    28  aload_0 [this]
	    29  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	    32  ireturn
	    33  aload_0 [this]
	    34  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	    37  ireturn
	    38  new java.lang.IllegalArgumentException [177]
	    41  dup
	    42  new java.lang.StringBuilder [181]
	    45  dup
	    46  invokespecial java.lang.StringBuilder() [314]
	    49  ldc <String "Invalid orientation: "> [8]
	    51  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    54  iload_2 [arg1]
	    55  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	    58  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    61  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    64  athrow
	    Stack map table: number of frames 3
	        [pc: 28, same]
	        [pc: 33, same]
	        [pc: 38, same]
	  
	  // Method descriptor #33 (Ljava/io/ObjectOutputStream;)V
	  // Stack: 3, Locals: 3
	  private void writeObject(java.io.ObjectOutputStream arg0) throws java.io.IOException;
	     0  aload_1 [arg0]
	     1  invokevirtual java.io.ObjectOutputStream.defaultWriteObject() : void [308]
	     4  aload_0 [this]
	     5  invokevirtual javax.swing.JTextArea.getUIClassID() : java.lang.String [330]
	     8  ldc <String "TextAreaUI"> [11]
	    10  invokevirtual java.lang.String.equals(java.lang.Object) : boolean [313]
	    13  ifeq 50
	    16  aload_0 [this]
	    17  invokestatic javax.swing.JComponent.getWriteObjCounter(javax.swing.JComponent) : byte [320]
	    20  istore_2
	    21  aload_0 [this]
	    22  iload_2
	    23  iconst_1
	    24  isub
	    25  i2b
	    26  istore_2
	    27  iload_2
	    28  invokestatic javax.swing.JComponent.setWriteObjCounter(javax.swing.JComponent, byte) : void [321]
	    31  iload_2
	    32  ifne 50
	    35  aload_0 [this]
	    36  getfield javax.swing.JTextArea.ui : javax.swing.plaf.ComponentUI [304]
	    39  ifnull 50
	    42  aload_0 [this]
	    43  getfield javax.swing.JTextArea.ui : javax.swing.plaf.ComponentUI [304]
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.plaf.ComponentUI.installUI(javax.swing.JComponent) : void [341]
	    50  return
	    Stack map table: number of frames 1
	        [pc: 50, same]
	  
	  // Method descriptor #206 ()Ljavax/accessibility/AccessibleContext;
	  // Stack: 4, Locals: 1
	  public javax.accessibility.AccessibleContext getAccessibleContext();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	     4  ifnonnull 19
	     7  aload_0 [this]
	     8  new javax.swing.JTextArea$AccessibleJTextArea [184]
	    11  dup
	    12  aload_0 [this]
	    13  invokespecial javax.swing.JTextArea$AccessibleJTextArea(javax.swing.JTextArea) [339]
	    16  putfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	    19  aload_0 [this]
	    20  getfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	    23  areturn
	    Stack map table: number of frames 1
	        [pc: 19, same]

	  Inner classes:
	    [inner class info: #184 javax/swing/JTextArea$AccessibleJTextArea, outer class info: #183 javax/swing/JTextArea
	     inner name: #363 AccessibleJTextArea, accessflags: 4 protected]
	}//  (version 1.8 : 52.0, super bit)
public class javax.swing.JTextArea extends javax.swing.text.JTextComponent {
	  
	  // Field descriptor #53 Ljava/lang/String;
	  private static final java.lang.String uiClassID = "TextAreaUI";
	  
	  // Field descriptor #50 I
	  private int rows;
	  
	  // Field descriptor #50 I
	  private int columns;
	  
	  // Field descriptor #50 I
	  private int columnWidth;
	  
	  // Field descriptor #50 I
	  private int rowHeight;
	  
	  // Field descriptor #58 Z
	  private boolean wrap;
	  
	  // Field descriptor #58 Z
	  private boolean word;
	  
	  // Method descriptor #26 ()V
	  // Stack: 5, Locals: 1
	  public JTextArea();
	    0  aload_0 [this]
	    1  aconst_null
	    2  aconst_null
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #37 (Ljava/lang/String;)V
	  // Stack: 5, Locals: 2
	  public JTextArea(java.lang.String arg0);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aload_1 [arg0]
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #32 (II)V
	  // Stack: 5, Locals: 3
	  public JTextArea(int arg0, int arg1);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aconst_null
	    3  iload_1 [arg0]
	    4  iload_2 [arg1]
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #202 (Ljava/lang/String;II)V
	  // Stack: 5, Locals: 4
	  public JTextArea(java.lang.String arg0, int arg1, int arg2);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aload_1 [arg0]
	    3  iload_2 [arg1]
	    4  iload_3 [arg2]
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #212 (Ljavax/swing/text/Document;)V
	  // Stack: 5, Locals: 2
	  public JTextArea(javax.swing.text.Document arg0);
	    0  aload_0 [this]
	    1  aload_1 [arg0]
	    2  aconst_null
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #216 (Ljavax/swing/text/Document;Ljava/lang/String;II)V
	  // Stack: 4, Locals: 5
	  public JTextArea(javax.swing.text.Document arg0, java.lang.String arg1, int arg2, int arg3);
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent() [345]
	      4  aload_0 [this]
	      5  iload_3 [arg2]
	      6  putfield javax.swing.JTextArea.rows : int [300]
	      9  aload_0 [this]
	     10  iload 4 [arg3]
	     12  putfield javax.swing.JTextArea.columns : int [298]
	     15  aload_1 [arg0]
	     16  ifnonnull 24
	     19  aload_0 [this]
	     20  invokevirtual javax.swing.JTextArea.createDefaultModel() : javax.swing.text.Document [334]
	     23  astore_1 [arg0]
	     24  aload_0 [this]
	     25  aload_1 [arg0]
	     26  invokevirtual javax.swing.JTextArea.setDocument(javax.swing.text.Document) : void [336]
	     29  aload_2 [arg1]
	     30  ifnull 44
	     33  aload_0 [this]
	     34  aload_2 [arg1]
	     35  invokevirtual javax.swing.JTextArea.setText(java.lang.String) : void [331]
	     38  aload_0 [this]
	     39  iconst_0
	     40  iconst_0
	     41  invokevirtual javax.swing.JTextArea.select(int, int) : void [327]
	     44  iload_3 [arg2]
	     45  ifge 75
	     48  new java.lang.IllegalArgumentException [177]
	     51  dup
	     52  new java.lang.StringBuilder [181]
	     55  dup
	     56  invokespecial java.lang.StringBuilder() [314]
	     59  ldc <String "rows: "> [20]
	     61  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     64  iload_3 [arg2]
	     65  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     68  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	     71  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	     74  athrow
	     75  iload 4 [arg3]
	     77  ifge 108
	     80  new java.lang.IllegalArgumentException [177]
	     83  dup
	     84  new java.lang.StringBuilder [181]
	     87  dup
	     88  invokespecial java.lang.StringBuilder() [314]
	     91  ldc <String "columns: "> [13]
	     93  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     96  iload 4 [arg3]
	     98  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	    101  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    104  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    107  athrow
	    108  aload_0 [this]
	    109  ldc <String "focusTraversalKeysForward"> [17]
	    111  invokestatic javax.swing.JComponent.getManagingFocusForwardTraversalKeys() : java.util.Set [319]
	    114  invokestatic javax.swing.LookAndFeel.installProperty(javax.swing.JComponent, java.lang.String, java.lang.Object) : void [340]
	    117  aload_0 [this]
	    118  ldc <String "focusTraversalKeysBackward"> [16]
	    120  invokestatic javax.swing.JComponent.getManagingFocusBackwardTraversalKeys() : java.util.Set [318]
	    123  invokestatic javax.swing.LookAndFeel.installProperty(javax.swing.JComponent, java.lang.String, java.lang.Object) : void [340]
	    126  return
	    Stack map table: number of frames 4
	        [pc: 24, full, stack: {}, locals: {javax.swing.JTextArea, javax.swing.text.Document, java.lang.String, int, int}]
	        [pc: 44, same]
	        [pc: 75, same]
	        [pc: 108, same]
	  
	  // Method descriptor #25 ()Ljava/lang/String;
	  // Stack: 1, Locals: 1
	  public java.lang.String getUIClassID();
	    0  ldc <String "TextAreaUI"> [11]
	    2  areturn

	  
	  // Method descriptor #211 ()Ljavax/swing/text/Document;
	  // Stack: 2, Locals: 1
	  protected javax.swing.text.Document createDefaultModel();
	    0  new javax.swing.text.PlainDocument [192]
	    3  dup
	    4  invokespecial javax.swing.text.PlainDocument() [351]
	    7  areturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 4, Locals: 4
	  public void setTabSize(int arg0);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  aload_2
	     6  ifnull 34
	     9  aload_0 [this]
	    10  invokevirtual javax.swing.JTextArea.getTabSize() : int [325]
	    13  istore_3
	    14  aload_2
	    15  ldc <String "tabSize"> [21]
	    17  iload_1 [arg0]
	    18  invokestatic java.lang.Integer.valueOf(int) : java.lang.Integer [311]
	    21  invokeinterface javax.swing.text.Document.putProperty(java.lang.Object, java.lang.Object) : void [356] [nargs: 3]
	    26  aload_0 [this]
	    27  ldc <String "tabSize"> [21]
	    29  iload_3
	    30  iload_1 [arg0]
	    31  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, int, int) : void [332]
	    34  return
	    Stack map table: number of frames 1
	        [pc: 34, append: {javax.swing.text.Document}]
	  
	  // Method descriptor #24 ()I
	  // Stack: 2, Locals: 4
	  public int getTabSize();
	     0  bipush 8
	     2  istore_1
	     3  aload_0 [this]
	     4  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     7  astore_2
	     8  aload_2
	     9  ifnull 33
	    12  aload_2
	    13  ldc <String "tabSize"> [21]
	    15  invokeinterface javax.swing.text.Document.getProperty(java.lang.Object) : java.lang.Object [355] [nargs: 2]
	    20  checkcast java.lang.Integer [178]
	    23  astore_3
	    24  aload_3
	    25  ifnull 33
	    28  aload_3
	    29  invokevirtual java.lang.Integer.intValue() : int [310]
	    32  istore_1
	    33  iload_1
	    34  ireturn
	    Stack map table: number of frames 1
	        [pc: 33, append: {int, javax.swing.text.Document}]
	  
	  // Method descriptor #38 (Z)V
	  // Stack: 4, Locals: 3
	  public void setLineWrap(boolean arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.wrap : boolean [302]
	     4  istore_2
	     5  aload_0 [this]
	     6  iload_1 [arg0]
	     7  putfield javax.swing.JTextArea.wrap : boolean [302]
	    10  aload_0 [this]
	    11  ldc <String "lineWrap"> [18]
	    13  iload_2
	    14  iload_1 [arg0]
	    15  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, boolean, boolean) : void [333]
	    18  return

	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getLineWrap();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.wrap : boolean [302]
	    4  ireturn

	  
	  // Method descriptor #38 (Z)V
	  // Stack: 4, Locals: 3
	  public void setWrapStyleWord(boolean arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.word : boolean [301]
	     4  istore_2
	     5  aload_0 [this]
	     6  iload_1 [arg0]
	     7  putfield javax.swing.JTextArea.word : boolean [301]
	    10  aload_0 [this]
	    11  ldc <String "wrapStyleWord"> [23]
	    13  iload_2
	    14  iload_1 [arg0]
	    15  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, boolean, boolean) : void [333]
	    18  return

	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getWrapStyleWord();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.word : boolean [301]
	    4  ireturn

	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 4
	  public int getLineOfOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Can't translate offset to line"> [7]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  aload_2
	    22  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    27  if_icmple 48
	    30  new javax.swing.text.BadLocationException [188]
	    33  dup
	    34  ldc <String "Can't translate offset to line"> [7]
	    36  aload_2
	    37  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    42  iconst_1
	    43  iadd
	    44  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    47  athrow
	    48  aload_0 [this]
	    49  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    52  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    57  astore_3
	    58  aload_3
	    59  iload_1 [arg0]
	    60  invokeinterface javax.swing.text.Element.getElementIndex(int) : int [361] [nargs: 2]
	    65  ireturn
	    Stack map table: number of frames 2
	        [pc: 20, append: {javax.swing.text.Document}]
	        [pc: 48, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 2
	  public int getLineCount();
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	     9  astore_1
	    10  aload_1
	    11  invokeinterface javax.swing.text.Element.getElementCount() : int [358] [nargs: 1]
	    16  ireturn

	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 5
	  public int getLineStartOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getLineCount() : int [323]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Negative line"> [9]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  iload_2
	    22  if_icmplt 46
	    25  new javax.swing.text.BadLocationException [188]
	    28  dup
	    29  ldc <String "No such line"> [10]
	    31  aload_0 [this]
	    32  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    35  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    40  iconst_1
	    41  iadd
	    42  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    45  athrow
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    50  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    55  astore_3
	    56  aload_3
	    57  iload_1 [arg0]
	    58  invokeinterface javax.swing.text.Element.getElement(int) : javax.swing.text.Element [362] [nargs: 2]
	    63  astore 4
	    65  aload 4
	    67  invokeinterface javax.swing.text.Element.getStartOffset() : int [360] [nargs: 1]
	    72  ireturn
	    Stack map table: number of frames 2
	        [pc: 20, append: {int}]
	        [pc: 46, same]
	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 6
	  public int getLineEndOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getLineCount() : int [323]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Negative line"> [9]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  iload_2
	    22  if_icmplt 46
	    25  new javax.swing.text.BadLocationException [188]
	    28  dup
	    29  ldc <String "No such line"> [10]
	    31  aload_0 [this]
	    32  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    35  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    40  iconst_1
	    41  iadd
	    42  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    45  athrow
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    50  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    55  astore_3
	    56  aload_3
	    57  iload_1 [arg0]
	    58  invokeinterface javax.swing.text.Element.getElement(int) : javax.swing.text.Element [362] [nargs: 2]
	    63  astore 4
	    65  aload 4
	    67  invokeinterface javax.swing.text.Element.getEndOffset() : int [359] [nargs: 1]
	    72  istore 5
	    74  iload_1 [arg0]
	    75  iload_2
	    76  iconst_1
	    77  isub
	    78  if_icmpne 88
	    81  iload 5
	    83  iconst_1
	    84  isub
	    85  goto 90
	    88  iload 5
	    90  ireturn
	    Stack map table: number of frames 4
	        [pc: 20, append: {int}]
	        [pc: 46, same]
	        [pc: 88, append: {javax.swing.text.Element, javax.swing.text.Element, int}]
	        [pc: 90, same_locals_1_stack_item, stack: {int}]
	  
	  // Method descriptor #201 (Ljava/lang/String;I)V
	  // Stack: 4, Locals: 5
	  public void insert(java.lang.String arg0, int arg1);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_3
	     5  aload_3
	     6  ifnull 36
	     9  aload_3
	    10  iload_2 [arg1]
	    11  aload_1 [arg0]
	    12  aconst_null
	    13  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    18  goto 36
	    21  astore 4
	    23  new java.lang.IllegalArgumentException [177]
	    26  dup
	    27  aload 4
	    29  invokevirtual javax.swing.text.BadLocationException.getMessage() : java.lang.String [343]
	    32  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    35  athrow
	    36  return
	      Exception Table:
	        [pc: 9, pc: 18] -> 21 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 2
	        [pc: 21, full, stack: {javax.swing.text.BadLocationException}, locals: {javax.swing.JTextArea, java.lang.String, int, javax.swing.text.Document}]
	        [pc: 36, same]
	  
	  // Method descriptor #37 (Ljava/lang/String;)V
	  // Stack: 4, Locals: 4
	  public void append(java.lang.String arg0);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  aload_2
	     6  ifnull 27
	     9  aload_2
	    10  aload_2
	    11  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    16  aload_1 [arg0]
	    17  aconst_null
	    18  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    23  goto 27
	    26  astore_3
	    27  return
	      Exception Table:
	        [pc: 9, pc: 23] -> 26 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 2
	        [pc: 26, full, stack: {javax.swing.text.BadLocationException}, locals: {javax.swing.JTextArea, java.lang.String, javax.swing.text.Document}]
	        [pc: 27, same]
	  
	  // Method descriptor #202 (Ljava/lang/String;II)V
	  // Stack: 5, Locals: 6
	  public void replaceRange(java.lang.String arg0, int arg1, int arg2);
	     0  iload_3 [arg2]
	     1  iload_2 [arg1]
	     2  if_icmpge 15
	     5  new java.lang.IllegalArgumentException [177]
	     8  dup
	     9  ldc <String "end before start"> [14]
	    11  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    14  athrow
	    15  aload_0 [this]
	    16  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    19  astore 4
	    21  aload 4
	    23  ifnull 90
	    26  aload 4
	    28  instanceof javax.swing.text.AbstractDocument [187]
	    31  ifeq 51
	    34  aload 4
	    36  checkcast javax.swing.text.AbstractDocument [187]
	    39  iload_2 [arg1]
	    40  iload_3 [arg2]
	    41  iload_2 [arg1]
	    42  isub
	    43  aload_1 [arg0]
	    44  aconst_null
	    45  invokevirtual javax.swing.text.AbstractDocument.replace(int, int, java.lang.String, javax.swing.text.AttributeSet) : void [342]
	    48  goto 72
	    51  aload 4
	    53  iload_2 [arg1]
	    54  iload_3 [arg2]
	    55  iload_2 [arg1]
	    56  isub
	    57  invokeinterface javax.swing.text.Document.remove(int, int) : void [353] [nargs: 3]
	    62  aload 4
	    64  iload_2 [arg1]
	    65  aload_1 [arg0]
	    66  aconst_null
	    67  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    72  goto 90
	    75  astore 5
	    77  new java.lang.IllegalArgumentException [177]
	    80  dup
	    81  aload 5
	    83  invokevirtual javax.swing.text.BadLocationException.getMessage() : java.lang.String [343]
	    86  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    89  athrow
	    90  return
	      Exception Table:
	        [pc: 26, pc: 72] -> 75 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 5
	        [pc: 15, same]
	        [pc: 51, append: {javax.swing.text.Document}]
	        [pc: 72, same]
	        [pc: 75, same_locals_1_stack_item, stack: {javax.swing.text.BadLocationException}]
	        [pc: 90, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 1
	  public int getRows();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.rows : int [300]
	    4  ireturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 3, Locals: 3
	  public void setRows(int arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.rows : int [300]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 19
	     9  new java.lang.IllegalArgumentException [177]
	    12  dup
	    13  ldc <String "rows less than zero."> [19]
	    15  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    18  athrow
	    19  iload_1 [arg0]
	    20  iload_2
	    21  if_icmpeq 33
	    24  aload_0 [this]
	    25  iload_1 [arg0]
	    26  putfield javax.swing.JTextArea.rows : int [300]
	    29  aload_0 [this]
	    30  invokevirtual javax.swing.JTextArea.invalidate() : void [326]
	    33  return
	    Stack map table: number of frames 2
	        [pc: 19, append: {int}]
	        [pc: 33, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 2, Locals: 2
	  protected int getRowHeight();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.rowHeight : int [299]
	     4  ifne 24
	     7  aload_0 [this]
	     8  aload_0 [this]
	     9  invokevirtual javax.swing.JTextArea.getFont() : java.awt.Font [328]
	    12  invokevirtual javax.swing.JTextArea.getFontMetrics(java.awt.Font) : java.awt.FontMetrics [337]
	    15  astore_1
	    16  aload_0 [this]
	    17  aload_1
	    18  invokevirtual java.awt.FontMetrics.getHeight() : int [306]
	    21  putfield javax.swing.JTextArea.rowHeight : int [299]
	    24  aload_0 [this]
	    25  getfield javax.swing.JTextArea.rowHeight : int [299]
	    28  ireturn
	    Stack map table: number of frames 1
	        [pc: 24, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 1
	  public int getColumns();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.columns : int [298]
	    4  ireturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 3, Locals: 3
	  public void setColumns(int arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.columns : int [298]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 19
	     9  new java.lang.IllegalArgumentException [177]
	    12  dup
	    13  ldc <String "columns less than zero."> [12]
	    15  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    18  athrow
	    19  iload_1 [arg0]
	    20  iload_2
	    21  if_icmpeq 33
	    24  aload_0 [this]
	    25  iload_1 [arg0]
	    26  putfield javax.swing.JTextArea.columns : int [298]
	    29  aload_0 [this]
	    30  invokevirtual javax.swing.JTextArea.invalidate() : void [326]
	    33  return
	    Stack map table: number of frames 2
	        [pc: 19, append: {int}]
	        [pc: 33, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 3, Locals: 2
	  protected int getColumnWidth();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.columnWidth : int [297]
	     4  ifne 26
	     7  aload_0 [this]
	     8  aload_0 [this]
	     9  invokevirtual javax.swing.JTextArea.getFont() : java.awt.Font [328]
	    12  invokevirtual javax.swing.JTextArea.getFontMetrics(java.awt.Font) : java.awt.FontMetrics [337]
	    15  astore_1
	    16  aload_0 [this]
	    17  aload_1
	    18  bipush 109
	    20  invokevirtual java.awt.FontMetrics.charWidth(char) : int [307]
	    23  putfield javax.swing.JTextArea.columnWidth : int [297]
	    26  aload_0 [this]
	    27  getfield javax.swing.JTextArea.columnWidth : int [297]
	    30  ireturn
	    Stack map table: number of frames 1
	        [pc: 26, same]
	  
	  // Method descriptor #195 ()Ljava/awt/Dimension;
	  // Stack: 4, Locals: 3
	  public java.awt.Dimension getPreferredSize();
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent.getPreferredSize() : java.awt.Dimension [348]
	      4  astore_1
	      5  aload_1
	      6  ifnonnull 25
	      9  new java.awt.Dimension [172]
	     12  dup
	     13  sipush 400
	     16  sipush 400
	     19  invokespecial java.awt.Dimension(int, int) [305]
	     22  goto 26
	     25  aload_1
	     26  astore_1
	     27  aload_0 [this]
	     28  invokevirtual javax.swing.JTextArea.getInsets() : java.awt.Insets [329]
	     31  astore_2
	     32  aload_0 [this]
	     33  getfield javax.swing.JTextArea.columns : int [298]
	     36  ifeq 69
	     39  aload_1
	     40  aload_1
	     41  getfield java.awt.Dimension.width : int [292]
	     44  aload_0 [this]
	     45  getfield javax.swing.JTextArea.columns : int [298]
	     48  aload_0 [this]
	     49  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	     52  imul
	     53  aload_2
	     54  getfield java.awt.Insets.left : int [294]
	     57  iadd
	     58  aload_2
	     59  getfield java.awt.Insets.right : int [295]
	     62  iadd
	     63  invokestatic java.lang.Math.max(int, int) : int [312]
	     66  putfield java.awt.Dimension.width : int [292]
	     69  aload_0 [this]
	     70  getfield javax.swing.JTextArea.rows : int [300]
	     73  ifeq 106
	     76  aload_1
	     77  aload_1
	     78  getfield java.awt.Dimension.height : int [291]
	     81  aload_0 [this]
	     82  getfield javax.swing.JTextArea.rows : int [300]
	     85  aload_0 [this]
	     86  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	     89  imul
	     90  aload_2
	     91  getfield java.awt.Insets.top : int [296]
	     94  iadd
	     95  aload_2
	     96  getfield java.awt.Insets.bottom : int [293]
	     99  iadd
	    100  invokestatic java.lang.Math.max(int, int) : int [312]
	    103  putfield java.awt.Dimension.height : int [291]
	    106  aload_1
	    107  areturn
	    Stack map table: number of frames 4
	        [pc: 25, append: {java.awt.Dimension}]
	        [pc: 26, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 69, append: {java.awt.Insets}]
	        [pc: 106, same]
	  
	  // Method descriptor #197 (Ljava/awt/Font;)V
	  // Stack: 2, Locals: 2
	  public void setFont(java.awt.Font arg0);
	     0  aload_0 [this]
	     1  aload_1 [arg0]
	     2  invokespecial javax.swing.text.JTextComponent.setFont(java.awt.Font) : void [349]
	     5  aload_0 [this]
	     6  iconst_0
	     7  putfield javax.swing.JTextArea.rowHeight : int [299]
	    10  aload_0 [this]
	    11  iconst_0
	    12  putfield javax.swing.JTextArea.columnWidth : int [297]
	    15  return

	  
	  // Method descriptor #25 ()Ljava/lang/String;
	  // Stack: 2, Locals: 3
	  protected java.lang.String paramString();
	      0  aload_0 [this]
	      1  getfield javax.swing.JTextArea.wrap : boolean [302]
	      4  ifeq 12
	      7  ldc <String "true"> [22]
	      9  goto 14
	     12  ldc <String "false"> [15]
	     14  astore_1
	     15  aload_0 [this]
	     16  getfield javax.swing.JTextArea.word : boolean [301]
	     19  ifeq 27
	     22  ldc <String "true"> [22]
	     24  goto 29
	     27  ldc <String "false"> [15]
	     29  astore_2
	     30  new java.lang.StringBuilder [181]
	     33  dup
	     34  invokespecial java.lang.StringBuilder() [314]
	     37  aload_0 [this]
	     38  invokespecial javax.swing.text.JTextComponent.paramString() : java.lang.String [350]
	     41  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     44  ldc <String ",colums="> [2]
	     46  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     49  aload_0 [this]
	     50  getfield javax.swing.JTextArea.columns : int [298]
	     53  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     56  ldc <String ",columWidth="> [1]
	     58  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     61  aload_0 [this]
	     62  getfield javax.swing.JTextArea.columnWidth : int [297]
	     65  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     68  ldc <String ",rows="> [4]
	     70  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     73  aload_0 [this]
	     74  getfield javax.swing.JTextArea.rows : int [300]
	     77  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     80  ldc <String ",rowHeight="> [3]
	     82  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     85  aload_0 [this]
	     86  getfield javax.swing.JTextArea.rowHeight : int [299]
	     89  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     92  ldc <String ",word="> [5]
	     94  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     97  aload_2
	     98  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    101  ldc <String ",wrap="> [6]
	    103  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    106  aload_1
	    107  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    110  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    113  areturn
	    Stack map table: number of frames 4
	        [pc: 12, same]
	        [pc: 14, same_locals_1_stack_item, stack: {java.lang.String}]
	        [pc: 27, append: {java.lang.String}]
	        [pc: 29, same_locals_1_stack_item, stack: {java.lang.String}]
	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getScrollableTracksViewportWidth();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.wrap : boolean [302]
	     4  ifeq 11
	     7  iconst_1
	     8  goto 15
	    11  aload_0 [this]
	    12  invokespecial javax.swing.text.JTextComponent.getScrollableTracksViewportWidth() : boolean [346]
	    15  ireturn
	    Stack map table: number of frames 2
	        [pc: 11, same]
	        [pc: 15, same_locals_1_stack_item, stack: {int}]
	  
	  // Method descriptor #195 ()Ljava/awt/Dimension;
	  // Stack: 4, Locals: 3
	  public java.awt.Dimension getPreferredScrollableViewportSize();
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent.getPreferredScrollableViewportSize() : java.awt.Dimension [347]
	      4  astore_1
	      5  aload_1
	      6  ifnonnull 25
	      9  new java.awt.Dimension [172]
	     12  dup
	     13  sipush 400
	     16  sipush 400
	     19  invokespecial java.awt.Dimension(int, int) [305]
	     22  goto 26
	     25  aload_1
	     26  astore_1
	     27  aload_0 [this]
	     28  invokevirtual javax.swing.JTextArea.getInsets() : java.awt.Insets [329]
	     31  astore_2
	     32  aload_1
	     33  aload_0 [this]
	     34  getfield javax.swing.JTextArea.columns : int [298]
	     37  ifne 47
	     40  aload_1
	     41  getfield java.awt.Dimension.width : int [292]
	     44  goto 66
	     47  aload_0 [this]
	     48  getfield javax.swing.JTextArea.columns : int [298]
	     51  aload_0 [this]
	     52  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	     55  imul
	     56  aload_2
	     57  getfield java.awt.Insets.left : int [294]
	     60  iadd
	     61  aload_2
	     62  getfield java.awt.Insets.right : int [295]
	     65  iadd
	     66  putfield java.awt.Dimension.width : int [292]
	     69  aload_1
	     70  aload_0 [this]
	     71  getfield javax.swing.JTextArea.rows : int [300]
	     74  ifne 84
	     77  aload_1
	     78  getfield java.awt.Dimension.height : int [291]
	     81  goto 103
	     84  aload_0 [this]
	     85  getfield javax.swing.JTextArea.rows : int [300]
	     88  aload_0 [this]
	     89  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	     92  imul
	     93  aload_2
	     94  getfield java.awt.Insets.top : int [296]
	     97  iadd
	     98  aload_2
	     99  getfield java.awt.Insets.bottom : int [293]
	    102  iadd
	    103  putfield java.awt.Dimension.height : int [291]
	    106  aload_1
	    107  areturn
	    Stack map table: number of frames 6
	        [pc: 25, append: {java.awt.Dimension}]
	        [pc: 26, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 47, full, stack: {java.awt.Dimension}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	        [pc: 66, full, stack: {java.awt.Dimension, int}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	        [pc: 84, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 103, full, stack: {java.awt.Dimension, int}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	  
	  // Method descriptor #199 (Ljava/awt/Rectangle;II)I
	  // Stack: 4, Locals: 4
	  public int getScrollableUnitIncrement(java.awt.Rectangle arg0, int arg1, int arg2);
	     0  iload_2 [arg1]
	     1  lookupswitch default: 38
	          case 0: 33
	          case 1: 28
	    28  aload_0 [this]
	    29  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	    32  ireturn
	    33  aload_0 [this]
	    34  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	    37  ireturn
	    38  new java.lang.IllegalArgumentException [177]
	    41  dup
	    42  new java.lang.StringBuilder [181]
	    45  dup
	    46  invokespecial java.lang.StringBuilder() [314]
	    49  ldc <String "Invalid orientation: "> [8]
	    51  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    54  iload_2 [arg1]
	    55  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	    58  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    61  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    64  athrow
	    Stack map table: number of frames 3
	        [pc: 28, same]
	        [pc: 33, same]
	        [pc: 38, same]
	  
	  // Method descriptor #33 (Ljava/io/ObjectOutputStream;)V
	  // Stack: 3, Locals: 3
	  private void writeObject(java.io.ObjectOutputStream arg0) throws java.io.IOException;
	     0  aload_1 [arg0]
	     1  invokevirtual java.io.ObjectOutputStream.defaultWriteObject() : void [308]
	     4  aload_0 [this]
	     5  invokevirtual javax.swing.JTextArea.getUIClassID() : java.lang.String [330]
	     8  ldc <String "TextAreaUI"> [11]
	    10  invokevirtual java.lang.String.equals(java.lang.Object) : boolean [313]
	    13  ifeq 50
	    16  aload_0 [this]
	    17  invokestatic javax.swing.JComponent.getWriteObjCounter(javax.swing.JComponent) : byte [320]
	    20  istore_2
	    21  aload_0 [this]
	    22  iload_2
	    23  iconst_1
	    24  isub
	    25  i2b
	    26  istore_2
	    27  iload_2
	    28  invokestatic javax.swing.JComponent.setWriteObjCounter(javax.swing.JComponent, byte) : void [321]
	    31  iload_2
	    32  ifne 50
	    35  aload_0 [this]
	    36  getfield javax.swing.JTextArea.ui : javax.swing.plaf.ComponentUI [304]
	    39  ifnull 50
	    42  aload_0 [this]
	    43  getfield javax.swing.JTextArea.ui : javax.swing.plaf.ComponentUI [304]
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.plaf.ComponentUI.installUI(javax.swing.JComponent) : void [341]
	    50  return
	    Stack map table: number of frames 1
	        [pc: 50, same]
	  
	  // Method descriptor #206 ()Ljavax/accessibility/AccessibleContext;
	  // Stack: 4, Locals: 1
	  public javax.accessibility.AccessibleContext getAccessibleContext();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	     4  ifnonnull 19
	     7  aload_0 [this]
	     8  new javax.swing.JTextArea$AccessibleJTextArea [184]
	    11  dup
	    12  aload_0 [this]
	    13  invokespecial javax.swing.JTextArea$AccessibleJTextArea(javax.swing.JTextArea) [339]
	    16  putfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	    19  aload_0 [this]
	    20  getfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	    23  areturn
	    Stack map table: number of frames 1
	        [pc: 19, same]

	  Inner classes:
	    [inner class info: #184 javax/swing/JTextArea$AccessibleJTextArea, outer class info: #183 javax/swing/JTextArea
	     inner name: #363 AccessibleJTextArea, accessflags: 4 protected]
	}//  (version 1.8 : 52.0, super bit)
public class javax.swing.JTextArea extends javax.swing.text.JTextComponent {
	  
	  // Field descriptor #53 Ljava/lang/String;
	  private static final java.lang.String uiClassID = "TextAreaUI";
	  
	  // Field descriptor #50 I
	  private int rows;
	  
	  // Field descriptor #50 I
	  private int columns;
	  
	  // Field descriptor #50 I
	  private int columnWidth;
	  
	  // Field descriptor #50 I
	  private int rowHeight;
	  
	  // Field descriptor #58 Z
	  private boolean wrap;
	  
	  // Field descriptor #58 Z
	  private boolean word;
	  
	  // Method descriptor #26 ()V
	  // Stack: 5, Locals: 1
	  public JTextArea();
	    0  aload_0 [this]
	    1  aconst_null
	    2  aconst_null
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #37 (Ljava/lang/String;)V
	  // Stack: 5, Locals: 2
	  public JTextArea(java.lang.String arg0);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aload_1 [arg0]
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #32 (II)V
	  // Stack: 5, Locals: 3
	  public JTextArea(int arg0, int arg1);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aconst_null
	    3  iload_1 [arg0]
	    4  iload_2 [arg1]
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #202 (Ljava/lang/String;II)V
	  // Stack: 5, Locals: 4
	  public JTextArea(java.lang.String arg0, int arg1, int arg2);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aload_1 [arg0]
	    3  iload_2 [arg1]
	    4  iload_3 [arg2]
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #212 (Ljavax/swing/text/Document;)V
	  // Stack: 5, Locals: 2
	  public JTextArea(javax.swing.text.Document arg0);
	    0  aload_0 [this]
	    1  aload_1 [arg0]
	    2  aconst_null
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #216 (Ljavax/swing/text/Document;Ljava/lang/String;II)V
	  // Stack: 4, Locals: 5
	  public JTextArea(javax.swing.text.Document arg0, java.lang.String arg1, int arg2, int arg3);
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent() [345]
	      4  aload_0 [this]
	      5  iload_3 [arg2]
	      6  putfield javax.swing.JTextArea.rows : int [300]
	      9  aload_0 [this]
	     10  iload 4 [arg3]
	     12  putfield javax.swing.JTextArea.columns : int [298]
	     15  aload_1 [arg0]
	     16  ifnonnull 24
	     19  aload_0 [this]
	     20  invokevirtual javax.swing.JTextArea.createDefaultModel() : javax.swing.text.Document [334]
	     23  astore_1 [arg0]
	     24  aload_0 [this]
	     25  aload_1 [arg0]
	     26  invokevirtual javax.swing.JTextArea.setDocument(javax.swing.text.Document) : void [336]
	     29  aload_2 [arg1]
	     30  ifnull 44
	     33  aload_0 [this]
	     34  aload_2 [arg1]
	     35  invokevirtual javax.swing.JTextArea.setText(java.lang.String) : void [331]
	     38  aload_0 [this]
	     39  iconst_0
	     40  iconst_0
	     41  invokevirtual javax.swing.JTextArea.select(int, int) : void [327]
	     44  iload_3 [arg2]
	     45  ifge 75
	     48  new java.lang.IllegalArgumentException [177]
	     51  dup
	     52  new java.lang.StringBuilder [181]
	     55  dup
	     56  invokespecial java.lang.StringBuilder() [314]
	     59  ldc <String "rows: "> [20]
	     61  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     64  iload_3 [arg2]
	     65  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     68  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	     71  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	     74  athrow
	     75  iload 4 [arg3]
	     77  ifge 108
	     80  new java.lang.IllegalArgumentException [177]
	     83  dup
	     84  new java.lang.StringBuilder [181]
	     87  dup
	     88  invokespecial java.lang.StringBuilder() [314]
	     91  ldc <String "columns: "> [13]
	     93  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     96  iload 4 [arg3]
	     98  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	    101  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    104  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    107  athrow
	    108  aload_0 [this]
	    109  ldc <String "focusTraversalKeysForward"> [17]
	    111  invokestatic javax.swing.JComponent.getManagingFocusForwardTraversalKeys() : java.util.Set [319]
	    114  invokestatic javax.swing.LookAndFeel.installProperty(javax.swing.JComponent, java.lang.String, java.lang.Object) : void [340]
	    117  aload_0 [this]
	    118  ldc <String "focusTraversalKeysBackward"> [16]
	    120  invokestatic javax.swing.JComponent.getManagingFocusBackwardTraversalKeys() : java.util.Set [318]
	    123  invokestatic javax.swing.LookAndFeel.installProperty(javax.swing.JComponent, java.lang.String, java.lang.Object) : void [340]
	    126  return
	    Stack map table: number of frames 4
	        [pc: 24, full, stack: {}, locals: {javax.swing.JTextArea, javax.swing.text.Document, java.lang.String, int, int}]
	        [pc: 44, same]
	        [pc: 75, same]
	        [pc: 108, same]
	  
	  // Method descriptor #25 ()Ljava/lang/String;
	  // Stack: 1, Locals: 1
	  public java.lang.String getUIClassID();
	    0  ldc <String "TextAreaUI"> [11]
	    2  areturn

	  
	  // Method descriptor #211 ()Ljavax/swing/text/Document;
	  // Stack: 2, Locals: 1
	  protected javax.swing.text.Document createDefaultModel();
	    0  new javax.swing.text.PlainDocument [192]
	    3  dup
	    4  invokespecial javax.swing.text.PlainDocument() [351]
	    7  areturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 4, Locals: 4
	  public void setTabSize(int arg0);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  aload_2
	     6  ifnull 34
	     9  aload_0 [this]
	    10  invokevirtual javax.swing.JTextArea.getTabSize() : int [325]
	    13  istore_3
	    14  aload_2
	    15  ldc <String "tabSize"> [21]
	    17  iload_1 [arg0]
	    18  invokestatic java.lang.Integer.valueOf(int) : java.lang.Integer [311]
	    21  invokeinterface javax.swing.text.Document.putProperty(java.lang.Object, java.lang.Object) : void [356] [nargs: 3]
	    26  aload_0 [this]
	    27  ldc <String "tabSize"> [21]
	    29  iload_3
	    30  iload_1 [arg0]
	    31  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, int, int) : void [332]
	    34  return
	    Stack map table: number of frames 1
	        [pc: 34, append: {javax.swing.text.Document}]
	  
	  // Method descriptor #24 ()I
	  // Stack: 2, Locals: 4
	  public int getTabSize();
	     0  bipush 8
	     2  istore_1
	     3  aload_0 [this]
	     4  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     7  astore_2
	     8  aload_2
	     9  ifnull 33
	    12  aload_2
	    13  ldc <String "tabSize"> [21]
	    15  invokeinterface javax.swing.text.Document.getProperty(java.lang.Object) : java.lang.Object [355] [nargs: 2]
	    20  checkcast java.lang.Integer [178]
	    23  astore_3
	    24  aload_3
	    25  ifnull 33
	    28  aload_3
	    29  invokevirtual java.lang.Integer.intValue() : int [310]
	    32  istore_1
	    33  iload_1
	    34  ireturn
	    Stack map table: number of frames 1
	        [pc: 33, append: {int, javax.swing.text.Document}]
	  
	  // Method descriptor #38 (Z)V
	  // Stack: 4, Locals: 3
	  public void setLineWrap(boolean arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.wrap : boolean [302]
	     4  istore_2
	     5  aload_0 [this]
	     6  iload_1 [arg0]
	     7  putfield javax.swing.JTextArea.wrap : boolean [302]
	    10  aload_0 [this]
	    11  ldc <String "lineWrap"> [18]
	    13  iload_2
	    14  iload_1 [arg0]
	    15  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, boolean, boolean) : void [333]
	    18  return

	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getLineWrap();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.wrap : boolean [302]
	    4  ireturn

	  
	  // Method descriptor #38 (Z)V
	  // Stack: 4, Locals: 3
	  public void setWrapStyleWord(boolean arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.word : boolean [301]
	     4  istore_2
	     5  aload_0 [this]
	     6  iload_1 [arg0]
	     7  putfield javax.swing.JTextArea.word : boolean [301]
	    10  aload_0 [this]
	    11  ldc <String "wrapStyleWord"> [23]
	    13  iload_2
	    14  iload_1 [arg0]
	    15  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, boolean, boolean) : void [333]
	    18  return

	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getWrapStyleWord();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.word : boolean [301]
	    4  ireturn

	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 4
	  public int getLineOfOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Can't translate offset to line"> [7]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  aload_2
	    22  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    27  if_icmple 48
	    30  new javax.swing.text.BadLocationException [188]
	    33  dup
	    34  ldc <String "Can't translate offset to line"> [7]
	    36  aload_2
	    37  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    42  iconst_1
	    43  iadd
	    44  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    47  athrow
	    48  aload_0 [this]
	    49  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    52  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    57  astore_3
	    58  aload_3
	    59  iload_1 [arg0]
	    60  invokeinterface javax.swing.text.Element.getElementIndex(int) : int [361] [nargs: 2]
	    65  ireturn
	    Stack map table: number of frames 2
	        [pc: 20, append: {javax.swing.text.Document}]
	        [pc: 48, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 2
	  public int getLineCount();
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	     9  astore_1
	    10  aload_1
	    11  invokeinterface javax.swing.text.Element.getElementCount() : int [358] [nargs: 1]
	    16  ireturn

	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 5
	  public int getLineStartOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getLineCount() : int [323]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Negative line"> [9]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  iload_2
	    22  if_icmplt 46
	    25  new javax.swing.text.BadLocationException [188]
	    28  dup
	    29  ldc <String "No such line"> [10]
	    31  aload_0 [this]
	    32  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    35  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    40  iconst_1
	    41  iadd
	    42  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    45  athrow
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    50  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    55  astore_3
	    56  aload_3
	    57  iload_1 [arg0]
	    58  invokeinterface javax.swing.text.Element.getElement(int) : javax.swing.text.Element [362] [nargs: 2]
	    63  astore 4
	    65  aload 4
	    67  invokeinterface javax.swing.text.Element.getStartOffset() : int [360] [nargs: 1]
	    72  ireturn
	    Stack map table: number of frames 2
	        [pc: 20, append: {int}]
	        [pc: 46, same]
	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 6
	  public int getLineEndOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getLineCount() : int [323]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Negative line"> [9]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  iload_2
	    22  if_icmplt 46
	    25  new javax.swing.text.BadLocationException [188]
	    28  dup
	    29  ldc <String "No such line"> [10]
	    31  aload_0 [this]
	    32  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    35  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    40  iconst_1
	    41  iadd
	    42  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    45  athrow
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    50  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    55  astore_3
	    56  aload_3
	    57  iload_1 [arg0]
	    58  invokeinterface javax.swing.text.Element.getElement(int) : javax.swing.text.Element [362] [nargs: 2]
	    63  astore 4
	    65  aload 4
	    67  invokeinterface javax.swing.text.Element.getEndOffset() : int [359] [nargs: 1]
	    72  istore 5
	    74  iload_1 [arg0]
	    75  iload_2
	    76  iconst_1
	    77  isub
	    78  if_icmpne 88
	    81  iload 5
	    83  iconst_1
	    84  isub
	    85  goto 90
	    88  iload 5
	    90  ireturn
	    Stack map table: number of frames 4
	        [pc: 20, append: {int}]
	        [pc: 46, same]
	        [pc: 88, append: {javax.swing.text.Element, javax.swing.text.Element, int}]
	        [pc: 90, same_locals_1_stack_item, stack: {int}]
	  
	  // Method descriptor #201 (Ljava/lang/String;I)V
	  // Stack: 4, Locals: 5
	  public void insert(java.lang.String arg0, int arg1);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_3
	     5  aload_3
	     6  ifnull 36
	     9  aload_3
	    10  iload_2 [arg1]
	    11  aload_1 [arg0]
	    12  aconst_null
	    13  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    18  goto 36
	    21  astore 4
	    23  new java.lang.IllegalArgumentException [177]
	    26  dup
	    27  aload 4
	    29  invokevirtual javax.swing.text.BadLocationException.getMessage() : java.lang.String [343]
	    32  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    35  athrow
	    36  return
	      Exception Table:
	        [pc: 9, pc: 18] -> 21 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 2
	        [pc: 21, full, stack: {javax.swing.text.BadLocationException}, locals: {javax.swing.JTextArea, java.lang.String, int, javax.swing.text.Document}]
	        [pc: 36, same]
	  
	  // Method descriptor #37 (Ljava/lang/String;)V
	  // Stack: 4, Locals: 4
	  public void append(java.lang.String arg0);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  aload_2
	     6  ifnull 27
	     9  aload_2
	    10  aload_2
	    11  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    16  aload_1 [arg0]
	    17  aconst_null
	    18  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    23  goto 27
	    26  astore_3
	    27  return
	      Exception Table:
	        [pc: 9, pc: 23] -> 26 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 2
	        [pc: 26, full, stack: {javax.swing.text.BadLocationException}, locals: {javax.swing.JTextArea, java.lang.String, javax.swing.text.Document}]
	        [pc: 27, same]
	  
	  // Method descriptor #202 (Ljava/lang/String;II)V
	  // Stack: 5, Locals: 6
	  public void replaceRange(java.lang.String arg0, int arg1, int arg2);
	     0  iload_3 [arg2]
	     1  iload_2 [arg1]
	     2  if_icmpge 15
	     5  new java.lang.IllegalArgumentException [177]
	     8  dup
	     9  ldc <String "end before start"> [14]
	    11  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    14  athrow
	    15  aload_0 [this]
	    16  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    19  astore 4
	    21  aload 4
	    23  ifnull 90
	    26  aload 4
	    28  instanceof javax.swing.text.AbstractDocument [187]
	    31  ifeq 51
	    34  aload 4
	    36  checkcast javax.swing.text.AbstractDocument [187]
	    39  iload_2 [arg1]
	    40  iload_3 [arg2]
	    41  iload_2 [arg1]
	    42  isub
	    43  aload_1 [arg0]
	    44  aconst_null
	    45  invokevirtual javax.swing.text.AbstractDocument.replace(int, int, java.lang.String, javax.swing.text.AttributeSet) : void [342]
	    48  goto 72
	    51  aload 4
	    53  iload_2 [arg1]
	    54  iload_3 [arg2]
	    55  iload_2 [arg1]
	    56  isub
	    57  invokeinterface javax.swing.text.Document.remove(int, int) : void [353] [nargs: 3]
	    62  aload 4
	    64  iload_2 [arg1]
	    65  aload_1 [arg0]
	    66  aconst_null
	    67  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    72  goto 90
	    75  astore 5
	    77  new java.lang.IllegalArgumentException [177]
	    80  dup
	    81  aload 5
	    83  invokevirtual javax.swing.text.BadLocationException.getMessage() : java.lang.String [343]
	    86  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    89  athrow
	    90  return
	      Exception Table:
	        [pc: 26, pc: 72] -> 75 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 5
	        [pc: 15, same]
	        [pc: 51, append: {javax.swing.text.Document}]
	        [pc: 72, same]
	        [pc: 75, same_locals_1_stack_item, stack: {javax.swing.text.BadLocationException}]
	        [pc: 90, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 1
	  public int getRows();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.rows : int [300]
	    4  ireturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 3, Locals: 3
	  public void setRows(int arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.rows : int [300]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 19
	     9  new java.lang.IllegalArgumentException [177]
	    12  dup
	    13  ldc <String "rows less than zero."> [19]
	    15  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    18  athrow
	    19  iload_1 [arg0]
	    20  iload_2
	    21  if_icmpeq 33
	    24  aload_0 [this]
	    25  iload_1 [arg0]
	    26  putfield javax.swing.JTextArea.rows : int [300]
	    29  aload_0 [this]
	    30  invokevirtual javax.swing.JTextArea.invalidate() : void [326]
	    33  return
	    Stack map table: number of frames 2
	        [pc: 19, append: {int}]
	        [pc: 33, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 2, Locals: 2
	  protected int getRowHeight();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.rowHeight : int [299]
	     4  ifne 24
	     7  aload_0 [this]
	     8  aload_0 [this]
	     9  invokevirtual javax.swing.JTextArea.getFont() : java.awt.Font [328]
	    12  invokevirtual javax.swing.JTextArea.getFontMetrics(java.awt.Font) : java.awt.FontMetrics [337]
	    15  astore_1
	    16  aload_0 [this]
	    17  aload_1
	    18  invokevirtual java.awt.FontMetrics.getHeight() : int [306]
	    21  putfield javax.swing.JTextArea.rowHeight : int [299]
	    24  aload_0 [this]
	    25  getfield javax.swing.JTextArea.rowHeight : int [299]
	    28  ireturn
	    Stack map table: number of frames 1
	        [pc: 24, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 1
	  public int getColumns();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.columns : int [298]
	    4  ireturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 3, Locals: 3
	  public void setColumns(int arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.columns : int [298]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 19
	     9  new java.lang.IllegalArgumentException [177]
	    12  dup
	    13  ldc <String "columns less than zero."> [12]
	    15  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    18  athrow
	    19  iload_1 [arg0]
	    20  iload_2
	    21  if_icmpeq 33
	    24  aload_0 [this]
	    25  iload_1 [arg0]
	    26  putfield javax.swing.JTextArea.columns : int [298]
	    29  aload_0 [this]
	    30  invokevirtual javax.swing.JTextArea.invalidate() : void [326]
	    33  return
	    Stack map table: number of frames 2
	        [pc: 19, append: {int}]
	        [pc: 33, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 3, Locals: 2
	  protected int getColumnWidth();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.columnWidth : int [297]
	     4  ifne 26
	     7  aload_0 [this]
	     8  aload_0 [this]
	     9  invokevirtual javax.swing.JTextArea.getFont() : java.awt.Font [328]
	    12  invokevirtual javax.swing.JTextArea.getFontMetrics(java.awt.Font) : java.awt.FontMetrics [337]
	    15  astore_1
	    16  aload_0 [this]
	    17  aload_1
	    18  bipush 109
	    20  invokevirtual java.awt.FontMetrics.charWidth(char) : int [307]
	    23  putfield javax.swing.JTextArea.columnWidth : int [297]
	    26  aload_0 [this]
	    27  getfield javax.swing.JTextArea.columnWidth : int [297]
	    30  ireturn
	    Stack map table: number of frames 1
	        [pc: 26, same]
	  
	  // Method descriptor #195 ()Ljava/awt/Dimension;
	  // Stack: 4, Locals: 3
	  public java.awt.Dimension getPreferredSize();
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent.getPreferredSize() : java.awt.Dimension [348]
	      4  astore_1
	      5  aload_1
	      6  ifnonnull 25
	      9  new java.awt.Dimension [172]
	     12  dup
	     13  sipush 400
	     16  sipush 400
	     19  invokespecial java.awt.Dimension(int, int) [305]
	     22  goto 26
	     25  aload_1
	     26  astore_1
	     27  aload_0 [this]
	     28  invokevirtual javax.swing.JTextArea.getInsets() : java.awt.Insets [329]
	     31  astore_2
	     32  aload_0 [this]
	     33  getfield javax.swing.JTextArea.columns : int [298]
	     36  ifeq 69
	     39  aload_1
	     40  aload_1
	     41  getfield java.awt.Dimension.width : int [292]
	     44  aload_0 [this]
	     45  getfield javax.swing.JTextArea.columns : int [298]
	     48  aload_0 [this]
	     49  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	     52  imul
	     53  aload_2
	     54  getfield java.awt.Insets.left : int [294]
	     57  iadd
	     58  aload_2
	     59  getfield java.awt.Insets.right : int [295]
	     62  iadd
	     63  invokestatic java.lang.Math.max(int, int) : int [312]
	     66  putfield java.awt.Dimension.width : int [292]
	     69  aload_0 [this]
	     70  getfield javax.swing.JTextArea.rows : int [300]
	     73  ifeq 106
	     76  aload_1
	     77  aload_1
	     78  getfield java.awt.Dimension.height : int [291]
	     81  aload_0 [this]
	     82  getfield javax.swing.JTextArea.rows : int [300]
	     85  aload_0 [this]
	     86  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	     89  imul
	     90  aload_2
	     91  getfield java.awt.Insets.top : int [296]
	     94  iadd
	     95  aload_2
	     96  getfield java.awt.Insets.bottom : int [293]
	     99  iadd
	    100  invokestatic java.lang.Math.max(int, int) : int [312]
	    103  putfield java.awt.Dimension.height : int [291]
	    106  aload_1
	    107  areturn
	    Stack map table: number of frames 4
	        [pc: 25, append: {java.awt.Dimension}]
	        [pc: 26, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 69, append: {java.awt.Insets}]
	        [pc: 106, same]
	  
	  // Method descriptor #197 (Ljava/awt/Font;)V
	  // Stack: 2, Locals: 2
	  public void setFont(java.awt.Font arg0);
	     0  aload_0 [this]
	     1  aload_1 [arg0]
	     2  invokespecial javax.swing.text.JTextComponent.setFont(java.awt.Font) : void [349]
	     5  aload_0 [this]
	     6  iconst_0
	     7  putfield javax.swing.JTextArea.rowHeight : int [299]
	    10  aload_0 [this]
	    11  iconst_0
	    12  putfield javax.swing.JTextArea.columnWidth : int [297]
	    15  return

	  
	  // Method descriptor #25 ()Ljava/lang/String;
	  // Stack: 2, Locals: 3
	  protected java.lang.String paramString();
	      0  aload_0 [this]
	      1  getfield javax.swing.JTextArea.wrap : boolean [302]
	      4  ifeq 12
	      7  ldc <String "true"> [22]
	      9  goto 14
	     12  ldc <String "false"> [15]
	     14  astore_1
	     15  aload_0 [this]
	     16  getfield javax.swing.JTextArea.word : boolean [301]
	     19  ifeq 27
	     22  ldc <String "true"> [22]
	     24  goto 29
	     27  ldc <String "false"> [15]
	     29  astore_2
	     30  new java.lang.StringBuilder [181]
	     33  dup
	     34  invokespecial java.lang.StringBuilder() [314]
	     37  aload_0 [this]
	     38  invokespecial javax.swing.text.JTextComponent.paramString() : java.lang.String [350]
	     41  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     44  ldc <String ",colums="> [2]
	     46  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     49  aload_0 [this]
	     50  getfield javax.swing.JTextArea.columns : int [298]
	     53  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     56  ldc <String ",columWidth="> [1]
	     58  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     61  aload_0 [this]
	     62  getfield javax.swing.JTextArea.columnWidth : int [297]
	     65  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     68  ldc <String ",rows="> [4]
	     70  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     73  aload_0 [this]
	     74  getfield javax.swing.JTextArea.rows : int [300]
	     77  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     80  ldc <String ",rowHeight="> [3]
	     82  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     85  aload_0 [this]
	     86  getfield javax.swing.JTextArea.rowHeight : int [299]
	     89  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     92  ldc <String ",word="> [5]
	     94  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     97  aload_2
	     98  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    101  ldc <String ",wrap="> [6]
	    103  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    106  aload_1
	    107  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    110  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    113  areturn
	    Stack map table: number of frames 4
	        [pc: 12, same]
	        [pc: 14, same_locals_1_stack_item, stack: {java.lang.String}]
	        [pc: 27, append: {java.lang.String}]
	        [pc: 29, same_locals_1_stack_item, stack: {java.lang.String}]
	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getScrollableTracksViewportWidth();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.wrap : boolean [302]
	     4  ifeq 11
	     7  iconst_1
	     8  goto 15
	    11  aload_0 [this]
	    12  invokespecial javax.swing.text.JTextComponent.getScrollableTracksViewportWidth() : boolean [346]
	    15  ireturn
	    Stack map table: number of frames 2
	        [pc: 11, same]
	        [pc: 15, same_locals_1_stack_item, stack: {int}]
	  
	  // Method descriptor #195 ()Ljava/awt/Dimension;
	  // Stack: 4, Locals: 3
	  public java.awt.Dimension getPreferredScrollableViewportSize();
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent.getPreferredScrollableViewportSize() : java.awt.Dimension [347]
	      4  astore_1
	      5  aload_1
	      6  ifnonnull 25
	      9  new java.awt.Dimension [172]
	     12  dup
	     13  sipush 400
	     16  sipush 400
	     19  invokespecial java.awt.Dimension(int, int) [305]
	     22  goto 26
	     25  aload_1
	     26  astore_1
	     27  aload_0 [this]
	     28  invokevirtual javax.swing.JTextArea.getInsets() : java.awt.Insets [329]
	     31  astore_2
	     32  aload_1
	     33  aload_0 [this]
	     34  getfield javax.swing.JTextArea.columns : int [298]
	     37  ifne 47
	     40  aload_1
	     41  getfield java.awt.Dimension.width : int [292]
	     44  goto 66
	     47  aload_0 [this]
	     48  getfield javax.swing.JTextArea.columns : int [298]
	     51  aload_0 [this]
	     52  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	     55  imul
	     56  aload_2
	     57  getfield java.awt.Insets.left : int [294]
	     60  iadd
	     61  aload_2
	     62  getfield java.awt.Insets.right : int [295]
	     65  iadd
	     66  putfield java.awt.Dimension.width : int [292]
	     69  aload_1
	     70  aload_0 [this]
	     71  getfield javax.swing.JTextArea.rows : int [300]
	     74  ifne 84
	     77  aload_1
	     78  getfield java.awt.Dimension.height : int [291]
	     81  goto 103
	     84  aload_0 [this]
	     85  getfield javax.swing.JTextArea.rows : int [300]
	     88  aload_0 [this]
	     89  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	     92  imul
	     93  aload_2
	     94  getfield java.awt.Insets.top : int [296]
	     97  iadd
	     98  aload_2
	     99  getfield java.awt.Insets.bottom : int [293]
	    102  iadd
	    103  putfield java.awt.Dimension.height : int [291]
	    106  aload_1
	    107  areturn
	    Stack map table: number of frames 6
	        [pc: 25, append: {java.awt.Dimension}]
	        [pc: 26, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 47, full, stack: {java.awt.Dimension}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	        [pc: 66, full, stack: {java.awt.Dimension, int}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	        [pc: 84, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 103, full, stack: {java.awt.Dimension, int}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	  
	  // Method descriptor #199 (Ljava/awt/Rectangle;II)I
	  // Stack: 4, Locals: 4
	  public int getScrollableUnitIncrement(java.awt.Rectangle arg0, int arg1, int arg2);
	     0  iload_2 [arg1]
	     1  lookupswitch default: 38
	          case 0: 33
	          case 1: 28
	    28  aload_0 [this]
	    29  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	    32  ireturn
	    33  aload_0 [this]
	    34  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	    37  ireturn
	    38  new java.lang.IllegalArgumentException [177]
	    41  dup
	    42  new java.lang.StringBuilder [181]
	    45  dup
	    46  invokespecial java.lang.StringBuilder() [314]
	    49  ldc <String "Invalid orientation: "> [8]
	    51  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    54  iload_2 [arg1]
	    55  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	    58  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    61  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    64  athrow
	    Stack map table: number of frames 3
	        [pc: 28, same]
	        [pc: 33, same]
	        [pc: 38, same]
	  
	  // Method descriptor #33 (Ljava/io/ObjectOutputStream;)V
	  // Stack: 3, Locals: 3
	  private void writeObject(java.io.ObjectOutputStream arg0) throws java.io.IOException;
	     0  aload_1 [arg0]
	     1  invokevirtual java.io.ObjectOutputStream.defaultWriteObject() : void [308]
	     4  aload_0 [this]
	     5  invokevirtual javax.swing.JTextArea.getUIClassID() : java.lang.String [330]
	     8  ldc <String "TextAreaUI"> [11]
	    10  invokevirtual java.lang.String.equals(java.lang.Object) : boolean [313]
	    13  ifeq 50
	    16  aload_0 [this]
	    17  invokestatic javax.swing.JComponent.getWriteObjCounter(javax.swing.JComponent) : byte [320]
	    20  istore_2
	    21  aload_0 [this]
	    22  iload_2
	    23  iconst_1
	    24  isub
	    25  i2b
	    26  istore_2
	    27  iload_2
	    28  invokestatic javax.swing.JComponent.setWriteObjCounter(javax.swing.JComponent, byte) : void [321]
	    31  iload_2
	    32  ifne 50
	    35  aload_0 [this]
	    36  getfield javax.swing.JTextArea.ui : javax.swing.plaf.ComponentUI [304]
	    39  ifnull 50
	    42  aload_0 [this]
	    43  getfield javax.swing.JTextArea.ui : javax.swing.plaf.ComponentUI [304]
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.plaf.ComponentUI.installUI(javax.swing.JComponent) : void [341]
	    50  return
	    Stack map table: number of frames 1
	        [pc: 50, same]
	  
	  // Method descriptor #206 ()Ljavax/accessibility/AccessibleContext;
	  // Stack: 4, Locals: 1
	  public javax.accessibility.AccessibleContext getAccessibleContext();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	     4  ifnonnull 19
	     7  aload_0 [this]
	     8  new javax.swing.JTextArea$AccessibleJTextArea [184]
	    11  dup
	    12  aload_0 [this]
	    13  invokespecial javax.swing.JTextArea$AccessibleJTextArea(javax.swing.JTextArea) [339]
	    16  putfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	    19  aload_0 [this]
	    20  getfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	    23  areturn
	    Stack map table: number of frames 1
	        [pc: 19, same]

	  Inner classes:
	    [inner class info: #184 javax/swing/JTextArea$AccessibleJTextArea, outer class info: #183 javax/swing/JTextArea
	     inner name: #363 AccessibleJTextArea, accessflags: 4 protected]
	}//  (version 1.8 : 52.0, super bit)
public class javax.swing.JTextArea extends javax.swing.text.JTextComponent {
	  
	  // Field descriptor #53 Ljava/lang/String;
	  private static final java.lang.String uiClassID = "TextAreaUI";
	  
	  // Field descriptor #50 I
	  private int rows;
	  
	  // Field descriptor #50 I
	  private int columns;
	  
	  // Field descriptor #50 I
	  private int columnWidth;
	  
	  // Field descriptor #50 I
	  private int rowHeight;
	  
	  // Field descriptor #58 Z
	  private boolean wrap;
	  
	  // Field descriptor #58 Z
	  private boolean word;
	  
	  // Method descriptor #26 ()V
	  // Stack: 5, Locals: 1
	  public JTextArea();
	    0  aload_0 [this]
	    1  aconst_null
	    2  aconst_null
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #37 (Ljava/lang/String;)V
	  // Stack: 5, Locals: 2
	  public JTextArea(java.lang.String arg0);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aload_1 [arg0]
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #32 (II)V
	  // Stack: 5, Locals: 3
	  public JTextArea(int arg0, int arg1);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aconst_null
	    3  iload_1 [arg0]
	    4  iload_2 [arg1]
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #202 (Ljava/lang/String;II)V
	  // Stack: 5, Locals: 4
	  public JTextArea(java.lang.String arg0, int arg1, int arg2);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aload_1 [arg0]
	    3  iload_2 [arg1]
	    4  iload_3 [arg2]
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #212 (Ljavax/swing/text/Document;)V
	  // Stack: 5, Locals: 2
	  public JTextArea(javax.swing.text.Document arg0);
	    0  aload_0 [this]
	    1  aload_1 [arg0]
	    2  aconst_null
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #216 (Ljavax/swing/text/Document;Ljava/lang/String;II)V
	  // Stack: 4, Locals: 5
	  public JTextArea(javax.swing.text.Document arg0, java.lang.String arg1, int arg2, int arg3);
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent() [345]
	      4  aload_0 [this]
	      5  iload_3 [arg2]
	      6  putfield javax.swing.JTextArea.rows : int [300]
	      9  aload_0 [this]
	     10  iload 4 [arg3]
	     12  putfield javax.swing.JTextArea.columns : int [298]
	     15  aload_1 [arg0]
	     16  ifnonnull 24
	     19  aload_0 [this]
	     20  invokevirtual javax.swing.JTextArea.createDefaultModel() : javax.swing.text.Document [334]
	     23  astore_1 [arg0]
	     24  aload_0 [this]
	     25  aload_1 [arg0]
	     26  invokevirtual javax.swing.JTextArea.setDocument(javax.swing.text.Document) : void [336]
	     29  aload_2 [arg1]
	     30  ifnull 44
	     33  aload_0 [this]
	     34  aload_2 [arg1]
	     35  invokevirtual javax.swing.JTextArea.setText(java.lang.String) : void [331]
	     38  aload_0 [this]
	     39  iconst_0
	     40  iconst_0
	     41  invokevirtual javax.swing.JTextArea.select(int, int) : void [327]
	     44  iload_3 [arg2]
	     45  ifge 75
	     48  new java.lang.IllegalArgumentException [177]
	     51  dup
	     52  new java.lang.StringBuilder [181]
	     55  dup
	     56  invokespecial java.lang.StringBuilder() [314]
	     59  ldc <String "rows: "> [20]
	     61  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     64  iload_3 [arg2]
	     65  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     68  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	     71  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	     74  athrow
	     75  iload 4 [arg3]
	     77  ifge 108
	     80  new java.lang.IllegalArgumentException [177]
	     83  dup
	     84  new java.lang.StringBuilder [181]
	     87  dup
	     88  invokespecial java.lang.StringBuilder() [314]
	     91  ldc <String "columns: "> [13]
	     93  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     96  iload 4 [arg3]
	     98  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	    101  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    104  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    107  athrow
	    108  aload_0 [this]
	    109  ldc <String "focusTraversalKeysForward"> [17]
	    111  invokestatic javax.swing.JComponent.getManagingFocusForwardTraversalKeys() : java.util.Set [319]
	    114  invokestatic javax.swing.LookAndFeel.installProperty(javax.swing.JComponent, java.lang.String, java.lang.Object) : void [340]
	    117  aload_0 [this]
	    118  ldc <String "focusTraversalKeysBackward"> [16]
	    120  invokestatic javax.swing.JComponent.getManagingFocusBackwardTraversalKeys() : java.util.Set [318]
	    123  invokestatic javax.swing.LookAndFeel.installProperty(javax.swing.JComponent, java.lang.String, java.lang.Object) : void [340]
	    126  return
	    Stack map table: number of frames 4
	        [pc: 24, full, stack: {}, locals: {javax.swing.JTextArea, javax.swing.text.Document, java.lang.String, int, int}]
	        [pc: 44, same]
	        [pc: 75, same]
	        [pc: 108, same]
	  
	  // Method descriptor #25 ()Ljava/lang/String;
	  // Stack: 1, Locals: 1
	  public java.lang.String getUIClassID();
	    0  ldc <String "TextAreaUI"> [11]
	    2  areturn

	  
	  // Method descriptor #211 ()Ljavax/swing/text/Document;
	  // Stack: 2, Locals: 1
	  protected javax.swing.text.Document createDefaultModel();
	    0  new javax.swing.text.PlainDocument [192]
	    3  dup
	    4  invokespecial javax.swing.text.PlainDocument() [351]
	    7  areturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 4, Locals: 4
	  public void setTabSize(int arg0);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  aload_2
	     6  ifnull 34
	     9  aload_0 [this]
	    10  invokevirtual javax.swing.JTextArea.getTabSize() : int [325]
	    13  istore_3
	    14  aload_2
	    15  ldc <String "tabSize"> [21]
	    17  iload_1 [arg0]
	    18  invokestatic java.lang.Integer.valueOf(int) : java.lang.Integer [311]
	    21  invokeinterface javax.swing.text.Document.putProperty(java.lang.Object, java.lang.Object) : void [356] [nargs: 3]
	    26  aload_0 [this]
	    27  ldc <String "tabSize"> [21]
	    29  iload_3
	    30  iload_1 [arg0]
	    31  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, int, int) : void [332]
	    34  return
	    Stack map table: number of frames 1
	        [pc: 34, append: {javax.swing.text.Document}]
	  
	  // Method descriptor #24 ()I
	  // Stack: 2, Locals: 4
	  public int getTabSize();
	     0  bipush 8
	     2  istore_1
	     3  aload_0 [this]
	     4  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     7  astore_2
	     8  aload_2
	     9  ifnull 33
	    12  aload_2
	    13  ldc <String "tabSize"> [21]
	    15  invokeinterface javax.swing.text.Document.getProperty(java.lang.Object) : java.lang.Object [355] [nargs: 2]
	    20  checkcast java.lang.Integer [178]
	    23  astore_3
	    24  aload_3
	    25  ifnull 33
	    28  aload_3
	    29  invokevirtual java.lang.Integer.intValue() : int [310]
	    32  istore_1
	    33  iload_1
	    34  ireturn
	    Stack map table: number of frames 1
	        [pc: 33, append: {int, javax.swing.text.Document}]
	  
	  // Method descriptor #38 (Z)V
	  // Stack: 4, Locals: 3
	  public void setLineWrap(boolean arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.wrap : boolean [302]
	     4  istore_2
	     5  aload_0 [this]
	     6  iload_1 [arg0]
	     7  putfield javax.swing.JTextArea.wrap : boolean [302]
	    10  aload_0 [this]
	    11  ldc <String "lineWrap"> [18]
	    13  iload_2
	    14  iload_1 [arg0]
	    15  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, boolean, boolean) : void [333]
	    18  return

	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getLineWrap();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.wrap : boolean [302]
	    4  ireturn

	  
	  // Method descriptor #38 (Z)V
	  // Stack: 4, Locals: 3
	  public void setWrapStyleWord(boolean arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.word : boolean [301]
	     4  istore_2
	     5  aload_0 [this]
	     6  iload_1 [arg0]
	     7  putfield javax.swing.JTextArea.word : boolean [301]
	    10  aload_0 [this]
	    11  ldc <String "wrapStyleWord"> [23]
	    13  iload_2
	    14  iload_1 [arg0]
	    15  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, boolean, boolean) : void [333]
	    18  return

	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getWrapStyleWord();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.word : boolean [301]
	    4  ireturn

	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 4
	  public int getLineOfOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Can't translate offset to line"> [7]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  aload_2
	    22  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    27  if_icmple 48
	    30  new javax.swing.text.BadLocationException [188]
	    33  dup
	    34  ldc <String "Can't translate offset to line"> [7]
	    36  aload_2
	    37  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    42  iconst_1
	    43  iadd
	    44  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    47  athrow
	    48  aload_0 [this]
	    49  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    52  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    57  astore_3
	    58  aload_3
	    59  iload_1 [arg0]
	    60  invokeinterface javax.swing.text.Element.getElementIndex(int) : int [361] [nargs: 2]
	    65  ireturn
	    Stack map table: number of frames 2
	        [pc: 20, append: {javax.swing.text.Document}]
	        [pc: 48, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 2
	  public int getLineCount();
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	     9  astore_1
	    10  aload_1
	    11  invokeinterface javax.swing.text.Element.getElementCount() : int [358] [nargs: 1]
	    16  ireturn

	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 5
	  public int getLineStartOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getLineCount() : int [323]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Negative line"> [9]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  iload_2
	    22  if_icmplt 46
	    25  new javax.swing.text.BadLocationException [188]
	    28  dup
	    29  ldc <String "No such line"> [10]
	    31  aload_0 [this]
	    32  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    35  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    40  iconst_1
	    41  iadd
	    42  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    45  athrow
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    50  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    55  astore_3
	    56  aload_3
	    57  iload_1 [arg0]
	    58  invokeinterface javax.swing.text.Element.getElement(int) : javax.swing.text.Element [362] [nargs: 2]
	    63  astore 4
	    65  aload 4
	    67  invokeinterface javax.swing.text.Element.getStartOffset() : int [360] [nargs: 1]
	    72  ireturn
	    Stack map table: number of frames 2
	        [pc: 20, append: {int}]
	        [pc: 46, same]
	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 6
	  public int getLineEndOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getLineCount() : int [323]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Negative line"> [9]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  iload_2
	    22  if_icmplt 46
	    25  new javax.swing.text.BadLocationException [188]
	    28  dup
	    29  ldc <String "No such line"> [10]
	    31  aload_0 [this]
	    32  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    35  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    40  iconst_1
	    41  iadd
	    42  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    45  athrow
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    50  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    55  astore_3
	    56  aload_3
	    57  iload_1 [arg0]
	    58  invokeinterface javax.swing.text.Element.getElement(int) : javax.swing.text.Element [362] [nargs: 2]
	    63  astore 4
	    65  aload 4
	    67  invokeinterface javax.swing.text.Element.getEndOffset() : int [359] [nargs: 1]
	    72  istore 5
	    74  iload_1 [arg0]
	    75  iload_2
	    76  iconst_1
	    77  isub
	    78  if_icmpne 88
	    81  iload 5
	    83  iconst_1
	    84  isub
	    85  goto 90
	    88  iload 5
	    90  ireturn
	    Stack map table: number of frames 4
	        [pc: 20, append: {int}]
	        [pc: 46, same]
	        [pc: 88, append: {javax.swing.text.Element, javax.swing.text.Element, int}]
	        [pc: 90, same_locals_1_stack_item, stack: {int}]
	  
	  // Method descriptor #201 (Ljava/lang/String;I)V
	  // Stack: 4, Locals: 5
	  public void insert(java.lang.String arg0, int arg1);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_3
	     5  aload_3
	     6  ifnull 36
	     9  aload_3
	    10  iload_2 [arg1]
	    11  aload_1 [arg0]
	    12  aconst_null
	    13  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    18  goto 36
	    21  astore 4
	    23  new java.lang.IllegalArgumentException [177]
	    26  dup
	    27  aload 4
	    29  invokevirtual javax.swing.text.BadLocationException.getMessage() : java.lang.String [343]
	    32  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    35  athrow
	    36  return
	      Exception Table:
	        [pc: 9, pc: 18] -> 21 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 2
	        [pc: 21, full, stack: {javax.swing.text.BadLocationException}, locals: {javax.swing.JTextArea, java.lang.String, int, javax.swing.text.Document}]
	        [pc: 36, same]
	  
	  // Method descriptor #37 (Ljava/lang/String;)V
	  // Stack: 4, Locals: 4
	  public void append(java.lang.String arg0);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  aload_2
	     6  ifnull 27
	     9  aload_2
	    10  aload_2
	    11  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    16  aload_1 [arg0]
	    17  aconst_null
	    18  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    23  goto 27
	    26  astore_3
	    27  return
	      Exception Table:
	        [pc: 9, pc: 23] -> 26 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 2
	        [pc: 26, full, stack: {javax.swing.text.BadLocationException}, locals: {javax.swing.JTextArea, java.lang.String, javax.swing.text.Document}]
	        [pc: 27, same]
	  
	  // Method descriptor #202 (Ljava/lang/String;II)V
	  // Stack: 5, Locals: 6
	  public void replaceRange(java.lang.String arg0, int arg1, int arg2);
	     0  iload_3 [arg2]
	     1  iload_2 [arg1]
	     2  if_icmpge 15
	     5  new java.lang.IllegalArgumentException [177]
	     8  dup
	     9  ldc <String "end before start"> [14]
	    11  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    14  athrow
	    15  aload_0 [this]
	    16  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    19  astore 4
	    21  aload 4
	    23  ifnull 90
	    26  aload 4
	    28  instanceof javax.swing.text.AbstractDocument [187]
	    31  ifeq 51
	    34  aload 4
	    36  checkcast javax.swing.text.AbstractDocument [187]
	    39  iload_2 [arg1]
	    40  iload_3 [arg2]
	    41  iload_2 [arg1]
	    42  isub
	    43  aload_1 [arg0]
	    44  aconst_null
	    45  invokevirtual javax.swing.text.AbstractDocument.replace(int, int, java.lang.String, javax.swing.text.AttributeSet) : void [342]
	    48  goto 72
	    51  aload 4
	    53  iload_2 [arg1]
	    54  iload_3 [arg2]
	    55  iload_2 [arg1]
	    56  isub
	    57  invokeinterface javax.swing.text.Document.remove(int, int) : void [353] [nargs: 3]
	    62  aload 4
	    64  iload_2 [arg1]
	    65  aload_1 [arg0]
	    66  aconst_null
	    67  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    72  goto 90
	    75  astore 5
	    77  new java.lang.IllegalArgumentException [177]
	    80  dup
	    81  aload 5
	    83  invokevirtual javax.swing.text.BadLocationException.getMessage() : java.lang.String [343]
	    86  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    89  athrow
	    90  return
	      Exception Table:
	        [pc: 26, pc: 72] -> 75 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 5
	        [pc: 15, same]
	        [pc: 51, append: {javax.swing.text.Document}]
	        [pc: 72, same]
	        [pc: 75, same_locals_1_stack_item, stack: {javax.swing.text.BadLocationException}]
	        [pc: 90, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 1
	  public int getRows();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.rows : int [300]
	    4  ireturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 3, Locals: 3
	  public void setRows(int arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.rows : int [300]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 19
	     9  new java.lang.IllegalArgumentException [177]
	    12  dup
	    13  ldc <String "rows less than zero."> [19]
	    15  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    18  athrow
	    19  iload_1 [arg0]
	    20  iload_2
	    21  if_icmpeq 33
	    24  aload_0 [this]
	    25  iload_1 [arg0]
	    26  putfield javax.swing.JTextArea.rows : int [300]
	    29  aload_0 [this]
	    30  invokevirtual javax.swing.JTextArea.invalidate() : void [326]
	    33  return
	    Stack map table: number of frames 2
	        [pc: 19, append: {int}]
	        [pc: 33, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 2, Locals: 2
	  protected int getRowHeight();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.rowHeight : int [299]
	     4  ifne 24
	     7  aload_0 [this]
	     8  aload_0 [this]
	     9  invokevirtual javax.swing.JTextArea.getFont() : java.awt.Font [328]
	    12  invokevirtual javax.swing.JTextArea.getFontMetrics(java.awt.Font) : java.awt.FontMetrics [337]
	    15  astore_1
	    16  aload_0 [this]
	    17  aload_1
	    18  invokevirtual java.awt.FontMetrics.getHeight() : int [306]
	    21  putfield javax.swing.JTextArea.rowHeight : int [299]
	    24  aload_0 [this]
	    25  getfield javax.swing.JTextArea.rowHeight : int [299]
	    28  ireturn
	    Stack map table: number of frames 1
	        [pc: 24, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 1
	  public int getColumns();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.columns : int [298]
	    4  ireturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 3, Locals: 3
	  public void setColumns(int arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.columns : int [298]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 19
	     9  new java.lang.IllegalArgumentException [177]
	    12  dup
	    13  ldc <String "columns less than zero."> [12]
	    15  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    18  athrow
	    19  iload_1 [arg0]
	    20  iload_2
	    21  if_icmpeq 33
	    24  aload_0 [this]
	    25  iload_1 [arg0]
	    26  putfield javax.swing.JTextArea.columns : int [298]
	    29  aload_0 [this]
	    30  invokevirtual javax.swing.JTextArea.invalidate() : void [326]
	    33  return
	    Stack map table: number of frames 2
	        [pc: 19, append: {int}]
	        [pc: 33, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 3, Locals: 2
	  protected int getColumnWidth();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.columnWidth : int [297]
	     4  ifne 26
	     7  aload_0 [this]
	     8  aload_0 [this]
	     9  invokevirtual javax.swing.JTextArea.getFont() : java.awt.Font [328]
	    12  invokevirtual javax.swing.JTextArea.getFontMetrics(java.awt.Font) : java.awt.FontMetrics [337]
	    15  astore_1
	    16  aload_0 [this]
	    17  aload_1
	    18  bipush 109
	    20  invokevirtual java.awt.FontMetrics.charWidth(char) : int [307]
	    23  putfield javax.swing.JTextArea.columnWidth : int [297]
	    26  aload_0 [this]
	    27  getfield javax.swing.JTextArea.columnWidth : int [297]
	    30  ireturn
	    Stack map table: number of frames 1
	        [pc: 26, same]
	  
	  // Method descriptor #195 ()Ljava/awt/Dimension;
	  // Stack: 4, Locals: 3
	  public java.awt.Dimension getPreferredSize();
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent.getPreferredSize() : java.awt.Dimension [348]
	      4  astore_1
	      5  aload_1
	      6  ifnonnull 25
	      9  new java.awt.Dimension [172]
	     12  dup
	     13  sipush 400
	     16  sipush 400
	     19  invokespecial java.awt.Dimension(int, int) [305]
	     22  goto 26
	     25  aload_1
	     26  astore_1
	     27  aload_0 [this]
	     28  invokevirtual javax.swing.JTextArea.getInsets() : java.awt.Insets [329]
	     31  astore_2
	     32  aload_0 [this]
	     33  getfield javax.swing.JTextArea.columns : int [298]
	     36  ifeq 69
	     39  aload_1
	     40  aload_1
	     41  getfield java.awt.Dimension.width : int [292]
	     44  aload_0 [this]
	     45  getfield javax.swing.JTextArea.columns : int [298]
	     48  aload_0 [this]
	     49  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	     52  imul
	     53  aload_2
	     54  getfield java.awt.Insets.left : int [294]
	     57  iadd
	     58  aload_2
	     59  getfield java.awt.Insets.right : int [295]
	     62  iadd
	     63  invokestatic java.lang.Math.max(int, int) : int [312]
	     66  putfield java.awt.Dimension.width : int [292]
	     69  aload_0 [this]
	     70  getfield javax.swing.JTextArea.rows : int [300]
	     73  ifeq 106
	     76  aload_1
	     77  aload_1
	     78  getfield java.awt.Dimension.height : int [291]
	     81  aload_0 [this]
	     82  getfield javax.swing.JTextArea.rows : int [300]
	     85  aload_0 [this]
	     86  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	     89  imul
	     90  aload_2
	     91  getfield java.awt.Insets.top : int [296]
	     94  iadd
	     95  aload_2
	     96  getfield java.awt.Insets.bottom : int [293]
	     99  iadd
	    100  invokestatic java.lang.Math.max(int, int) : int [312]
	    103  putfield java.awt.Dimension.height : int [291]
	    106  aload_1
	    107  areturn
	    Stack map table: number of frames 4
	        [pc: 25, append: {java.awt.Dimension}]
	        [pc: 26, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 69, append: {java.awt.Insets}]
	        [pc: 106, same]
	  
	  // Method descriptor #197 (Ljava/awt/Font;)V
	  // Stack: 2, Locals: 2
	  public void setFont(java.awt.Font arg0);
	     0  aload_0 [this]
	     1  aload_1 [arg0]
	     2  invokespecial javax.swing.text.JTextComponent.setFont(java.awt.Font) : void [349]
	     5  aload_0 [this]
	     6  iconst_0
	     7  putfield javax.swing.JTextArea.rowHeight : int [299]
	    10  aload_0 [this]
	    11  iconst_0
	    12  putfield javax.swing.JTextArea.columnWidth : int [297]
	    15  return

	  
	  // Method descriptor #25 ()Ljava/lang/String;
	  // Stack: 2, Locals: 3
	  protected java.lang.String paramString();
	      0  aload_0 [this]
	      1  getfield javax.swing.JTextArea.wrap : boolean [302]
	      4  ifeq 12
	      7  ldc <String "true"> [22]
	      9  goto 14
	     12  ldc <String "false"> [15]
	     14  astore_1
	     15  aload_0 [this]
	     16  getfield javax.swing.JTextArea.word : boolean [301]
	     19  ifeq 27
	     22  ldc <String "true"> [22]
	     24  goto 29
	     27  ldc <String "false"> [15]
	     29  astore_2
	     30  new java.lang.StringBuilder [181]
	     33  dup
	     34  invokespecial java.lang.StringBuilder() [314]
	     37  aload_0 [this]
	     38  invokespecial javax.swing.text.JTextComponent.paramString() : java.lang.String [350]
	     41  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     44  ldc <String ",colums="> [2]
	     46  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     49  aload_0 [this]
	     50  getfield javax.swing.JTextArea.columns : int [298]
	     53  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     56  ldc <String ",columWidth="> [1]
	     58  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     61  aload_0 [this]
	     62  getfield javax.swing.JTextArea.columnWidth : int [297]
	     65  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     68  ldc <String ",rows="> [4]
	     70  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     73  aload_0 [this]
	     74  getfield javax.swing.JTextArea.rows : int [300]
	     77  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     80  ldc <String ",rowHeight="> [3]
	     82  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     85  aload_0 [this]
	     86  getfield javax.swing.JTextArea.rowHeight : int [299]
	     89  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     92  ldc <String ",word="> [5]
	     94  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     97  aload_2
	     98  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    101  ldc <String ",wrap="> [6]
	    103  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    106  aload_1
	    107  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    110  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    113  areturn
	    Stack map table: number of frames 4
	        [pc: 12, same]
	        [pc: 14, same_locals_1_stack_item, stack: {java.lang.String}]
	        [pc: 27, append: {java.lang.String}]
	        [pc: 29, same_locals_1_stack_item, stack: {java.lang.String}]
	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getScrollableTracksViewportWidth();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.wrap : boolean [302]
	     4  ifeq 11
	     7  iconst_1
	     8  goto 15
	    11  aload_0 [this]
	    12  invokespecial javax.swing.text.JTextComponent.getScrollableTracksViewportWidth() : boolean [346]
	    15  ireturn
	    Stack map table: number of frames 2
	        [pc: 11, same]
	        [pc: 15, same_locals_1_stack_item, stack: {int}]
	  
	  // Method descriptor #195 ()Ljava/awt/Dimension;
	  // Stack: 4, Locals: 3
	  public java.awt.Dimension getPreferredScrollableViewportSize();
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent.getPreferredScrollableViewportSize() : java.awt.Dimension [347]
	      4  astore_1
	      5  aload_1
	      6  ifnonnull 25
	      9  new java.awt.Dimension [172]
	     12  dup
	     13  sipush 400
	     16  sipush 400
	     19  invokespecial java.awt.Dimension(int, int) [305]
	     22  goto 26
	     25  aload_1
	     26  astore_1
	     27  aload_0 [this]
	     28  invokevirtual javax.swing.JTextArea.getInsets() : java.awt.Insets [329]
	     31  astore_2
	     32  aload_1
	     33  aload_0 [this]
	     34  getfield javax.swing.JTextArea.columns : int [298]
	     37  ifne 47
	     40  aload_1
	     41  getfield java.awt.Dimension.width : int [292]
	     44  goto 66
	     47  aload_0 [this]
	     48  getfield javax.swing.JTextArea.columns : int [298]
	     51  aload_0 [this]
	     52  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	     55  imul
	     56  aload_2
	     57  getfield java.awt.Insets.left : int [294]
	     60  iadd
	     61  aload_2
	     62  getfield java.awt.Insets.right : int [295]
	     65  iadd
	     66  putfield java.awt.Dimension.width : int [292]
	     69  aload_1
	     70  aload_0 [this]
	     71  getfield javax.swing.JTextArea.rows : int [300]
	     74  ifne 84
	     77  aload_1
	     78  getfield java.awt.Dimension.height : int [291]
	     81  goto 103
	     84  aload_0 [this]
	     85  getfield javax.swing.JTextArea.rows : int [300]
	     88  aload_0 [this]
	     89  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	     92  imul
	     93  aload_2
	     94  getfield java.awt.Insets.top : int [296]
	     97  iadd
	     98  aload_2
	     99  getfield java.awt.Insets.bottom : int [293]
	    102  iadd
	    103  putfield java.awt.Dimension.height : int [291]
	    106  aload_1
	    107  areturn
	    Stack map table: number of frames 6
	        [pc: 25, append: {java.awt.Dimension}]
	        [pc: 26, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 47, full, stack: {java.awt.Dimension}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	        [pc: 66, full, stack: {java.awt.Dimension, int}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	        [pc: 84, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 103, full, stack: {java.awt.Dimension, int}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	  
	  // Method descriptor #199 (Ljava/awt/Rectangle;II)I
	  // Stack: 4, Locals: 4
	  public int getScrollableUnitIncrement(java.awt.Rectangle arg0, int arg1, int arg2);
	     0  iload_2 [arg1]
	     1  lookupswitch default: 38
	          case 0: 33
	          case 1: 28
	    28  aload_0 [this]
	    29  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	    32  ireturn
	    33  aload_0 [this]
	    34  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	    37  ireturn
	    38  new java.lang.IllegalArgumentException [177]
	    41  dup
	    42  new java.lang.StringBuilder [181]
	    45  dup
	    46  invokespecial java.lang.StringBuilder() [314]
	    49  ldc <String "Invalid orientation: "> [8]
	    51  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    54  iload_2 [arg1]
	    55  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	    58  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    61  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    64  athrow
	    Stack map table: number of frames 3
	        [pc: 28, same]
	        [pc: 33, same]
	        [pc: 38, same]
	  
	  // Method descriptor #33 (Ljava/io/ObjectOutputStream;)V
	  // Stack: 3, Locals: 3
	  private void writeObject(java.io.ObjectOutputStream arg0) throws java.io.IOException;
	     0  aload_1 [arg0]
	     1  invokevirtual java.io.ObjectOutputStream.defaultWriteObject() : void [308]
	     4  aload_0 [this]
	     5  invokevirtual javax.swing.JTextArea.getUIClassID() : java.lang.String [330]
	     8  ldc <String "TextAreaUI"> [11]
	    10  invokevirtual java.lang.String.equals(java.lang.Object) : boolean [313]
	    13  ifeq 50
	    16  aload_0 [this]
	    17  invokestatic javax.swing.JComponent.getWriteObjCounter(javax.swing.JComponent) : byte [320]
	    20  istore_2
	    21  aload_0 [this]
	    22  iload_2
	    23  iconst_1
	    24  isub
	    25  i2b
	    26  istore_2
	    27  iload_2
	    28  invokestatic javax.swing.JComponent.setWriteObjCounter(javax.swing.JComponent, byte) : void [321]
	    31  iload_2
	    32  ifne 50
	    35  aload_0 [this]
	    36  getfield javax.swing.JTextArea.ui : javax.swing.plaf.ComponentUI [304]
	    39  ifnull 50
	    42  aload_0 [this]
	    43  getfield javax.swing.JTextArea.ui : javax.swing.plaf.ComponentUI [304]
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.plaf.ComponentUI.installUI(javax.swing.JComponent) : void [341]
	    50  return
	    Stack map table: number of frames 1
	        [pc: 50, same]
	  
	  // Method descriptor #206 ()Ljavax/accessibility/AccessibleContext;
	  // Stack: 4, Locals: 1
	  public javax.accessibility.AccessibleContext getAccessibleContext();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	     4  ifnonnull 19
	     7  aload_0 [this]
	     8  new javax.swing.JTextArea$AccessibleJTextArea [184]
	    11  dup
	    12  aload_0 [this]
	    13  invokespecial javax.swing.JTextArea$AccessibleJTextArea(javax.swing.JTextArea) [339]
	    16  putfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	    19  aload_0 [this]
	    20  getfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	    23  areturn
	    Stack map table: number of frames 1
	        [pc: 19, same]

	  Inner classes:
	    [inner class info: #184 javax/swing/JTextArea$AccessibleJTextArea, outer class info: #183 javax/swing/JTextArea
	     inner name: #363 AccessibleJTextArea, accessflags: 4 protected]
	}//  (version 1.8 : 52.0, super bit)
public class javax.swing.JTextArea extends javax.swing.text.JTextComponent {
	  
	  // Field descriptor #53 Ljava/lang/String;
	  private static final java.lang.String uiClassID = "TextAreaUI";
	  
	  // Field descriptor #50 I
	  private int rows;
	  
	  // Field descriptor #50 I
	  private int columns;
	  
	  // Field descriptor #50 I
	  private int columnWidth;
	  
	  // Field descriptor #50 I
	  private int rowHeight;
	  
	  // Field descriptor #58 Z
	  private boolean wrap;
	  
	  // Field descriptor #58 Z
	  private boolean word;
	  
	  // Method descriptor #26 ()V
	  // Stack: 5, Locals: 1
	  public JTextArea();
	    0  aload_0 [this]
	    1  aconst_null
	    2  aconst_null
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #37 (Ljava/lang/String;)V
	  // Stack: 5, Locals: 2
	  public JTextArea(java.lang.String arg0);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aload_1 [arg0]
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #32 (II)V
	  // Stack: 5, Locals: 3
	  public JTextArea(int arg0, int arg1);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aconst_null
	    3  iload_1 [arg0]
	    4  iload_2 [arg1]
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #202 (Ljava/lang/String;II)V
	  // Stack: 5, Locals: 4
	  public JTextArea(java.lang.String arg0, int arg1, int arg2);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aload_1 [arg0]
	    3  iload_2 [arg1]
	    4  iload_3 [arg2]
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #212 (Ljavax/swing/text/Document;)V
	  // Stack: 5, Locals: 2
	  public JTextArea(javax.swing.text.Document arg0);
	    0  aload_0 [this]
	    1  aload_1 [arg0]
	    2  aconst_null
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #216 (Ljavax/swing/text/Document;Ljava/lang/String;II)V
	  // Stack: 4, Locals: 5
	  public JTextArea(javax.swing.text.Document arg0, java.lang.String arg1, int arg2, int arg3);
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent() [345]
	      4  aload_0 [this]
	      5  iload_3 [arg2]
	      6  putfield javax.swing.JTextArea.rows : int [300]
	      9  aload_0 [this]
	     10  iload 4 [arg3]
	     12  putfield javax.swing.JTextArea.columns : int [298]
	     15  aload_1 [arg0]
	     16  ifnonnull 24
	     19  aload_0 [this]
	     20  invokevirtual javax.swing.JTextArea.createDefaultModel() : javax.swing.text.Document [334]
	     23  astore_1 [arg0]
	     24  aload_0 [this]
	     25  aload_1 [arg0]
	     26  invokevirtual javax.swing.JTextArea.setDocument(javax.swing.text.Document) : void [336]
	     29  aload_2 [arg1]
	     30  ifnull 44
	     33  aload_0 [this]
	     34  aload_2 [arg1]
	     35  invokevirtual javax.swing.JTextArea.setText(java.lang.String) : void [331]
	     38  aload_0 [this]
	     39  iconst_0
	     40  iconst_0
	     41  invokevirtual javax.swing.JTextArea.select(int, int) : void [327]
	     44  iload_3 [arg2]
	     45  ifge 75
	     48  new java.lang.IllegalArgumentException [177]
	     51  dup
	     52  new java.lang.StringBuilder [181]
	     55  dup
	     56  invokespecial java.lang.StringBuilder() [314]
	     59  ldc <String "rows: "> [20]
	     61  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     64  iload_3 [arg2]
	     65  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     68  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	     71  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	     74  athrow
	     75  iload 4 [arg3]
	     77  ifge 108
	     80  new java.lang.IllegalArgumentException [177]
	     83  dup
	     84  new java.lang.StringBuilder [181]
	     87  dup
	     88  invokespecial java.lang.StringBuilder() [314]
	     91  ldc <String "columns: "> [13]
	     93  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     96  iload 4 [arg3]
	     98  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	    101  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    104  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    107  athrow
	    108  aload_0 [this]
	    109  ldc <String "focusTraversalKeysForward"> [17]
	    111  invokestatic javax.swing.JComponent.getManagingFocusForwardTraversalKeys() : java.util.Set [319]
	    114  invokestatic javax.swing.LookAndFeel.installProperty(javax.swing.JComponent, java.lang.String, java.lang.Object) : void [340]
	    117  aload_0 [this]
	    118  ldc <String "focusTraversalKeysBackward"> [16]
	    120  invokestatic javax.swing.JComponent.getManagingFocusBackwardTraversalKeys() : java.util.Set [318]
	    123  invokestatic javax.swing.LookAndFeel.installProperty(javax.swing.JComponent, java.lang.String, java.lang.Object) : void [340]
	    126  return
	    Stack map table: number of frames 4
	        [pc: 24, full, stack: {}, locals: {javax.swing.JTextArea, javax.swing.text.Document, java.lang.String, int, int}]
	        [pc: 44, same]
	        [pc: 75, same]
	        [pc: 108, same]
	  
	  // Method descriptor #25 ()Ljava/lang/String;
	  // Stack: 1, Locals: 1
	  public java.lang.String getUIClassID();
	    0  ldc <String "TextAreaUI"> [11]
	    2  areturn

	  
	  // Method descriptor #211 ()Ljavax/swing/text/Document;
	  // Stack: 2, Locals: 1
	  protected javax.swing.text.Document createDefaultModel();
	    0  new javax.swing.text.PlainDocument [192]
	    3  dup
	    4  invokespecial javax.swing.text.PlainDocument() [351]
	    7  areturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 4, Locals: 4
	  public void setTabSize(int arg0);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  aload_2
	     6  ifnull 34
	     9  aload_0 [this]
	    10  invokevirtual javax.swing.JTextArea.getTabSize() : int [325]
	    13  istore_3
	    14  aload_2
	    15  ldc <String "tabSize"> [21]
	    17  iload_1 [arg0]
	    18  invokestatic java.lang.Integer.valueOf(int) : java.lang.Integer [311]
	    21  invokeinterface javax.swing.text.Document.putProperty(java.lang.Object, java.lang.Object) : void [356] [nargs: 3]
	    26  aload_0 [this]
	    27  ldc <String "tabSize"> [21]
	    29  iload_3
	    30  iload_1 [arg0]
	    31  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, int, int) : void [332]
	    34  return
	    Stack map table: number of frames 1
	        [pc: 34, append: {javax.swing.text.Document}]
	  
	  // Method descriptor #24 ()I
	  // Stack: 2, Locals: 4
	  public int getTabSize();
	     0  bipush 8
	     2  istore_1
	     3  aload_0 [this]
	     4  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     7  astore_2
	     8  aload_2
	     9  ifnull 33
	    12  aload_2
	    13  ldc <String "tabSize"> [21]
	    15  invokeinterface javax.swing.text.Document.getProperty(java.lang.Object) : java.lang.Object [355] [nargs: 2]
	    20  checkcast java.lang.Integer [178]
	    23  astore_3
	    24  aload_3
	    25  ifnull 33
	    28  aload_3
	    29  invokevirtual java.lang.Integer.intValue() : int [310]
	    32  istore_1
	    33  iload_1
	    34  ireturn
	    Stack map table: number of frames 1
	        [pc: 33, append: {int, javax.swing.text.Document}]
	  
	  // Method descriptor #38 (Z)V
	  // Stack: 4, Locals: 3
	  public void setLineWrap(boolean arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.wrap : boolean [302]
	     4  istore_2
	     5  aload_0 [this]
	     6  iload_1 [arg0]
	     7  putfield javax.swing.JTextArea.wrap : boolean [302]
	    10  aload_0 [this]
	    11  ldc <String "lineWrap"> [18]
	    13  iload_2
	    14  iload_1 [arg0]
	    15  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, boolean, boolean) : void [333]
	    18  return

	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getLineWrap();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.wrap : boolean [302]
	    4  ireturn

	  
	  // Method descriptor #38 (Z)V
	  // Stack: 4, Locals: 3
	  public void setWrapStyleWord(boolean arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.word : boolean [301]
	     4  istore_2
	     5  aload_0 [this]
	     6  iload_1 [arg0]
	     7  putfield javax.swing.JTextArea.word : boolean [301]
	    10  aload_0 [this]
	    11  ldc <String "wrapStyleWord"> [23]
	    13  iload_2
	    14  iload_1 [arg0]
	    15  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, boolean, boolean) : void [333]
	    18  return

	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getWrapStyleWord();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.word : boolean [301]
	    4  ireturn

	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 4
	  public int getLineOfOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Can't translate offset to line"> [7]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  aload_2
	    22  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    27  if_icmple 48
	    30  new javax.swing.text.BadLocationException [188]
	    33  dup
	    34  ldc <String "Can't translate offset to line"> [7]
	    36  aload_2
	    37  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    42  iconst_1
	    43  iadd
	    44  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    47  athrow
	    48  aload_0 [this]
	    49  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    52  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    57  astore_3
	    58  aload_3
	    59  iload_1 [arg0]
	    60  invokeinterface javax.swing.text.Element.getElementIndex(int) : int [361] [nargs: 2]
	    65  ireturn
	    Stack map table: number of frames 2
	        [pc: 20, append: {javax.swing.text.Document}]
	        [pc: 48, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 2
	  public int getLineCount();
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	     9  astore_1
	    10  aload_1
	    11  invokeinterface javax.swing.text.Element.getElementCount() : int [358] [nargs: 1]
	    16  ireturn

	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 5
	  public int getLineStartOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getLineCount() : int [323]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Negative line"> [9]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  iload_2
	    22  if_icmplt 46
	    25  new javax.swing.text.BadLocationException [188]
	    28  dup
	    29  ldc <String "No such line"> [10]
	    31  aload_0 [this]
	    32  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    35  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    40  iconst_1
	    41  iadd
	    42  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    45  athrow
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    50  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    55  astore_3
	    56  aload_3
	    57  iload_1 [arg0]
	    58  invokeinterface javax.swing.text.Element.getElement(int) : javax.swing.text.Element [362] [nargs: 2]
	    63  astore 4
	    65  aload 4
	    67  invokeinterface javax.swing.text.Element.getStartOffset() : int [360] [nargs: 1]
	    72  ireturn
	    Stack map table: number of frames 2
	        [pc: 20, append: {int}]
	        [pc: 46, same]
	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 6
	  public int getLineEndOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getLineCount() : int [323]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Negative line"> [9]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  iload_2
	    22  if_icmplt 46
	    25  new javax.swing.text.BadLocationException [188]
	    28  dup
	    29  ldc <String "No such line"> [10]
	    31  aload_0 [this]
	    32  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    35  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    40  iconst_1
	    41  iadd
	    42  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    45  athrow
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    50  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    55  astore_3
	    56  aload_3
	    57  iload_1 [arg0]
	    58  invokeinterface javax.swing.text.Element.getElement(int) : javax.swing.text.Element [362] [nargs: 2]
	    63  astore 4
	    65  aload 4
	    67  invokeinterface javax.swing.text.Element.getEndOffset() : int [359] [nargs: 1]
	    72  istore 5
	    74  iload_1 [arg0]
	    75  iload_2
	    76  iconst_1
	    77  isub
	    78  if_icmpne 88
	    81  iload 5
	    83  iconst_1
	    84  isub
	    85  goto 90
	    88  iload 5
	    90  ireturn
	    Stack map table: number of frames 4
	        [pc: 20, append: {int}]
	        [pc: 46, same]
	        [pc: 88, append: {javax.swing.text.Element, javax.swing.text.Element, int}]
	        [pc: 90, same_locals_1_stack_item, stack: {int}]
	  
	  // Method descriptor #201 (Ljava/lang/String;I)V
	  // Stack: 4, Locals: 5
	  public void insert(java.lang.String arg0, int arg1);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_3
	     5  aload_3
	     6  ifnull 36
	     9  aload_3
	    10  iload_2 [arg1]
	    11  aload_1 [arg0]
	    12  aconst_null
	    13  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    18  goto 36
	    21  astore 4
	    23  new java.lang.IllegalArgumentException [177]
	    26  dup
	    27  aload 4
	    29  invokevirtual javax.swing.text.BadLocationException.getMessage() : java.lang.String [343]
	    32  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    35  athrow
	    36  return
	      Exception Table:
	        [pc: 9, pc: 18] -> 21 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 2
	        [pc: 21, full, stack: {javax.swing.text.BadLocationException}, locals: {javax.swing.JTextArea, java.lang.String, int, javax.swing.text.Document}]
	        [pc: 36, same]
	  
	  // Method descriptor #37 (Ljava/lang/String;)V
	  // Stack: 4, Locals: 4
	  public void append(java.lang.String arg0);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  aload_2
	     6  ifnull 27
	     9  aload_2
	    10  aload_2
	    11  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    16  aload_1 [arg0]
	    17  aconst_null
	    18  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    23  goto 27
	    26  astore_3
	    27  return
	      Exception Table:
	        [pc: 9, pc: 23] -> 26 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 2
	        [pc: 26, full, stack: {javax.swing.text.BadLocationException}, locals: {javax.swing.JTextArea, java.lang.String, javax.swing.text.Document}]
	        [pc: 27, same]
	  
	  // Method descriptor #202 (Ljava/lang/String;II)V
	  // Stack: 5, Locals: 6
	  public void replaceRange(java.lang.String arg0, int arg1, int arg2);
	     0  iload_3 [arg2]
	     1  iload_2 [arg1]
	     2  if_icmpge 15
	     5  new java.lang.IllegalArgumentException [177]
	     8  dup
	     9  ldc <String "end before start"> [14]
	    11  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    14  athrow
	    15  aload_0 [this]
	    16  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    19  astore 4
	    21  aload 4
	    23  ifnull 90
	    26  aload 4
	    28  instanceof javax.swing.text.AbstractDocument [187]
	    31  ifeq 51
	    34  aload 4
	    36  checkcast javax.swing.text.AbstractDocument [187]
	    39  iload_2 [arg1]
	    40  iload_3 [arg2]
	    41  iload_2 [arg1]
	    42  isub
	    43  aload_1 [arg0]
	    44  aconst_null
	    45  invokevirtual javax.swing.text.AbstractDocument.replace(int, int, java.lang.String, javax.swing.text.AttributeSet) : void [342]
	    48  goto 72
	    51  aload 4
	    53  iload_2 [arg1]
	    54  iload_3 [arg2]
	    55  iload_2 [arg1]
	    56  isub
	    57  invokeinterface javax.swing.text.Document.remove(int, int) : void [353] [nargs: 3]
	    62  aload 4
	    64  iload_2 [arg1]
	    65  aload_1 [arg0]
	    66  aconst_null
	    67  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    72  goto 90
	    75  astore 5
	    77  new java.lang.IllegalArgumentException [177]
	    80  dup
	    81  aload 5
	    83  invokevirtual javax.swing.text.BadLocationException.getMessage() : java.lang.String [343]
	    86  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    89  athrow
	    90  return
	      Exception Table:
	        [pc: 26, pc: 72] -> 75 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 5
	        [pc: 15, same]
	        [pc: 51, append: {javax.swing.text.Document}]
	        [pc: 72, same]
	        [pc: 75, same_locals_1_stack_item, stack: {javax.swing.text.BadLocationException}]
	        [pc: 90, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 1
	  public int getRows();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.rows : int [300]
	    4  ireturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 3, Locals: 3
	  public void setRows(int arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.rows : int [300]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 19
	     9  new java.lang.IllegalArgumentException [177]
	    12  dup
	    13  ldc <String "rows less than zero."> [19]
	    15  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    18  athrow
	    19  iload_1 [arg0]
	    20  iload_2
	    21  if_icmpeq 33
	    24  aload_0 [this]
	    25  iload_1 [arg0]
	    26  putfield javax.swing.JTextArea.rows : int [300]
	    29  aload_0 [this]
	    30  invokevirtual javax.swing.JTextArea.invalidate() : void [326]
	    33  return
	    Stack map table: number of frames 2
	        [pc: 19, append: {int}]
	        [pc: 33, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 2, Locals: 2
	  protected int getRowHeight();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.rowHeight : int [299]
	     4  ifne 24
	     7  aload_0 [this]
	     8  aload_0 [this]
	     9  invokevirtual javax.swing.JTextArea.getFont() : java.awt.Font [328]
	    12  invokevirtual javax.swing.JTextArea.getFontMetrics(java.awt.Font) : java.awt.FontMetrics [337]
	    15  astore_1
	    16  aload_0 [this]
	    17  aload_1
	    18  invokevirtual java.awt.FontMetrics.getHeight() : int [306]
	    21  putfield javax.swing.JTextArea.rowHeight : int [299]
	    24  aload_0 [this]
	    25  getfield javax.swing.JTextArea.rowHeight : int [299]
	    28  ireturn
	    Stack map table: number of frames 1
	        [pc: 24, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 1
	  public int getColumns();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.columns : int [298]
	    4  ireturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 3, Locals: 3
	  public void setColumns(int arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.columns : int [298]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 19
	     9  new java.lang.IllegalArgumentException [177]
	    12  dup
	    13  ldc <String "columns less than zero."> [12]
	    15  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    18  athrow
	    19  iload_1 [arg0]
	    20  iload_2
	    21  if_icmpeq 33
	    24  aload_0 [this]
	    25  iload_1 [arg0]
	    26  putfield javax.swing.JTextArea.columns : int [298]
	    29  aload_0 [this]
	    30  invokevirtual javax.swing.JTextArea.invalidate() : void [326]
	    33  return
	    Stack map table: number of frames 2
	        [pc: 19, append: {int}]
	        [pc: 33, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 3, Locals: 2
	  protected int getColumnWidth();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.columnWidth : int [297]
	     4  ifne 26
	     7  aload_0 [this]
	     8  aload_0 [this]
	     9  invokevirtual javax.swing.JTextArea.getFont() : java.awt.Font [328]
	    12  invokevirtual javax.swing.JTextArea.getFontMetrics(java.awt.Font) : java.awt.FontMetrics [337]
	    15  astore_1
	    16  aload_0 [this]
	    17  aload_1
	    18  bipush 109
	    20  invokevirtual java.awt.FontMetrics.charWidth(char) : int [307]
	    23  putfield javax.swing.JTextArea.columnWidth : int [297]
	    26  aload_0 [this]
	    27  getfield javax.swing.JTextArea.columnWidth : int [297]
	    30  ireturn
	    Stack map table: number of frames 1
	        [pc: 26, same]
	  
	  // Method descriptor #195 ()Ljava/awt/Dimension;
	  // Stack: 4, Locals: 3
	  public java.awt.Dimension getPreferredSize();
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent.getPreferredSize() : java.awt.Dimension [348]
	      4  astore_1
	      5  aload_1
	      6  ifnonnull 25
	      9  new java.awt.Dimension [172]
	     12  dup
	     13  sipush 400
	     16  sipush 400
	     19  invokespecial java.awt.Dimension(int, int) [305]
	     22  goto 26
	     25  aload_1
	     26  astore_1
	     27  aload_0 [this]
	     28  invokevirtual javax.swing.JTextArea.getInsets() : java.awt.Insets [329]
	     31  astore_2
	     32  aload_0 [this]
	     33  getfield javax.swing.JTextArea.columns : int [298]
	     36  ifeq 69
	     39  aload_1
	     40  aload_1
	     41  getfield java.awt.Dimension.width : int [292]
	     44  aload_0 [this]
	     45  getfield javax.swing.JTextArea.columns : int [298]
	     48  aload_0 [this]
	     49  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	     52  imul
	     53  aload_2
	     54  getfield java.awt.Insets.left : int [294]
	     57  iadd
	     58  aload_2
	     59  getfield java.awt.Insets.right : int [295]
	     62  iadd
	     63  invokestatic java.lang.Math.max(int, int) : int [312]
	     66  putfield java.awt.Dimension.width : int [292]
	     69  aload_0 [this]
	     70  getfield javax.swing.JTextArea.rows : int [300]
	     73  ifeq 106
	     76  aload_1
	     77  aload_1
	     78  getfield java.awt.Dimension.height : int [291]
	     81  aload_0 [this]
	     82  getfield javax.swing.JTextArea.rows : int [300]
	     85  aload_0 [this]
	     86  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	     89  imul
	     90  aload_2
	     91  getfield java.awt.Insets.top : int [296]
	     94  iadd
	     95  aload_2
	     96  getfield java.awt.Insets.bottom : int [293]
	     99  iadd
	    100  invokestatic java.lang.Math.max(int, int) : int [312]
	    103  putfield java.awt.Dimension.height : int [291]
	    106  aload_1
	    107  areturn
	    Stack map table: number of frames 4
	        [pc: 25, append: {java.awt.Dimension}]
	        [pc: 26, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 69, append: {java.awt.Insets}]
	        [pc: 106, same]
	  
	  // Method descriptor #197 (Ljava/awt/Font;)V
	  // Stack: 2, Locals: 2
	  public void setFont(java.awt.Font arg0);
	     0  aload_0 [this]
	     1  aload_1 [arg0]
	     2  invokespecial javax.swing.text.JTextComponent.setFont(java.awt.Font) : void [349]
	     5  aload_0 [this]
	     6  iconst_0
	     7  putfield javax.swing.JTextArea.rowHeight : int [299]
	    10  aload_0 [this]
	    11  iconst_0
	    12  putfield javax.swing.JTextArea.columnWidth : int [297]
	    15  return

	  
	  // Method descriptor #25 ()Ljava/lang/String;
	  // Stack: 2, Locals: 3
	  protected java.lang.String paramString();
	      0  aload_0 [this]
	      1  getfield javax.swing.JTextArea.wrap : boolean [302]
	      4  ifeq 12
	      7  ldc <String "true"> [22]
	      9  goto 14
	     12  ldc <String "false"> [15]
	     14  astore_1
	     15  aload_0 [this]
	     16  getfield javax.swing.JTextArea.word : boolean [301]
	     19  ifeq 27
	     22  ldc <String "true"> [22]
	     24  goto 29
	     27  ldc <String "false"> [15]
	     29  astore_2
	     30  new java.lang.StringBuilder [181]
	     33  dup
	     34  invokespecial java.lang.StringBuilder() [314]
	     37  aload_0 [this]
	     38  invokespecial javax.swing.text.JTextComponent.paramString() : java.lang.String [350]
	     41  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     44  ldc <String ",colums="> [2]
	     46  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     49  aload_0 [this]
	     50  getfield javax.swing.JTextArea.columns : int [298]
	     53  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     56  ldc <String ",columWidth="> [1]
	     58  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     61  aload_0 [this]
	     62  getfield javax.swing.JTextArea.columnWidth : int [297]
	     65  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     68  ldc <String ",rows="> [4]
	     70  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     73  aload_0 [this]
	     74  getfield javax.swing.JTextArea.rows : int [300]
	     77  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     80  ldc <String ",rowHeight="> [3]
	     82  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     85  aload_0 [this]
	     86  getfield javax.swing.JTextArea.rowHeight : int [299]
	     89  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     92  ldc <String ",word="> [5]
	     94  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     97  aload_2
	     98  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    101  ldc <String ",wrap="> [6]
	    103  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    106  aload_1
	    107  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    110  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    113  areturn
	    Stack map table: number of frames 4
	        [pc: 12, same]
	        [pc: 14, same_locals_1_stack_item, stack: {java.lang.String}]
	        [pc: 27, append: {java.lang.String}]
	        [pc: 29, same_locals_1_stack_item, stack: {java.lang.String}]
	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getScrollableTracksViewportWidth();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.wrap : boolean [302]
	     4  ifeq 11
	     7  iconst_1
	     8  goto 15
	    11  aload_0 [this]
	    12  invokespecial javax.swing.text.JTextComponent.getScrollableTracksViewportWidth() : boolean [346]
	    15  ireturn
	    Stack map table: number of frames 2
	        [pc: 11, same]
	        [pc: 15, same_locals_1_stack_item, stack: {int}]
	  
	  // Method descriptor #195 ()Ljava/awt/Dimension;
	  // Stack: 4, Locals: 3
	  public java.awt.Dimension getPreferredScrollableViewportSize();
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent.getPreferredScrollableViewportSize() : java.awt.Dimension [347]
	      4  astore_1
	      5  aload_1
	      6  ifnonnull 25
	      9  new java.awt.Dimension [172]
	     12  dup
	     13  sipush 400
	     16  sipush 400
	     19  invokespecial java.awt.Dimension(int, int) [305]
	     22  goto 26
	     25  aload_1
	     26  astore_1
	     27  aload_0 [this]
	     28  invokevirtual javax.swing.JTextArea.getInsets() : java.awt.Insets [329]
	     31  astore_2
	     32  aload_1
	     33  aload_0 [this]
	     34  getfield javax.swing.JTextArea.columns : int [298]
	     37  ifne 47
	     40  aload_1
	     41  getfield java.awt.Dimension.width : int [292]
	     44  goto 66
	     47  aload_0 [this]
	     48  getfield javax.swing.JTextArea.columns : int [298]
	     51  aload_0 [this]
	     52  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	     55  imul
	     56  aload_2
	     57  getfield java.awt.Insets.left : int [294]
	     60  iadd
	     61  aload_2
	     62  getfield java.awt.Insets.right : int [295]
	     65  iadd
	     66  putfield java.awt.Dimension.width : int [292]
	     69  aload_1
	     70  aload_0 [this]
	     71  getfield javax.swing.JTextArea.rows : int [300]
	     74  ifne 84
	     77  aload_1
	     78  getfield java.awt.Dimension.height : int [291]
	     81  goto 103
	     84  aload_0 [this]
	     85  getfield javax.swing.JTextArea.rows : int [300]
	     88  aload_0 [this]
	     89  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	     92  imul
	     93  aload_2
	     94  getfield java.awt.Insets.top : int [296]
	     97  iadd
	     98  aload_2
	     99  getfield java.awt.Insets.bottom : int [293]
	    102  iadd
	    103  putfield java.awt.Dimension.height : int [291]
	    106  aload_1
	    107  areturn
	    Stack map table: number of frames 6
	        [pc: 25, append: {java.awt.Dimension}]
	        [pc: 26, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 47, full, stack: {java.awt.Dimension}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	        [pc: 66, full, stack: {java.awt.Dimension, int}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	        [pc: 84, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 103, full, stack: {java.awt.Dimension, int}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	  
	  // Method descriptor #199 (Ljava/awt/Rectangle;II)I
	  // Stack: 4, Locals: 4
	  public int getScrollableUnitIncrement(java.awt.Rectangle arg0, int arg1, int arg2);
	     0  iload_2 [arg1]
	     1  lookupswitch default: 38
	          case 0: 33
	          case 1: 28
	    28  aload_0 [this]
	    29  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	    32  ireturn
	    33  aload_0 [this]
	    34  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	    37  ireturn
	    38  new java.lang.IllegalArgumentException [177]
	    41  dup
	    42  new java.lang.StringBuilder [181]
	    45  dup
	    46  invokespecial java.lang.StringBuilder() [314]
	    49  ldc <String "Invalid orientation: "> [8]
	    51  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    54  iload_2 [arg1]
	    55  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	    58  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    61  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    64  athrow
	    Stack map table: number of frames 3
	        [pc: 28, same]
	        [pc: 33, same]
	        [pc: 38, same]
	  
	  // Method descriptor #33 (Ljava/io/ObjectOutputStream;)V
	  // Stack: 3, Locals: 3
	  private void writeObject(java.io.ObjectOutputStream arg0) throws java.io.IOException;
	     0  aload_1 [arg0]
	     1  invokevirtual java.io.ObjectOutputStream.defaultWriteObject() : void [308]
	     4  aload_0 [this]
	     5  invokevirtual javax.swing.JTextArea.getUIClassID() : java.lang.String [330]
	     8  ldc <String "TextAreaUI"> [11]
	    10  invokevirtual java.lang.String.equals(java.lang.Object) : boolean [313]
	    13  ifeq 50
	    16  aload_0 [this]
	    17  invokestatic javax.swing.JComponent.getWriteObjCounter(javax.swing.JComponent) : byte [320]
	    20  istore_2
	    21  aload_0 [this]
	    22  iload_2
	    23  iconst_1
	    24  isub
	    25  i2b
	    26  istore_2
	    27  iload_2
	    28  invokestatic javax.swing.JComponent.setWriteObjCounter(javax.swing.JComponent, byte) : void [321]
	    31  iload_2
	    32  ifne 50
	    35  aload_0 [this]
	    36  getfield javax.swing.JTextArea.ui : javax.swing.plaf.ComponentUI [304]
	    39  ifnull 50
	    42  aload_0 [this]
	    43  getfield javax.swing.JTextArea.ui : javax.swing.plaf.ComponentUI [304]
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.plaf.ComponentUI.installUI(javax.swing.JComponent) : void [341]
	    50  return
	    Stack map table: number of frames 1
	        [pc: 50, same]
	  
	  // Method descriptor #206 ()Ljavax/accessibility/AccessibleContext;
	  // Stack: 4, Locals: 1
	  public javax.accessibility.AccessibleContext getAccessibleContext();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	     4  ifnonnull 19
	     7  aload_0 [this]
	     8  new javax.swing.JTextArea$AccessibleJTextArea [184]
	    11  dup
	    12  aload_0 [this]
	    13  invokespecial javax.swing.JTextArea$AccessibleJTextArea(javax.swing.JTextArea) [339]
	    16  putfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	    19  aload_0 [this]
	    20  getfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	    23  areturn
	    Stack map table: number of frames 1
	        [pc: 19, same]

	  Inner classes:
	    [inner class info: #184 javax/swing/JTextArea$AccessibleJTextArea, outer class info: #183 javax/swing/JTextArea
	     inner name: #363 AccessibleJTextArea, accessflags: 4 protected]
	}//  (version 1.8 : 52.0, super bit)
public class javax.swing.JTextArea extends javax.swing.text.JTextComponent {
	  
	  // Field descriptor #53 Ljava/lang/String;
	  private static final java.lang.String uiClassID = "TextAreaUI";
	  
	  // Field descriptor #50 I
	  private int rows;
	  
	  // Field descriptor #50 I
	  private int columns;
	  
	  // Field descriptor #50 I
	  private int columnWidth;
	  
	  // Field descriptor #50 I
	  private int rowHeight;
	  
	  // Field descriptor #58 Z
	  private boolean wrap;
	  
	  // Field descriptor #58 Z
	  private boolean word;
	  
	  // Method descriptor #26 ()V
	  // Stack: 5, Locals: 1
	  public JTextArea();
	    0  aload_0 [this]
	    1  aconst_null
	    2  aconst_null
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #37 (Ljava/lang/String;)V
	  // Stack: 5, Locals: 2
	  public JTextArea(java.lang.String arg0);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aload_1 [arg0]
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #32 (II)V
	  // Stack: 5, Locals: 3
	  public JTextArea(int arg0, int arg1);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aconst_null
	    3  iload_1 [arg0]
	    4  iload_2 [arg1]
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #202 (Ljava/lang/String;II)V
	  // Stack: 5, Locals: 4
	  public JTextArea(java.lang.String arg0, int arg1, int arg2);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aload_1 [arg0]
	    3  iload_2 [arg1]
	    4  iload_3 [arg2]
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #212 (Ljavax/swing/text/Document;)V
	  // Stack: 5, Locals: 2
	  public JTextArea(javax.swing.text.Document arg0);
	    0  aload_0 [this]
	    1  aload_1 [arg0]
	    2  aconst_null
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #216 (Ljavax/swing/text/Document;Ljava/lang/String;II)V
	  // Stack: 4, Locals: 5
	  public JTextArea(javax.swing.text.Document arg0, java.lang.String arg1, int arg2, int arg3);
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent() [345]
	      4  aload_0 [this]
	      5  iload_3 [arg2]
	      6  putfield javax.swing.JTextArea.rows : int [300]
	      9  aload_0 [this]
	     10  iload 4 [arg3]
	     12  putfield javax.swing.JTextArea.columns : int [298]
	     15  aload_1 [arg0]
	     16  ifnonnull 24
	     19  aload_0 [this]
	     20  invokevirtual javax.swing.JTextArea.createDefaultModel() : javax.swing.text.Document [334]
	     23  astore_1 [arg0]
	     24  aload_0 [this]
	     25  aload_1 [arg0]
	     26  invokevirtual javax.swing.JTextArea.setDocument(javax.swing.text.Document) : void [336]
	     29  aload_2 [arg1]
	     30  ifnull 44
	     33  aload_0 [this]
	     34  aload_2 [arg1]
	     35  invokevirtual javax.swing.JTextArea.setText(java.lang.String) : void [331]
	     38  aload_0 [this]
	     39  iconst_0
	     40  iconst_0
	     41  invokevirtual javax.swing.JTextArea.select(int, int) : void [327]
	     44  iload_3 [arg2]
	     45  ifge 75
	     48  new java.lang.IllegalArgumentException [177]
	     51  dup
	     52  new java.lang.StringBuilder [181]
	     55  dup
	     56  invokespecial java.lang.StringBuilder() [314]
	     59  ldc <String "rows: "> [20]
	     61  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     64  iload_3 [arg2]
	     65  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     68  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	     71  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	     74  athrow
	     75  iload 4 [arg3]
	     77  ifge 108
	     80  new java.lang.IllegalArgumentException [177]
	     83  dup
	     84  new java.lang.StringBuilder [181]
	     87  dup
	     88  invokespecial java.lang.StringBuilder() [314]
	     91  ldc <String "columns: "> [13]
	     93  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     96  iload 4 [arg3]
	     98  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	    101  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    104  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    107  athrow
	    108  aload_0 [this]
	    109  ldc <String "focusTraversalKeysForward"> [17]
	    111  invokestatic javax.swing.JComponent.getManagingFocusForwardTraversalKeys() : java.util.Set [319]
	    114  invokestatic javax.swing.LookAndFeel.installProperty(javax.swing.JComponent, java.lang.String, java.lang.Object) : void [340]
	    117  aload_0 [this]
	    118  ldc <String "focusTraversalKeysBackward"> [16]
	    120  invokestatic javax.swing.JComponent.getManagingFocusBackwardTraversalKeys() : java.util.Set [318]
	    123  invokestatic javax.swing.LookAndFeel.installProperty(javax.swing.JComponent, java.lang.String, java.lang.Object) : void [340]
	    126  return
	    Stack map table: number of frames 4
	        [pc: 24, full, stack: {}, locals: {javax.swing.JTextArea, javax.swing.text.Document, java.lang.String, int, int}]
	        [pc: 44, same]
	        [pc: 75, same]
	        [pc: 108, same]
	  
	  // Method descriptor #25 ()Ljava/lang/String;
	  // Stack: 1, Locals: 1
	  public java.lang.String getUIClassID();
	    0  ldc <String "TextAreaUI"> [11]
	    2  areturn

	  
	  // Method descriptor #211 ()Ljavax/swing/text/Document;
	  // Stack: 2, Locals: 1
	  protected javax.swing.text.Document createDefaultModel();
	    0  new javax.swing.text.PlainDocument [192]
	    3  dup
	    4  invokespecial javax.swing.text.PlainDocument() [351]
	    7  areturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 4, Locals: 4
	  public void setTabSize(int arg0);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  aload_2
	     6  ifnull 34
	     9  aload_0 [this]
	    10  invokevirtual javax.swing.JTextArea.getTabSize() : int [325]
	    13  istore_3
	    14  aload_2
	    15  ldc <String "tabSize"> [21]
	    17  iload_1 [arg0]
	    18  invokestatic java.lang.Integer.valueOf(int) : java.lang.Integer [311]
	    21  invokeinterface javax.swing.text.Document.putProperty(java.lang.Object, java.lang.Object) : void [356] [nargs: 3]
	    26  aload_0 [this]
	    27  ldc <String "tabSize"> [21]
	    29  iload_3
	    30  iload_1 [arg0]
	    31  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, int, int) : void [332]
	    34  return
	    Stack map table: number of frames 1
	        [pc: 34, append: {javax.swing.text.Document}]
	  
	  // Method descriptor #24 ()I
	  // Stack: 2, Locals: 4
	  public int getTabSize();
	     0  bipush 8
	     2  istore_1
	     3  aload_0 [this]
	     4  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     7  astore_2
	     8  aload_2
	     9  ifnull 33
	    12  aload_2
	    13  ldc <String "tabSize"> [21]
	    15  invokeinterface javax.swing.text.Document.getProperty(java.lang.Object) : java.lang.Object [355] [nargs: 2]
	    20  checkcast java.lang.Integer [178]
	    23  astore_3
	    24  aload_3
	    25  ifnull 33
	    28  aload_3
	    29  invokevirtual java.lang.Integer.intValue() : int [310]
	    32  istore_1
	    33  iload_1
	    34  ireturn
	    Stack map table: number of frames 1
	        [pc: 33, append: {int, javax.swing.text.Document}]
	  
	  // Method descriptor #38 (Z)V
	  // Stack: 4, Locals: 3
	  public void setLineWrap(boolean arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.wrap : boolean [302]
	     4  istore_2
	     5  aload_0 [this]
	     6  iload_1 [arg0]
	     7  putfield javax.swing.JTextArea.wrap : boolean [302]
	    10  aload_0 [this]
	    11  ldc <String "lineWrap"> [18]
	    13  iload_2
	    14  iload_1 [arg0]
	    15  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, boolean, boolean) : void [333]
	    18  return

	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getLineWrap();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.wrap : boolean [302]
	    4  ireturn

	  
	  // Method descriptor #38 (Z)V
	  // Stack: 4, Locals: 3
	  public void setWrapStyleWord(boolean arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.word : boolean [301]
	     4  istore_2
	     5  aload_0 [this]
	     6  iload_1 [arg0]
	     7  putfield javax.swing.JTextArea.word : boolean [301]
	    10  aload_0 [this]
	    11  ldc <String "wrapStyleWord"> [23]
	    13  iload_2
	    14  iload_1 [arg0]
	    15  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, boolean, boolean) : void [333]
	    18  return

	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getWrapStyleWord();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.word : boolean [301]
	    4  ireturn

	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 4
	  public int getLineOfOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Can't translate offset to line"> [7]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  aload_2
	    22  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    27  if_icmple 48
	    30  new javax.swing.text.BadLocationException [188]
	    33  dup
	    34  ldc <String "Can't translate offset to line"> [7]
	    36  aload_2
	    37  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    42  iconst_1
	    43  iadd
	    44  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    47  athrow
	    48  aload_0 [this]
	    49  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    52  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    57  astore_3
	    58  aload_3
	    59  iload_1 [arg0]
	    60  invokeinterface javax.swing.text.Element.getElementIndex(int) : int [361] [nargs: 2]
	    65  ireturn
	    Stack map table: number of frames 2
	        [pc: 20, append: {javax.swing.text.Document}]
	        [pc: 48, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 2
	  public int getLineCount();
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	     9  astore_1
	    10  aload_1
	    11  invokeinterface javax.swing.text.Element.getElementCount() : int [358] [nargs: 1]
	    16  ireturn

	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 5
	  public int getLineStartOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getLineCount() : int [323]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Negative line"> [9]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  iload_2
	    22  if_icmplt 46
	    25  new javax.swing.text.BadLocationException [188]
	    28  dup
	    29  ldc <String "No such line"> [10]
	    31  aload_0 [this]
	    32  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    35  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    40  iconst_1
	    41  iadd
	    42  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    45  athrow
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    50  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    55  astore_3
	    56  aload_3
	    57  iload_1 [arg0]
	    58  invokeinterface javax.swing.text.Element.getElement(int) : javax.swing.text.Element [362] [nargs: 2]
	    63  astore 4
	    65  aload 4
	    67  invokeinterface javax.swing.text.Element.getStartOffset() : int [360] [nargs: 1]
	    72  ireturn
	    Stack map table: number of frames 2
	        [pc: 20, append: {int}]
	        [pc: 46, same]
	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 6
	  public int getLineEndOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getLineCount() : int [323]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Negative line"> [9]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  iload_2
	    22  if_icmplt 46
	    25  new javax.swing.text.BadLocationException [188]
	    28  dup
	    29  ldc <String "No such line"> [10]
	    31  aload_0 [this]
	    32  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    35  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    40  iconst_1
	    41  iadd
	    42  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    45  athrow
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    50  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    55  astore_3
	    56  aload_3
	    57  iload_1 [arg0]
	    58  invokeinterface javax.swing.text.Element.getElement(int) : javax.swing.text.Element [362] [nargs: 2]
	    63  astore 4
	    65  aload 4
	    67  invokeinterface javax.swing.text.Element.getEndOffset() : int [359] [nargs: 1]
	    72  istore 5
	    74  iload_1 [arg0]
	    75  iload_2
	    76  iconst_1
	    77  isub
	    78  if_icmpne 88
	    81  iload 5
	    83  iconst_1
	    84  isub
	    85  goto 90
	    88  iload 5
	    90  ireturn
	    Stack map table: number of frames 4
	        [pc: 20, append: {int}]
	        [pc: 46, same]
	        [pc: 88, append: {javax.swing.text.Element, javax.swing.text.Element, int}]
	        [pc: 90, same_locals_1_stack_item, stack: {int}]
	  
	  // Method descriptor #201 (Ljava/lang/String;I)V
	  // Stack: 4, Locals: 5
	  public void insert(java.lang.String arg0, int arg1);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_3
	     5  aload_3
	     6  ifnull 36
	     9  aload_3
	    10  iload_2 [arg1]
	    11  aload_1 [arg0]
	    12  aconst_null
	    13  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    18  goto 36
	    21  astore 4
	    23  new java.lang.IllegalArgumentException [177]
	    26  dup
	    27  aload 4
	    29  invokevirtual javax.swing.text.BadLocationException.getMessage() : java.lang.String [343]
	    32  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    35  athrow
	    36  return
	      Exception Table:
	        [pc: 9, pc: 18] -> 21 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 2
	        [pc: 21, full, stack: {javax.swing.text.BadLocationException}, locals: {javax.swing.JTextArea, java.lang.String, int, javax.swing.text.Document}]
	        [pc: 36, same]
	  
	  // Method descriptor #37 (Ljava/lang/String;)V
	  // Stack: 4, Locals: 4
	  public void append(java.lang.String arg0);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  aload_2
	     6  ifnull 27
	     9  aload_2
	    10  aload_2
	    11  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    16  aload_1 [arg0]
	    17  aconst_null
	    18  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    23  goto 27
	    26  astore_3
	    27  return
	      Exception Table:
	        [pc: 9, pc: 23] -> 26 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 2
	        [pc: 26, full, stack: {javax.swing.text.BadLocationException}, locals: {javax.swing.JTextArea, java.lang.String, javax.swing.text.Document}]
	        [pc: 27, same]
	  
	  // Method descriptor #202 (Ljava/lang/String;II)V
	  // Stack: 5, Locals: 6
	  public void replaceRange(java.lang.String arg0, int arg1, int arg2);
	     0  iload_3 [arg2]
	     1  iload_2 [arg1]
	     2  if_icmpge 15
	     5  new java.lang.IllegalArgumentException [177]
	     8  dup
	     9  ldc <String "end before start"> [14]
	    11  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    14  athrow
	    15  aload_0 [this]
	    16  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    19  astore 4
	    21  aload 4
	    23  ifnull 90
	    26  aload 4
	    28  instanceof javax.swing.text.AbstractDocument [187]
	    31  ifeq 51
	    34  aload 4
	    36  checkcast javax.swing.text.AbstractDocument [187]
	    39  iload_2 [arg1]
	    40  iload_3 [arg2]
	    41  iload_2 [arg1]
	    42  isub
	    43  aload_1 [arg0]
	    44  aconst_null
	    45  invokevirtual javax.swing.text.AbstractDocument.replace(int, int, java.lang.String, javax.swing.text.AttributeSet) : void [342]
	    48  goto 72
	    51  aload 4
	    53  iload_2 [arg1]
	    54  iload_3 [arg2]
	    55  iload_2 [arg1]
	    56  isub
	    57  invokeinterface javax.swing.text.Document.remove(int, int) : void [353] [nargs: 3]
	    62  aload 4
	    64  iload_2 [arg1]
	    65  aload_1 [arg0]
	    66  aconst_null
	    67  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    72  goto 90
	    75  astore 5
	    77  new java.lang.IllegalArgumentException [177]
	    80  dup
	    81  aload 5
	    83  invokevirtual javax.swing.text.BadLocationException.getMessage() : java.lang.String [343]
	    86  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    89  athrow
	    90  return
	      Exception Table:
	        [pc: 26, pc: 72] -> 75 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 5
	        [pc: 15, same]
	        [pc: 51, append: {javax.swing.text.Document}]
	        [pc: 72, same]
	        [pc: 75, same_locals_1_stack_item, stack: {javax.swing.text.BadLocationException}]
	        [pc: 90, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 1
	  public int getRows();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.rows : int [300]
	    4  ireturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 3, Locals: 3
	  public void setRows(int arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.rows : int [300]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 19
	     9  new java.lang.IllegalArgumentException [177]
	    12  dup
	    13  ldc <String "rows less than zero."> [19]
	    15  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    18  athrow
	    19  iload_1 [arg0]
	    20  iload_2
	    21  if_icmpeq 33
	    24  aload_0 [this]
	    25  iload_1 [arg0]
	    26  putfield javax.swing.JTextArea.rows : int [300]
	    29  aload_0 [this]
	    30  invokevirtual javax.swing.JTextArea.invalidate() : void [326]
	    33  return
	    Stack map table: number of frames 2
	        [pc: 19, append: {int}]
	        [pc: 33, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 2, Locals: 2
	  protected int getRowHeight();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.rowHeight : int [299]
	     4  ifne 24
	     7  aload_0 [this]
	     8  aload_0 [this]
	     9  invokevirtual javax.swing.JTextArea.getFont() : java.awt.Font [328]
	    12  invokevirtual javax.swing.JTextArea.getFontMetrics(java.awt.Font) : java.awt.FontMetrics [337]
	    15  astore_1
	    16  aload_0 [this]
	    17  aload_1
	    18  invokevirtual java.awt.FontMetrics.getHeight() : int [306]
	    21  putfield javax.swing.JTextArea.rowHeight : int [299]
	    24  aload_0 [this]
	    25  getfield javax.swing.JTextArea.rowHeight : int [299]
	    28  ireturn
	    Stack map table: number of frames 1
	        [pc: 24, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 1
	  public int getColumns();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.columns : int [298]
	    4  ireturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 3, Locals: 3
	  public void setColumns(int arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.columns : int [298]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 19
	     9  new java.lang.IllegalArgumentException [177]
	    12  dup
	    13  ldc <String "columns less than zero."> [12]
	    15  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    18  athrow
	    19  iload_1 [arg0]
	    20  iload_2
	    21  if_icmpeq 33
	    24  aload_0 [this]
	    25  iload_1 [arg0]
	    26  putfield javax.swing.JTextArea.columns : int [298]
	    29  aload_0 [this]
	    30  invokevirtual javax.swing.JTextArea.invalidate() : void [326]
	    33  return
	    Stack map table: number of frames 2
	        [pc: 19, append: {int}]
	        [pc: 33, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 3, Locals: 2
	  protected int getColumnWidth();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.columnWidth : int [297]
	     4  ifne 26
	     7  aload_0 [this]
	     8  aload_0 [this]
	     9  invokevirtual javax.swing.JTextArea.getFont() : java.awt.Font [328]
	    12  invokevirtual javax.swing.JTextArea.getFontMetrics(java.awt.Font) : java.awt.FontMetrics [337]
	    15  astore_1
	    16  aload_0 [this]
	    17  aload_1
	    18  bipush 109
	    20  invokevirtual java.awt.FontMetrics.charWidth(char) : int [307]
	    23  putfield javax.swing.JTextArea.columnWidth : int [297]
	    26  aload_0 [this]
	    27  getfield javax.swing.JTextArea.columnWidth : int [297]
	    30  ireturn
	    Stack map table: number of frames 1
	        [pc: 26, same]
	  
	  // Method descriptor #195 ()Ljava/awt/Dimension;
	  // Stack: 4, Locals: 3
	  public java.awt.Dimension getPreferredSize();
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent.getPreferredSize() : java.awt.Dimension [348]
	      4  astore_1
	      5  aload_1
	      6  ifnonnull 25
	      9  new java.awt.Dimension [172]
	     12  dup
	     13  sipush 400
	     16  sipush 400
	     19  invokespecial java.awt.Dimension(int, int) [305]
	     22  goto 26
	     25  aload_1
	     26  astore_1
	     27  aload_0 [this]
	     28  invokevirtual javax.swing.JTextArea.getInsets() : java.awt.Insets [329]
	     31  astore_2
	     32  aload_0 [this]
	     33  getfield javax.swing.JTextArea.columns : int [298]
	     36  ifeq 69
	     39  aload_1
	     40  aload_1
	     41  getfield java.awt.Dimension.width : int [292]
	     44  aload_0 [this]
	     45  getfield javax.swing.JTextArea.columns : int [298]
	     48  aload_0 [this]
	     49  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	     52  imul
	     53  aload_2
	     54  getfield java.awt.Insets.left : int [294]
	     57  iadd
	     58  aload_2
	     59  getfield java.awt.Insets.right : int [295]
	     62  iadd
	     63  invokestatic java.lang.Math.max(int, int) : int [312]
	     66  putfield java.awt.Dimension.width : int [292]
	     69  aload_0 [this]
	     70  getfield javax.swing.JTextArea.rows : int [300]
	     73  ifeq 106
	     76  aload_1
	     77  aload_1
	     78  getfield java.awt.Dimension.height : int [291]
	     81  aload_0 [this]
	     82  getfield javax.swing.JTextArea.rows : int [300]
	     85  aload_0 [this]
	     86  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	     89  imul
	     90  aload_2
	     91  getfield java.awt.Insets.top : int [296]
	     94  iadd
	     95  aload_2
	     96  getfield java.awt.Insets.bottom : int [293]
	     99  iadd
	    100  invokestatic java.lang.Math.max(int, int) : int [312]
	    103  putfield java.awt.Dimension.height : int [291]
	    106  aload_1
	    107  areturn
	    Stack map table: number of frames 4
	        [pc: 25, append: {java.awt.Dimension}]
	        [pc: 26, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 69, append: {java.awt.Insets}]
	        [pc: 106, same]
	  
	  // Method descriptor #197 (Ljava/awt/Font;)V
	  // Stack: 2, Locals: 2
	  public void setFont(java.awt.Font arg0);
	     0  aload_0 [this]
	     1  aload_1 [arg0]
	     2  invokespecial javax.swing.text.JTextComponent.setFont(java.awt.Font) : void [349]
	     5  aload_0 [this]
	     6  iconst_0
	     7  putfield javax.swing.JTextArea.rowHeight : int [299]
	    10  aload_0 [this]
	    11  iconst_0
	    12  putfield javax.swing.JTextArea.columnWidth : int [297]
	    15  return

	  
	  // Method descriptor #25 ()Ljava/lang/String;
	  // Stack: 2, Locals: 3
	  protected java.lang.String paramString();
	      0  aload_0 [this]
	      1  getfield javax.swing.JTextArea.wrap : boolean [302]
	      4  ifeq 12
	      7  ldc <String "true"> [22]
	      9  goto 14
	     12  ldc <String "false"> [15]
	     14  astore_1
	     15  aload_0 [this]
	     16  getfield javax.swing.JTextArea.word : boolean [301]
	     19  ifeq 27
	     22  ldc <String "true"> [22]
	     24  goto 29
	     27  ldc <String "false"> [15]
	     29  astore_2
	     30  new java.lang.StringBuilder [181]
	     33  dup
	     34  invokespecial java.lang.StringBuilder() [314]
	     37  aload_0 [this]
	     38  invokespecial javax.swing.text.JTextComponent.paramString() : java.lang.String [350]
	     41  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     44  ldc <String ",colums="> [2]
	     46  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     49  aload_0 [this]
	     50  getfield javax.swing.JTextArea.columns : int [298]
	     53  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     56  ldc <String ",columWidth="> [1]
	     58  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     61  aload_0 [this]
	     62  getfield javax.swing.JTextArea.columnWidth : int [297]
	     65  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     68  ldc <String ",rows="> [4]
	     70  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     73  aload_0 [this]
	     74  getfield javax.swing.JTextArea.rows : int [300]
	     77  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     80  ldc <String ",rowHeight="> [3]
	     82  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     85  aload_0 [this]
	     86  getfield javax.swing.JTextArea.rowHeight : int [299]
	     89  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     92  ldc <String ",word="> [5]
	     94  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     97  aload_2
	     98  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    101  ldc <String ",wrap="> [6]
	    103  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    106  aload_1
	    107  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    110  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    113  areturn
	    Stack map table: number of frames 4
	        [pc: 12, same]
	        [pc: 14, same_locals_1_stack_item, stack: {java.lang.String}]
	        [pc: 27, append: {java.lang.String}]
	        [pc: 29, same_locals_1_stack_item, stack: {java.lang.String}]
	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getScrollableTracksViewportWidth();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.wrap : boolean [302]
	     4  ifeq 11
	     7  iconst_1
	     8  goto 15
	    11  aload_0 [this]
	    12  invokespecial javax.swing.text.JTextComponent.getScrollableTracksViewportWidth() : boolean [346]
	    15  ireturn
	    Stack map table: number of frames 2
	        [pc: 11, same]
	        [pc: 15, same_locals_1_stack_item, stack: {int}]
	  
	  // Method descriptor #195 ()Ljava/awt/Dimension;
	  // Stack: 4, Locals: 3
	  public java.awt.Dimension getPreferredScrollableViewportSize();
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent.getPreferredScrollableViewportSize() : java.awt.Dimension [347]
	      4  astore_1
	      5  aload_1
	      6  ifnonnull 25
	      9  new java.awt.Dimension [172]
	     12  dup
	     13  sipush 400
	     16  sipush 400
	     19  invokespecial java.awt.Dimension(int, int) [305]
	     22  goto 26
	     25  aload_1
	     26  astore_1
	     27  aload_0 [this]
	     28  invokevirtual javax.swing.JTextArea.getInsets() : java.awt.Insets [329]
	     31  astore_2
	     32  aload_1
	     33  aload_0 [this]
	     34  getfield javax.swing.JTextArea.columns : int [298]
	     37  ifne 47
	     40  aload_1
	     41  getfield java.awt.Dimension.width : int [292]
	     44  goto 66
	     47  aload_0 [this]
	     48  getfield javax.swing.JTextArea.columns : int [298]
	     51  aload_0 [this]
	     52  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	     55  imul
	     56  aload_2
	     57  getfield java.awt.Insets.left : int [294]
	     60  iadd
	     61  aload_2
	     62  getfield java.awt.Insets.right : int [295]
	     65  iadd
	     66  putfield java.awt.Dimension.width : int [292]
	     69  aload_1
	     70  aload_0 [this]
	     71  getfield javax.swing.JTextArea.rows : int [300]
	     74  ifne 84
	     77  aload_1
	     78  getfield java.awt.Dimension.height : int [291]
	     81  goto 103
	     84  aload_0 [this]
	     85  getfield javax.swing.JTextArea.rows : int [300]
	     88  aload_0 [this]
	     89  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	     92  imul
	     93  aload_2
	     94  getfield java.awt.Insets.top : int [296]
	     97  iadd
	     98  aload_2
	     99  getfield java.awt.Insets.bottom : int [293]
	    102  iadd
	    103  putfield java.awt.Dimension.height : int [291]
	    106  aload_1
	    107  areturn
	    Stack map table: number of frames 6
	        [pc: 25, append: {java.awt.Dimension}]
	        [pc: 26, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 47, full, stack: {java.awt.Dimension}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	        [pc: 66, full, stack: {java.awt.Dimension, int}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	        [pc: 84, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 103, full, stack: {java.awt.Dimension, int}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	  
	  // Method descriptor #199 (Ljava/awt/Rectangle;II)I
	  // Stack: 4, Locals: 4
	  public int getScrollableUnitIncrement(java.awt.Rectangle arg0, int arg1, int arg2);
	     0  iload_2 [arg1]
	     1  lookupswitch default: 38
	          case 0: 33
	          case 1: 28
	    28  aload_0 [this]
	    29  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	    32  ireturn
	    33  aload_0 [this]
	    34  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	    37  ireturn
	    38  new java.lang.IllegalArgumentException [177]
	    41  dup
	    42  new java.lang.StringBuilder [181]
	    45  dup
	    46  invokespecial java.lang.StringBuilder() [314]
	    49  ldc <String "Invalid orientation: "> [8]
	    51  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    54  iload_2 [arg1]
	    55  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	    58  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    61  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    64  athrow
	    Stack map table: number of frames 3
	        [pc: 28, same]
	        [pc: 33, same]
	        [pc: 38, same]
	  
	  // Method descriptor #33 (Ljava/io/ObjectOutputStream;)V
	  // Stack: 3, Locals: 3
	  private void writeObject(java.io.ObjectOutputStream arg0) throws java.io.IOException;
	     0  aload_1 [arg0]
	     1  invokevirtual java.io.ObjectOutputStream.defaultWriteObject() : void [308]
	     4  aload_0 [this]
	     5  invokevirtual javax.swing.JTextArea.getUIClassID() : java.lang.String [330]
	     8  ldc <String "TextAreaUI"> [11]
	    10  invokevirtual java.lang.String.equals(java.lang.Object) : boolean [313]
	    13  ifeq 50
	    16  aload_0 [this]
	    17  invokestatic javax.swing.JComponent.getWriteObjCounter(javax.swing.JComponent) : byte [320]
	    20  istore_2
	    21  aload_0 [this]
	    22  iload_2
	    23  iconst_1
	    24  isub
	    25  i2b
	    26  istore_2
	    27  iload_2
	    28  invokestatic javax.swing.JComponent.setWriteObjCounter(javax.swing.JComponent, byte) : void [321]
	    31  iload_2
	    32  ifne 50
	    35  aload_0 [this]
	    36  getfield javax.swing.JTextArea.ui : javax.swing.plaf.ComponentUI [304]
	    39  ifnull 50
	    42  aload_0 [this]
	    43  getfield javax.swing.JTextArea.ui : javax.swing.plaf.ComponentUI [304]
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.plaf.ComponentUI.installUI(javax.swing.JComponent) : void [341]
	    50  return
	    Stack map table: number of frames 1
	        [pc: 50, same]
	  
	  // Method descriptor #206 ()Ljavax/accessibility/AccessibleContext;
	  // Stack: 4, Locals: 1
	  public javax.accessibility.AccessibleContext getAccessibleContext();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	     4  ifnonnull 19
	     7  aload_0 [this]
	     8  new javax.swing.JTextArea$AccessibleJTextArea [184]
	    11  dup
	    12  aload_0 [this]
	    13  invokespecial javax.swing.JTextArea$AccessibleJTextArea(javax.swing.JTextArea) [339]
	    16  putfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	    19  aload_0 [this]
	    20  getfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	    23  areturn
	    Stack map table: number of frames 1
	        [pc: 19, same]

	  Inner classes:
	    [inner class info: #184 javax/swing/JTextArea$AccessibleJTextArea, outer class info: #183 javax/swing/JTextArea
	     inner name: #363 AccessibleJTextArea, accessflags: 4 protected]
	}//  (version 1.8 : 52.0, super bit)
public class javax.swing.JTextArea extends javax.swing.text.JTextComponent {
	  
	  // Field descriptor #53 Ljava/lang/String;
	  private static final java.lang.String uiClassID = "TextAreaUI";
	  
	  // Field descriptor #50 I
	  private int rows;
	  
	  // Field descriptor #50 I
	  private int columns;
	  
	  // Field descriptor #50 I
	  private int columnWidth;
	  
	  // Field descriptor #50 I
	  private int rowHeight;
	  
	  // Field descriptor #58 Z
	  private boolean wrap;
	  
	  // Field descriptor #58 Z
	  private boolean word;
	  
	  // Method descriptor #26 ()V
	  // Stack: 5, Locals: 1
	  public JTextArea();
	    0  aload_0 [this]
	    1  aconst_null
	    2  aconst_null
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #37 (Ljava/lang/String;)V
	  // Stack: 5, Locals: 2
	  public JTextArea(java.lang.String arg0);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aload_1 [arg0]
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #32 (II)V
	  // Stack: 5, Locals: 3
	  public JTextArea(int arg0, int arg1);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aconst_null
	    3  iload_1 [arg0]
	    4  iload_2 [arg1]
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #202 (Ljava/lang/String;II)V
	  // Stack: 5, Locals: 4
	  public JTextArea(java.lang.String arg0, int arg1, int arg2);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aload_1 [arg0]
	    3  iload_2 [arg1]
	    4  iload_3 [arg2]
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #212 (Ljavax/swing/text/Document;)V
	  // Stack: 5, Locals: 2
	  public JTextArea(javax.swing.text.Document arg0);
	    0  aload_0 [this]
	    1  aload_1 [arg0]
	    2  aconst_null
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #216 (Ljavax/swing/text/Document;Ljava/lang/String;II)V
	  // Stack: 4, Locals: 5
	  public JTextArea(javax.swing.text.Document arg0, java.lang.String arg1, int arg2, int arg3);
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent() [345]
	      4  aload_0 [this]
	      5  iload_3 [arg2]
	      6  putfield javax.swing.JTextArea.rows : int [300]
	      9  aload_0 [this]
	     10  iload 4 [arg3]
	     12  putfield javax.swing.JTextArea.columns : int [298]
	     15  aload_1 [arg0]
	     16  ifnonnull 24
	     19  aload_0 [this]
	     20  invokevirtual javax.swing.JTextArea.createDefaultModel() : javax.swing.text.Document [334]
	     23  astore_1 [arg0]
	     24  aload_0 [this]
	     25  aload_1 [arg0]
	     26  invokevirtual javax.swing.JTextArea.setDocument(javax.swing.text.Document) : void [336]
	     29  aload_2 [arg1]
	     30  ifnull 44
	     33  aload_0 [this]
	     34  aload_2 [arg1]
	     35  invokevirtual javax.swing.JTextArea.setText(java.lang.String) : void [331]
	     38  aload_0 [this]
	     39  iconst_0
	     40  iconst_0
	     41  invokevirtual javax.swing.JTextArea.select(int, int) : void [327]
	     44  iload_3 [arg2]
	     45  ifge 75
	     48  new java.lang.IllegalArgumentException [177]
	     51  dup
	     52  new java.lang.StringBuilder [181]
	     55  dup
	     56  invokespecial java.lang.StringBuilder() [314]
	     59  ldc <String "rows: "> [20]
	     61  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     64  iload_3 [arg2]
	     65  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     68  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	     71  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	     74  athrow
	     75  iload 4 [arg3]
	     77  ifge 108
	     80  new java.lang.IllegalArgumentException [177]
	     83  dup
	     84  new java.lang.StringBuilder [181]
	     87  dup
	     88  invokespecial java.lang.StringBuilder() [314]
	     91  ldc <String "columns: "> [13]
	     93  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     96  iload 4 [arg3]
	     98  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	    101  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    104  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    107  athrow
	    108  aload_0 [this]
	    109  ldc <String "focusTraversalKeysForward"> [17]
	    111  invokestatic javax.swing.JComponent.getManagingFocusForwardTraversalKeys() : java.util.Set [319]
	    114  invokestatic javax.swing.LookAndFeel.installProperty(javax.swing.JComponent, java.lang.String, java.lang.Object) : void [340]
	    117  aload_0 [this]
	    118  ldc <String "focusTraversalKeysBackward"> [16]
	    120  invokestatic javax.swing.JComponent.getManagingFocusBackwardTraversalKeys() : java.util.Set [318]
	    123  invokestatic javax.swing.LookAndFeel.installProperty(javax.swing.JComponent, java.lang.String, java.lang.Object) : void [340]
	    126  return
	    Stack map table: number of frames 4
	        [pc: 24, full, stack: {}, locals: {javax.swing.JTextArea, javax.swing.text.Document, java.lang.String, int, int}]
	        [pc: 44, same]
	        [pc: 75, same]
	        [pc: 108, same]
	  
	  // Method descriptor #25 ()Ljava/lang/String;
	  // Stack: 1, Locals: 1
	  public java.lang.String getUIClassID();
	    0  ldc <String "TextAreaUI"> [11]
	    2  areturn

	  
	  // Method descriptor #211 ()Ljavax/swing/text/Document;
	  // Stack: 2, Locals: 1
	  protected javax.swing.text.Document createDefaultModel();
	    0  new javax.swing.text.PlainDocument [192]
	    3  dup
	    4  invokespecial javax.swing.text.PlainDocument() [351]
	    7  areturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 4, Locals: 4
	  public void setTabSize(int arg0);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  aload_2
	     6  ifnull 34
	     9  aload_0 [this]
	    10  invokevirtual javax.swing.JTextArea.getTabSize() : int [325]
	    13  istore_3
	    14  aload_2
	    15  ldc <String "tabSize"> [21]
	    17  iload_1 [arg0]
	    18  invokestatic java.lang.Integer.valueOf(int) : java.lang.Integer [311]
	    21  invokeinterface javax.swing.text.Document.putProperty(java.lang.Object, java.lang.Object) : void [356] [nargs: 3]
	    26  aload_0 [this]
	    27  ldc <String "tabSize"> [21]
	    29  iload_3
	    30  iload_1 [arg0]
	    31  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, int, int) : void [332]
	    34  return
	    Stack map table: number of frames 1
	        [pc: 34, append: {javax.swing.text.Document}]
	  
	  // Method descriptor #24 ()I
	  // Stack: 2, Locals: 4
	  public int getTabSize();
	     0  bipush 8
	     2  istore_1
	     3  aload_0 [this]
	     4  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     7  astore_2
	     8  aload_2
	     9  ifnull 33
	    12  aload_2
	    13  ldc <String "tabSize"> [21]
	    15  invokeinterface javax.swing.text.Document.getProperty(java.lang.Object) : java.lang.Object [355] [nargs: 2]
	    20  checkcast java.lang.Integer [178]
	    23  astore_3
	    24  aload_3
	    25  ifnull 33
	    28  aload_3
	    29  invokevirtual java.lang.Integer.intValue() : int [310]
	    32  istore_1
	    33  iload_1
	    34  ireturn
	    Stack map table: number of frames 1
	        [pc: 33, append: {int, javax.swing.text.Document}]
	  
	  // Method descriptor #38 (Z)V
	  // Stack: 4, Locals: 3
	  public void setLineWrap(boolean arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.wrap : boolean [302]
	     4  istore_2
	     5  aload_0 [this]
	     6  iload_1 [arg0]
	     7  putfield javax.swing.JTextArea.wrap : boolean [302]
	    10  aload_0 [this]
	    11  ldc <String "lineWrap"> [18]
	    13  iload_2
	    14  iload_1 [arg0]
	    15  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, boolean, boolean) : void [333]
	    18  return

	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getLineWrap();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.wrap : boolean [302]
	    4  ireturn

	  
	  // Method descriptor #38 (Z)V
	  // Stack: 4, Locals: 3
	  public void setWrapStyleWord(boolean arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.word : boolean [301]
	     4  istore_2
	     5  aload_0 [this]
	     6  iload_1 [arg0]
	     7  putfield javax.swing.JTextArea.word : boolean [301]
	    10  aload_0 [this]
	    11  ldc <String "wrapStyleWord"> [23]
	    13  iload_2
	    14  iload_1 [arg0]
	    15  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, boolean, boolean) : void [333]
	    18  return

	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getWrapStyleWord();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.word : boolean [301]
	    4  ireturn

	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 4
	  public int getLineOfOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Can't translate offset to line"> [7]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  aload_2
	    22  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    27  if_icmple 48
	    30  new javax.swing.text.BadLocationException [188]
	    33  dup
	    34  ldc <String "Can't translate offset to line"> [7]
	    36  aload_2
	    37  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    42  iconst_1
	    43  iadd
	    44  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    47  athrow
	    48  aload_0 [this]
	    49  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    52  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    57  astore_3
	    58  aload_3
	    59  iload_1 [arg0]
	    60  invokeinterface javax.swing.text.Element.getElementIndex(int) : int [361] [nargs: 2]
	    65  ireturn
	    Stack map table: number of frames 2
	        [pc: 20, append: {javax.swing.text.Document}]
	        [pc: 48, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 2
	  public int getLineCount();
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	     9  astore_1
	    10  aload_1
	    11  invokeinterface javax.swing.text.Element.getElementCount() : int [358] [nargs: 1]
	    16  ireturn

	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 5
	  public int getLineStartOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getLineCount() : int [323]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Negative line"> [9]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  iload_2
	    22  if_icmplt 46
	    25  new javax.swing.text.BadLocationException [188]
	    28  dup
	    29  ldc <String "No such line"> [10]
	    31  aload_0 [this]
	    32  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    35  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    40  iconst_1
	    41  iadd
	    42  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    45  athrow
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    50  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    55  astore_3
	    56  aload_3
	    57  iload_1 [arg0]
	    58  invokeinterface javax.swing.text.Element.getElement(int) : javax.swing.text.Element [362] [nargs: 2]
	    63  astore 4
	    65  aload 4
	    67  invokeinterface javax.swing.text.Element.getStartOffset() : int [360] [nargs: 1]
	    72  ireturn
	    Stack map table: number of frames 2
	        [pc: 20, append: {int}]
	        [pc: 46, same]
	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 6
	  public int getLineEndOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getLineCount() : int [323]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Negative line"> [9]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  iload_2
	    22  if_icmplt 46
	    25  new javax.swing.text.BadLocationException [188]
	    28  dup
	    29  ldc <String "No such line"> [10]
	    31  aload_0 [this]
	    32  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    35  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    40  iconst_1
	    41  iadd
	    42  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    45  athrow
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    50  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    55  astore_3
	    56  aload_3
	    57  iload_1 [arg0]
	    58  invokeinterface javax.swing.text.Element.getElement(int) : javax.swing.text.Element [362] [nargs: 2]
	    63  astore 4
	    65  aload 4
	    67  invokeinterface javax.swing.text.Element.getEndOffset() : int [359] [nargs: 1]
	    72  istore 5
	    74  iload_1 [arg0]
	    75  iload_2
	    76  iconst_1
	    77  isub
	    78  if_icmpne 88
	    81  iload 5
	    83  iconst_1
	    84  isub
	    85  goto 90
	    88  iload 5
	    90  ireturn
	    Stack map table: number of frames 4
	        [pc: 20, append: {int}]
	        [pc: 46, same]
	        [pc: 88, append: {javax.swing.text.Element, javax.swing.text.Element, int}]
	        [pc: 90, same_locals_1_stack_item, stack: {int}]
	  
	  // Method descriptor #201 (Ljava/lang/String;I)V
	  // Stack: 4, Locals: 5
	  public void insert(java.lang.String arg0, int arg1);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_3
	     5  aload_3
	     6  ifnull 36
	     9  aload_3
	    10  iload_2 [arg1]
	    11  aload_1 [arg0]
	    12  aconst_null
	    13  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    18  goto 36
	    21  astore 4
	    23  new java.lang.IllegalArgumentException [177]
	    26  dup
	    27  aload 4
	    29  invokevirtual javax.swing.text.BadLocationException.getMessage() : java.lang.String [343]
	    32  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    35  athrow
	    36  return
	      Exception Table:
	        [pc: 9, pc: 18] -> 21 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 2
	        [pc: 21, full, stack: {javax.swing.text.BadLocationException}, locals: {javax.swing.JTextArea, java.lang.String, int, javax.swing.text.Document}]
	        [pc: 36, same]
	  
	  // Method descriptor #37 (Ljava/lang/String;)V
	  // Stack: 4, Locals: 4
	  public void append(java.lang.String arg0);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  aload_2
	     6  ifnull 27
	     9  aload_2
	    10  aload_2
	    11  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    16  aload_1 [arg0]
	    17  aconst_null
	    18  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    23  goto 27
	    26  astore_3
	    27  return
	      Exception Table:
	        [pc: 9, pc: 23] -> 26 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 2
	        [pc: 26, full, stack: {javax.swing.text.BadLocationException}, locals: {javax.swing.JTextArea, java.lang.String, javax.swing.text.Document}]
	        [pc: 27, same]
	  
	  // Method descriptor #202 (Ljava/lang/String;II)V
	  // Stack: 5, Locals: 6
	  public void replaceRange(java.lang.String arg0, int arg1, int arg2);
	     0  iload_3 [arg2]
	     1  iload_2 [arg1]
	     2  if_icmpge 15
	     5  new java.lang.IllegalArgumentException [177]
	     8  dup
	     9  ldc <String "end before start"> [14]
	    11  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    14  athrow
	    15  aload_0 [this]
	    16  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    19  astore 4
	    21  aload 4
	    23  ifnull 90
	    26  aload 4
	    28  instanceof javax.swing.text.AbstractDocument [187]
	    31  ifeq 51
	    34  aload 4
	    36  checkcast javax.swing.text.AbstractDocument [187]
	    39  iload_2 [arg1]
	    40  iload_3 [arg2]
	    41  iload_2 [arg1]
	    42  isub
	    43  aload_1 [arg0]
	    44  aconst_null
	    45  invokevirtual javax.swing.text.AbstractDocument.replace(int, int, java.lang.String, javax.swing.text.AttributeSet) : void [342]
	    48  goto 72
	    51  aload 4
	    53  iload_2 [arg1]
	    54  iload_3 [arg2]
	    55  iload_2 [arg1]
	    56  isub
	    57  invokeinterface javax.swing.text.Document.remove(int, int) : void [353] [nargs: 3]
	    62  aload 4
	    64  iload_2 [arg1]
	    65  aload_1 [arg0]
	    66  aconst_null
	    67  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    72  goto 90
	    75  astore 5
	    77  new java.lang.IllegalArgumentException [177]
	    80  dup
	    81  aload 5
	    83  invokevirtual javax.swing.text.BadLocationException.getMessage() : java.lang.String [343]
	    86  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    89  athrow
	    90  return
	      Exception Table:
	        [pc: 26, pc: 72] -> 75 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 5
	        [pc: 15, same]
	        [pc: 51, append: {javax.swing.text.Document}]
	        [pc: 72, same]
	        [pc: 75, same_locals_1_stack_item, stack: {javax.swing.text.BadLocationException}]
	        [pc: 90, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 1
	  public int getRows();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.rows : int [300]
	    4  ireturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 3, Locals: 3
	  public void setRows(int arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.rows : int [300]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 19
	     9  new java.lang.IllegalArgumentException [177]
	    12  dup
	    13  ldc <String "rows less than zero."> [19]
	    15  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    18  athrow
	    19  iload_1 [arg0]
	    20  iload_2
	    21  if_icmpeq 33
	    24  aload_0 [this]
	    25  iload_1 [arg0]
	    26  putfield javax.swing.JTextArea.rows : int [300]
	    29  aload_0 [this]
	    30  invokevirtual javax.swing.JTextArea.invalidate() : void [326]
	    33  return
	    Stack map table: number of frames 2
	        [pc: 19, append: {int}]
	        [pc: 33, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 2, Locals: 2
	  protected int getRowHeight();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.rowHeight : int [299]
	     4  ifne 24
	     7  aload_0 [this]
	     8  aload_0 [this]
	     9  invokevirtual javax.swing.JTextArea.getFont() : java.awt.Font [328]
	    12  invokevirtual javax.swing.JTextArea.getFontMetrics(java.awt.Font) : java.awt.FontMetrics [337]
	    15  astore_1
	    16  aload_0 [this]
	    17  aload_1
	    18  invokevirtual java.awt.FontMetrics.getHeight() : int [306]
	    21  putfield javax.swing.JTextArea.rowHeight : int [299]
	    24  aload_0 [this]
	    25  getfield javax.swing.JTextArea.rowHeight : int [299]
	    28  ireturn
	    Stack map table: number of frames 1
	        [pc: 24, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 1
	  public int getColumns();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.columns : int [298]
	    4  ireturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 3, Locals: 3
	  public void setColumns(int arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.columns : int [298]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 19
	     9  new java.lang.IllegalArgumentException [177]
	    12  dup
	    13  ldc <String "columns less than zero."> [12]
	    15  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    18  athrow
	    19  iload_1 [arg0]
	    20  iload_2
	    21  if_icmpeq 33
	    24  aload_0 [this]
	    25  iload_1 [arg0]
	    26  putfield javax.swing.JTextArea.columns : int [298]
	    29  aload_0 [this]
	    30  invokevirtual javax.swing.JTextArea.invalidate() : void [326]
	    33  return
	    Stack map table: number of frames 2
	        [pc: 19, append: {int}]
	        [pc: 33, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 3, Locals: 2
	  protected int getColumnWidth();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.columnWidth : int [297]
	     4  ifne 26
	     7  aload_0 [this]
	     8  aload_0 [this]
	     9  invokevirtual javax.swing.JTextArea.getFont() : java.awt.Font [328]
	    12  invokevirtual javax.swing.JTextArea.getFontMetrics(java.awt.Font) : java.awt.FontMetrics [337]
	    15  astore_1
	    16  aload_0 [this]
	    17  aload_1
	    18  bipush 109
	    20  invokevirtual java.awt.FontMetrics.charWidth(char) : int [307]
	    23  putfield javax.swing.JTextArea.columnWidth : int [297]
	    26  aload_0 [this]
	    27  getfield javax.swing.JTextArea.columnWidth : int [297]
	    30  ireturn
	    Stack map table: number of frames 1
	        [pc: 26, same]
	  
	  // Method descriptor #195 ()Ljava/awt/Dimension;
	  // Stack: 4, Locals: 3
	  public java.awt.Dimension getPreferredSize();
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent.getPreferredSize() : java.awt.Dimension [348]
	      4  astore_1
	      5  aload_1
	      6  ifnonnull 25
	      9  new java.awt.Dimension [172]
	     12  dup
	     13  sipush 400
	     16  sipush 400
	     19  invokespecial java.awt.Dimension(int, int) [305]
	     22  goto 26
	     25  aload_1
	     26  astore_1
	     27  aload_0 [this]
	     28  invokevirtual javax.swing.JTextArea.getInsets() : java.awt.Insets [329]
	     31  astore_2
	     32  aload_0 [this]
	     33  getfield javax.swing.JTextArea.columns : int [298]
	     36  ifeq 69
	     39  aload_1
	     40  aload_1
	     41  getfield java.awt.Dimension.width : int [292]
	     44  aload_0 [this]
	     45  getfield javax.swing.JTextArea.columns : int [298]
	     48  aload_0 [this]
	     49  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	     52  imul
	     53  aload_2
	     54  getfield java.awt.Insets.left : int [294]
	     57  iadd
	     58  aload_2
	     59  getfield java.awt.Insets.right : int [295]
	     62  iadd
	     63  invokestatic java.lang.Math.max(int, int) : int [312]
	     66  putfield java.awt.Dimension.width : int [292]
	     69  aload_0 [this]
	     70  getfield javax.swing.JTextArea.rows : int [300]
	     73  ifeq 106
	     76  aload_1
	     77  aload_1
	     78  getfield java.awt.Dimension.height : int [291]
	     81  aload_0 [this]
	     82  getfield javax.swing.JTextArea.rows : int [300]
	     85  aload_0 [this]
	     86  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	     89  imul
	     90  aload_2
	     91  getfield java.awt.Insets.top : int [296]
	     94  iadd
	     95  aload_2
	     96  getfield java.awt.Insets.bottom : int [293]
	     99  iadd
	    100  invokestatic java.lang.Math.max(int, int) : int [312]
	    103  putfield java.awt.Dimension.height : int [291]
	    106  aload_1
	    107  areturn
	    Stack map table: number of frames 4
	        [pc: 25, append: {java.awt.Dimension}]
	        [pc: 26, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 69, append: {java.awt.Insets}]
	        [pc: 106, same]
	  
	  // Method descriptor #197 (Ljava/awt/Font;)V
	  // Stack: 2, Locals: 2
	  public void setFont(java.awt.Font arg0);
	     0  aload_0 [this]
	     1  aload_1 [arg0]
	     2  invokespecial javax.swing.text.JTextComponent.setFont(java.awt.Font) : void [349]
	     5  aload_0 [this]
	     6  iconst_0
	     7  putfield javax.swing.JTextArea.rowHeight : int [299]
	    10  aload_0 [this]
	    11  iconst_0
	    12  putfield javax.swing.JTextArea.columnWidth : int [297]
	    15  return

	  
	  // Method descriptor #25 ()Ljava/lang/String;
	  // Stack: 2, Locals: 3
	  protected java.lang.String paramString();
	      0  aload_0 [this]
	      1  getfield javax.swing.JTextArea.wrap : boolean [302]
	      4  ifeq 12
	      7  ldc <String "true"> [22]
	      9  goto 14
	     12  ldc <String "false"> [15]
	     14  astore_1
	     15  aload_0 [this]
	     16  getfield javax.swing.JTextArea.word : boolean [301]
	     19  ifeq 27
	     22  ldc <String "true"> [22]
	     24  goto 29
	     27  ldc <String "false"> [15]
	     29  astore_2
	     30  new java.lang.StringBuilder [181]
	     33  dup
	     34  invokespecial java.lang.StringBuilder() [314]
	     37  aload_0 [this]
	     38  invokespecial javax.swing.text.JTextComponent.paramString() : java.lang.String [350]
	     41  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     44  ldc <String ",colums="> [2]
	     46  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     49  aload_0 [this]
	     50  getfield javax.swing.JTextArea.columns : int [298]
	     53  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     56  ldc <String ",columWidth="> [1]
	     58  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     61  aload_0 [this]
	     62  getfield javax.swing.JTextArea.columnWidth : int [297]
	     65  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     68  ldc <String ",rows="> [4]
	     70  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     73  aload_0 [this]
	     74  getfield javax.swing.JTextArea.rows : int [300]
	     77  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     80  ldc <String ",rowHeight="> [3]
	     82  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     85  aload_0 [this]
	     86  getfield javax.swing.JTextArea.rowHeight : int [299]
	     89  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     92  ldc <String ",word="> [5]
	     94  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     97  aload_2
	     98  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    101  ldc <String ",wrap="> [6]
	    103  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    106  aload_1
	    107  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    110  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    113  areturn
	    Stack map table: number of frames 4
	        [pc: 12, same]
	        [pc: 14, same_locals_1_stack_item, stack: {java.lang.String}]
	        [pc: 27, append: {java.lang.String}]
	        [pc: 29, same_locals_1_stack_item, stack: {java.lang.String}]
	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getScrollableTracksViewportWidth();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.wrap : boolean [302]
	     4  ifeq 11
	     7  iconst_1
	     8  goto 15
	    11  aload_0 [this]
	    12  invokespecial javax.swing.text.JTextComponent.getScrollableTracksViewportWidth() : boolean [346]
	    15  ireturn
	    Stack map table: number of frames 2
	        [pc: 11, same]
	        [pc: 15, same_locals_1_stack_item, stack: {int}]
	  
	  // Method descriptor #195 ()Ljava/awt/Dimension;
	  // Stack: 4, Locals: 3
	  public java.awt.Dimension getPreferredScrollableViewportSize();
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent.getPreferredScrollableViewportSize() : java.awt.Dimension [347]
	      4  astore_1
	      5  aload_1
	      6  ifnonnull 25
	      9  new java.awt.Dimension [172]
	     12  dup
	     13  sipush 400
	     16  sipush 400
	     19  invokespecial java.awt.Dimension(int, int) [305]
	     22  goto 26
	     25  aload_1
	     26  astore_1
	     27  aload_0 [this]
	     28  invokevirtual javax.swing.JTextArea.getInsets() : java.awt.Insets [329]
	     31  astore_2
	     32  aload_1
	     33  aload_0 [this]
	     34  getfield javax.swing.JTextArea.columns : int [298]
	     37  ifne 47
	     40  aload_1
	     41  getfield java.awt.Dimension.width : int [292]
	     44  goto 66
	     47  aload_0 [this]
	     48  getfield javax.swing.JTextArea.columns : int [298]
	     51  aload_0 [this]
	     52  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	     55  imul
	     56  aload_2
	     57  getfield java.awt.Insets.left : int [294]
	     60  iadd
	     61  aload_2
	     62  getfield java.awt.Insets.right : int [295]
	     65  iadd
	     66  putfield java.awt.Dimension.width : int [292]
	     69  aload_1
	     70  aload_0 [this]
	     71  getfield javax.swing.JTextArea.rows : int [300]
	     74  ifne 84
	     77  aload_1
	     78  getfield java.awt.Dimension.height : int [291]
	     81  goto 103
	     84  aload_0 [this]
	     85  getfield javax.swing.JTextArea.rows : int [300]
	     88  aload_0 [this]
	     89  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	     92  imul
	     93  aload_2
	     94  getfield java.awt.Insets.top : int [296]
	     97  iadd
	     98  aload_2
	     99  getfield java.awt.Insets.bottom : int [293]
	    102  iadd
	    103  putfield java.awt.Dimension.height : int [291]
	    106  aload_1
	    107  areturn
	    Stack map table: number of frames 6
	        [pc: 25, append: {java.awt.Dimension}]
	        [pc: 26, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 47, full, stack: {java.awt.Dimension}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	        [pc: 66, full, stack: {java.awt.Dimension, int}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	        [pc: 84, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 103, full, stack: {java.awt.Dimension, int}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	  
	  // Method descriptor #199 (Ljava/awt/Rectangle;II)I
	  // Stack: 4, Locals: 4
	  public int getScrollableUnitIncrement(java.awt.Rectangle arg0, int arg1, int arg2);
	     0  iload_2 [arg1]
	     1  lookupswitch default: 38
	          case 0: 33
	          case 1: 28
	    28  aload_0 [this]
	    29  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	    32  ireturn
	    33  aload_0 [this]
	    34  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	    37  ireturn
	    38  new java.lang.IllegalArgumentException [177]
	    41  dup
	    42  new java.lang.StringBuilder [181]
	    45  dup
	    46  invokespecial java.lang.StringBuilder() [314]
	    49  ldc <String "Invalid orientation: "> [8]
	    51  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    54  iload_2 [arg1]
	    55  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	    58  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    61  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    64  athrow
	    Stack map table: number of frames 3
	        [pc: 28, same]
	        [pc: 33, same]
	        [pc: 38, same]
	  
	  // Method descriptor #33 (Ljava/io/ObjectOutputStream;)V
	  // Stack: 3, Locals: 3
	  private void writeObject(java.io.ObjectOutputStream arg0) throws java.io.IOException;
	     0  aload_1 [arg0]
	     1  invokevirtual java.io.ObjectOutputStream.defaultWriteObject() : void [308]
	     4  aload_0 [this]
	     5  invokevirtual javax.swing.JTextArea.getUIClassID() : java.lang.String [330]
	     8  ldc <String "TextAreaUI"> [11]
	    10  invokevirtual java.lang.String.equals(java.lang.Object) : boolean [313]
	    13  ifeq 50
	    16  aload_0 [this]
	    17  invokestatic javax.swing.JComponent.getWriteObjCounter(javax.swing.JComponent) : byte [320]
	    20  istore_2
	    21  aload_0 [this]
	    22  iload_2
	    23  iconst_1
	    24  isub
	    25  i2b
	    26  istore_2
	    27  iload_2
	    28  invokestatic javax.swing.JComponent.setWriteObjCounter(javax.swing.JComponent, byte) : void [321]
	    31  iload_2
	    32  ifne 50
	    35  aload_0 [this]
	    36  getfield javax.swing.JTextArea.ui : javax.swing.plaf.ComponentUI [304]
	    39  ifnull 50
	    42  aload_0 [this]
	    43  getfield javax.swing.JTextArea.ui : javax.swing.plaf.ComponentUI [304]
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.plaf.ComponentUI.installUI(javax.swing.JComponent) : void [341]
	    50  return
	    Stack map table: number of frames 1
	        [pc: 50, same]
	  
	  // Method descriptor #206 ()Ljavax/accessibility/AccessibleContext;
	  // Stack: 4, Locals: 1
	  public javax.accessibility.AccessibleContext getAccessibleContext();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	     4  ifnonnull 19
	     7  aload_0 [this]
	     8  new javax.swing.JTextArea$AccessibleJTextArea [184]
	    11  dup
	    12  aload_0 [this]
	    13  invokespecial javax.swing.JTextArea$AccessibleJTextArea(javax.swing.JTextArea) [339]
	    16  putfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	    19  aload_0 [this]
	    20  getfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	    23  areturn
	    Stack map table: number of frames 1
	        [pc: 19, same]

	  Inner classes:
	    [inner class info: #184 javax/swing/JTextArea$AccessibleJTextArea, outer class info: #183 javax/swing/JTextArea
	     inner name: #363 AccessibleJTextArea, accessflags: 4 protected]
	}//  (version 1.8 : 52.0, super bit)
public class javax.swing.JTextArea extends javax.swing.text.JTextComponent {
	  
	  // Field descriptor #53 Ljava/lang/String;
	  private static final java.lang.String uiClassID = "TextAreaUI";
	  
	  // Field descriptor #50 I
	  private int rows;
	  
	  // Field descriptor #50 I
	  private int columns;
	  
	  // Field descriptor #50 I
	  private int columnWidth;
	  
	  // Field descriptor #50 I
	  private int rowHeight;
	  
	  // Field descriptor #58 Z
	  private boolean wrap;
	  
	  // Field descriptor #58 Z
	  private boolean word;
	  
	  // Method descriptor #26 ()V
	  // Stack: 5, Locals: 1
	  public JTextArea();
	    0  aload_0 [this]
	    1  aconst_null
	    2  aconst_null
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #37 (Ljava/lang/String;)V
	  // Stack: 5, Locals: 2
	  public JTextArea(java.lang.String arg0);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aload_1 [arg0]
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #32 (II)V
	  // Stack: 5, Locals: 3
	  public JTextArea(int arg0, int arg1);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aconst_null
	    3  iload_1 [arg0]
	    4  iload_2 [arg1]
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #202 (Ljava/lang/String;II)V
	  // Stack: 5, Locals: 4
	  public JTextArea(java.lang.String arg0, int arg1, int arg2);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aload_1 [arg0]
	    3  iload_2 [arg1]
	    4  iload_3 [arg2]
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #212 (Ljavax/swing/text/Document;)V
	  // Stack: 5, Locals: 2
	  public JTextArea(javax.swing.text.Document arg0);
	    0  aload_0 [this]
	    1  aload_1 [arg0]
	    2  aconst_null
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #216 (Ljavax/swing/text/Document;Ljava/lang/String;II)V
	  // Stack: 4, Locals: 5
	  public JTextArea(javax.swing.text.Document arg0, java.lang.String arg1, int arg2, int arg3);
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent() [345]
	      4  aload_0 [this]
	      5  iload_3 [arg2]
	      6  putfield javax.swing.JTextArea.rows : int [300]
	      9  aload_0 [this]
	     10  iload 4 [arg3]
	     12  putfield javax.swing.JTextArea.columns : int [298]
	     15  aload_1 [arg0]
	     16  ifnonnull 24
	     19  aload_0 [this]
	     20  invokevirtual javax.swing.JTextArea.createDefaultModel() : javax.swing.text.Document [334]
	     23  astore_1 [arg0]
	     24  aload_0 [this]
	     25  aload_1 [arg0]
	     26  invokevirtual javax.swing.JTextArea.setDocument(javax.swing.text.Document) : void [336]
	     29  aload_2 [arg1]
	     30  ifnull 44
	     33  aload_0 [this]
	     34  aload_2 [arg1]
	     35  invokevirtual javax.swing.JTextArea.setText(java.lang.String) : void [331]
	     38  aload_0 [this]
	     39  iconst_0
	     40  iconst_0
	     41  invokevirtual javax.swing.JTextArea.select(int, int) : void [327]
	     44  iload_3 [arg2]
	     45  ifge 75
	     48  new java.lang.IllegalArgumentException [177]
	     51  dup
	     52  new java.lang.StringBuilder [181]
	     55  dup
	     56  invokespecial java.lang.StringBuilder() [314]
	     59  ldc <String "rows: "> [20]
	     61  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     64  iload_3 [arg2]
	     65  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     68  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	     71  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	     74  athrow
	     75  iload 4 [arg3]
	     77  ifge 108
	     80  new java.lang.IllegalArgumentException [177]
	     83  dup
	     84  new java.lang.StringBuilder [181]
	     87  dup
	     88  invokespecial java.lang.StringBuilder() [314]
	     91  ldc <String "columns: "> [13]
	     93  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     96  iload 4 [arg3]
	     98  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	    101  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    104  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    107  athrow
	    108  aload_0 [this]
	    109  ldc <String "focusTraversalKeysForward"> [17]
	    111  invokestatic javax.swing.JComponent.getManagingFocusForwardTraversalKeys() : java.util.Set [319]
	    114  invokestatic javax.swing.LookAndFeel.installProperty(javax.swing.JComponent, java.lang.String, java.lang.Object) : void [340]
	    117  aload_0 [this]
	    118  ldc <String "focusTraversalKeysBackward"> [16]
	    120  invokestatic javax.swing.JComponent.getManagingFocusBackwardTraversalKeys() : java.util.Set [318]
	    123  invokestatic javax.swing.LookAndFeel.installProperty(javax.swing.JComponent, java.lang.String, java.lang.Object) : void [340]
	    126  return
	    Stack map table: number of frames 4
	        [pc: 24, full, stack: {}, locals: {javax.swing.JTextArea, javax.swing.text.Document, java.lang.String, int, int}]
	        [pc: 44, same]
	        [pc: 75, same]
	        [pc: 108, same]
	  
	  // Method descriptor #25 ()Ljava/lang/String;
	  // Stack: 1, Locals: 1
	  public java.lang.String getUIClassID();
	    0  ldc <String "TextAreaUI"> [11]
	    2  areturn

	  
	  // Method descriptor #211 ()Ljavax/swing/text/Document;
	  // Stack: 2, Locals: 1
	  protected javax.swing.text.Document createDefaultModel();
	    0  new javax.swing.text.PlainDocument [192]
	    3  dup
	    4  invokespecial javax.swing.text.PlainDocument() [351]
	    7  areturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 4, Locals: 4
	  public void setTabSize(int arg0);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  aload_2
	     6  ifnull 34
	     9  aload_0 [this]
	    10  invokevirtual javax.swing.JTextArea.getTabSize() : int [325]
	    13  istore_3
	    14  aload_2
	    15  ldc <String "tabSize"> [21]
	    17  iload_1 [arg0]
	    18  invokestatic java.lang.Integer.valueOf(int) : java.lang.Integer [311]
	    21  invokeinterface javax.swing.text.Document.putProperty(java.lang.Object, java.lang.Object) : void [356] [nargs: 3]
	    26  aload_0 [this]
	    27  ldc <String "tabSize"> [21]
	    29  iload_3
	    30  iload_1 [arg0]
	    31  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, int, int) : void [332]
	    34  return
	    Stack map table: number of frames 1
	        [pc: 34, append: {javax.swing.text.Document}]
	  
	  // Method descriptor #24 ()I
	  // Stack: 2, Locals: 4
	  public int getTabSize();
	     0  bipush 8
	     2  istore_1
	     3  aload_0 [this]
	     4  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     7  astore_2
	     8  aload_2
	     9  ifnull 33
	    12  aload_2
	    13  ldc <String "tabSize"> [21]
	    15  invokeinterface javax.swing.text.Document.getProperty(java.lang.Object) : java.lang.Object [355] [nargs: 2]
	    20  checkcast java.lang.Integer [178]
	    23  astore_3
	    24  aload_3
	    25  ifnull 33
	    28  aload_3
	    29  invokevirtual java.lang.Integer.intValue() : int [310]
	    32  istore_1
	    33  iload_1
	    34  ireturn
	    Stack map table: number of frames 1
	        [pc: 33, append: {int, javax.swing.text.Document}]
	  
	  // Method descriptor #38 (Z)V
	  // Stack: 4, Locals: 3
	  public void setLineWrap(boolean arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.wrap : boolean [302]
	     4  istore_2
	     5  aload_0 [this]
	     6  iload_1 [arg0]
	     7  putfield javax.swing.JTextArea.wrap : boolean [302]
	    10  aload_0 [this]
	    11  ldc <String "lineWrap"> [18]
	    13  iload_2
	    14  iload_1 [arg0]
	    15  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, boolean, boolean) : void [333]
	    18  return

	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getLineWrap();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.wrap : boolean [302]
	    4  ireturn

	  
	  // Method descriptor #38 (Z)V
	  // Stack: 4, Locals: 3
	  public void setWrapStyleWord(boolean arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.word : boolean [301]
	     4  istore_2
	     5  aload_0 [this]
	     6  iload_1 [arg0]
	     7  putfield javax.swing.JTextArea.word : boolean [301]
	    10  aload_0 [this]
	    11  ldc <String "wrapStyleWord"> [23]
	    13  iload_2
	    14  iload_1 [arg0]
	    15  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, boolean, boolean) : void [333]
	    18  return

	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getWrapStyleWord();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.word : boolean [301]
	    4  ireturn

	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 4
	  public int getLineOfOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Can't translate offset to line"> [7]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  aload_2
	    22  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    27  if_icmple 48
	    30  new javax.swing.text.BadLocationException [188]
	    33  dup
	    34  ldc <String "Can't translate offset to line"> [7]
	    36  aload_2
	    37  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    42  iconst_1
	    43  iadd
	    44  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    47  athrow
	    48  aload_0 [this]
	    49  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    52  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    57  astore_3
	    58  aload_3
	    59  iload_1 [arg0]
	    60  invokeinterface javax.swing.text.Element.getElementIndex(int) : int [361] [nargs: 2]
	    65  ireturn
	    Stack map table: number of frames 2
	        [pc: 20, append: {javax.swing.text.Document}]
	        [pc: 48, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 2
	  public int getLineCount();
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	     9  astore_1
	    10  aload_1
	    11  invokeinterface javax.swing.text.Element.getElementCount() : int [358] [nargs: 1]
	    16  ireturn

	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 5
	  public int getLineStartOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getLineCount() : int [323]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Negative line"> [9]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  iload_2
	    22  if_icmplt 46
	    25  new javax.swing.text.BadLocationException [188]
	    28  dup
	    29  ldc <String "No such line"> [10]
	    31  aload_0 [this]
	    32  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    35  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    40  iconst_1
	    41  iadd
	    42  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    45  athrow
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    50  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    55  astore_3
	    56  aload_3
	    57  iload_1 [arg0]
	    58  invokeinterface javax.swing.text.Element.getElement(int) : javax.swing.text.Element [362] [nargs: 2]
	    63  astore 4
	    65  aload 4
	    67  invokeinterface javax.swing.text.Element.getStartOffset() : int [360] [nargs: 1]
	    72  ireturn
	    Stack map table: number of frames 2
	        [pc: 20, append: {int}]
	        [pc: 46, same]
	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 6
	  public int getLineEndOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getLineCount() : int [323]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Negative line"> [9]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  iload_2
	    22  if_icmplt 46
	    25  new javax.swing.text.BadLocationException [188]
	    28  dup
	    29  ldc <String "No such line"> [10]
	    31  aload_0 [this]
	    32  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    35  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    40  iconst_1
	    41  iadd
	    42  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    45  athrow
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    50  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    55  astore_3
	    56  aload_3
	    57  iload_1 [arg0]
	    58  invokeinterface javax.swing.text.Element.getElement(int) : javax.swing.text.Element [362] [nargs: 2]
	    63  astore 4
	    65  aload 4
	    67  invokeinterface javax.swing.text.Element.getEndOffset() : int [359] [nargs: 1]
	    72  istore 5
	    74  iload_1 [arg0]
	    75  iload_2
	    76  iconst_1
	    77  isub
	    78  if_icmpne 88
	    81  iload 5
	    83  iconst_1
	    84  isub
	    85  goto 90
	    88  iload 5
	    90  ireturn
	    Stack map table: number of frames 4
	        [pc: 20, append: {int}]
	        [pc: 46, same]
	        [pc: 88, append: {javax.swing.text.Element, javax.swing.text.Element, int}]
	        [pc: 90, same_locals_1_stack_item, stack: {int}]
	  
	  // Method descriptor #201 (Ljava/lang/String;I)V
	  // Stack: 4, Locals: 5
	  public void insert(java.lang.String arg0, int arg1);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_3
	     5  aload_3
	     6  ifnull 36
	     9  aload_3
	    10  iload_2 [arg1]
	    11  aload_1 [arg0]
	    12  aconst_null
	    13  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    18  goto 36
	    21  astore 4
	    23  new java.lang.IllegalArgumentException [177]
	    26  dup
	    27  aload 4
	    29  invokevirtual javax.swing.text.BadLocationException.getMessage() : java.lang.String [343]
	    32  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    35  athrow
	    36  return
	      Exception Table:
	        [pc: 9, pc: 18] -> 21 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 2
	        [pc: 21, full, stack: {javax.swing.text.BadLocationException}, locals: {javax.swing.JTextArea, java.lang.String, int, javax.swing.text.Document}]
	        [pc: 36, same]
	  
	  // Method descriptor #37 (Ljava/lang/String;)V
	  // Stack: 4, Locals: 4
	  public void append(java.lang.String arg0);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  aload_2
	     6  ifnull 27
	     9  aload_2
	    10  aload_2
	    11  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    16  aload_1 [arg0]
	    17  aconst_null
	    18  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    23  goto 27
	    26  astore_3
	    27  return
	      Exception Table:
	        [pc: 9, pc: 23] -> 26 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 2
	        [pc: 26, full, stack: {javax.swing.text.BadLocationException}, locals: {javax.swing.JTextArea, java.lang.String, javax.swing.text.Document}]
	        [pc: 27, same]
	  
	  // Method descriptor #202 (Ljava/lang/String;II)V
	  // Stack: 5, Locals: 6
	  public void replaceRange(java.lang.String arg0, int arg1, int arg2);
	     0  iload_3 [arg2]
	     1  iload_2 [arg1]
	     2  if_icmpge 15
	     5  new java.lang.IllegalArgumentException [177]
	     8  dup
	     9  ldc <String "end before start"> [14]
	    11  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    14  athrow
	    15  aload_0 [this]
	    16  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    19  astore 4
	    21  aload 4
	    23  ifnull 90
	    26  aload 4
	    28  instanceof javax.swing.text.AbstractDocument [187]
	    31  ifeq 51
	    34  aload 4
	    36  checkcast javax.swing.text.AbstractDocument [187]
	    39  iload_2 [arg1]
	    40  iload_3 [arg2]
	    41  iload_2 [arg1]
	    42  isub
	    43  aload_1 [arg0]
	    44  aconst_null
	    45  invokevirtual javax.swing.text.AbstractDocument.replace(int, int, java.lang.String, javax.swing.text.AttributeSet) : void [342]
	    48  goto 72
	    51  aload 4
	    53  iload_2 [arg1]
	    54  iload_3 [arg2]
	    55  iload_2 [arg1]
	    56  isub
	    57  invokeinterface javax.swing.text.Document.remove(int, int) : void [353] [nargs: 3]
	    62  aload 4
	    64  iload_2 [arg1]
	    65  aload_1 [arg0]
	    66  aconst_null
	    67  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    72  goto 90
	    75  astore 5
	    77  new java.lang.IllegalArgumentException [177]
	    80  dup
	    81  aload 5
	    83  invokevirtual javax.swing.text.BadLocationException.getMessage() : java.lang.String [343]
	    86  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    89  athrow
	    90  return
	      Exception Table:
	        [pc: 26, pc: 72] -> 75 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 5
	        [pc: 15, same]
	        [pc: 51, append: {javax.swing.text.Document}]
	        [pc: 72, same]
	        [pc: 75, same_locals_1_stack_item, stack: {javax.swing.text.BadLocationException}]
	        [pc: 90, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 1
	  public int getRows();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.rows : int [300]
	    4  ireturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 3, Locals: 3
	  public void setRows(int arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.rows : int [300]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 19
	     9  new java.lang.IllegalArgumentException [177]
	    12  dup
	    13  ldc <String "rows less than zero."> [19]
	    15  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    18  athrow
	    19  iload_1 [arg0]
	    20  iload_2
	    21  if_icmpeq 33
	    24  aload_0 [this]
	    25  iload_1 [arg0]
	    26  putfield javax.swing.JTextArea.rows : int [300]
	    29  aload_0 [this]
	    30  invokevirtual javax.swing.JTextArea.invalidate() : void [326]
	    33  return
	    Stack map table: number of frames 2
	        [pc: 19, append: {int}]
	        [pc: 33, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 2, Locals: 2
	  protected int getRowHeight();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.rowHeight : int [299]
	     4  ifne 24
	     7  aload_0 [this]
	     8  aload_0 [this]
	     9  invokevirtual javax.swing.JTextArea.getFont() : java.awt.Font [328]
	    12  invokevirtual javax.swing.JTextArea.getFontMetrics(java.awt.Font) : java.awt.FontMetrics [337]
	    15  astore_1
	    16  aload_0 [this]
	    17  aload_1
	    18  invokevirtual java.awt.FontMetrics.getHeight() : int [306]
	    21  putfield javax.swing.JTextArea.rowHeight : int [299]
	    24  aload_0 [this]
	    25  getfield javax.swing.JTextArea.rowHeight : int [299]
	    28  ireturn
	    Stack map table: number of frames 1
	        [pc: 24, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 1
	  public int getColumns();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.columns : int [298]
	    4  ireturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 3, Locals: 3
	  public void setColumns(int arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.columns : int [298]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 19
	     9  new java.lang.IllegalArgumentException [177]
	    12  dup
	    13  ldc <String "columns less than zero."> [12]
	    15  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    18  athrow
	    19  iload_1 [arg0]
	    20  iload_2
	    21  if_icmpeq 33
	    24  aload_0 [this]
	    25  iload_1 [arg0]
	    26  putfield javax.swing.JTextArea.columns : int [298]
	    29  aload_0 [this]
	    30  invokevirtual javax.swing.JTextArea.invalidate() : void [326]
	    33  return
	    Stack map table: number of frames 2
	        [pc: 19, append: {int}]
	        [pc: 33, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 3, Locals: 2
	  protected int getColumnWidth();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.columnWidth : int [297]
	     4  ifne 26
	     7  aload_0 [this]
	     8  aload_0 [this]
	     9  invokevirtual javax.swing.JTextArea.getFont() : java.awt.Font [328]
	    12  invokevirtual javax.swing.JTextArea.getFontMetrics(java.awt.Font) : java.awt.FontMetrics [337]
	    15  astore_1
	    16  aload_0 [this]
	    17  aload_1
	    18  bipush 109
	    20  invokevirtual java.awt.FontMetrics.charWidth(char) : int [307]
	    23  putfield javax.swing.JTextArea.columnWidth : int [297]
	    26  aload_0 [this]
	    27  getfield javax.swing.JTextArea.columnWidth : int [297]
	    30  ireturn
	    Stack map table: number of frames 1
	        [pc: 26, same]
	  
	  // Method descriptor #195 ()Ljava/awt/Dimension;
	  // Stack: 4, Locals: 3
	  public java.awt.Dimension getPreferredSize();
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent.getPreferredSize() : java.awt.Dimension [348]
	      4  astore_1
	      5  aload_1
	      6  ifnonnull 25
	      9  new java.awt.Dimension [172]
	     12  dup
	     13  sipush 400
	     16  sipush 400
	     19  invokespecial java.awt.Dimension(int, int) [305]
	     22  goto 26
	     25  aload_1
	     26  astore_1
	     27  aload_0 [this]
	     28  invokevirtual javax.swing.JTextArea.getInsets() : java.awt.Insets [329]
	     31  astore_2
	     32  aload_0 [this]
	     33  getfield javax.swing.JTextArea.columns : int [298]
	     36  ifeq 69
	     39  aload_1
	     40  aload_1
	     41  getfield java.awt.Dimension.width : int [292]
	     44  aload_0 [this]
	     45  getfield javax.swing.JTextArea.columns : int [298]
	     48  aload_0 [this]
	     49  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	     52  imul
	     53  aload_2
	     54  getfield java.awt.Insets.left : int [294]
	     57  iadd
	     58  aload_2
	     59  getfield java.awt.Insets.right : int [295]
	     62  iadd
	     63  invokestatic java.lang.Math.max(int, int) : int [312]
	     66  putfield java.awt.Dimension.width : int [292]
	     69  aload_0 [this]
	     70  getfield javax.swing.JTextArea.rows : int [300]
	     73  ifeq 106
	     76  aload_1
	     77  aload_1
	     78  getfield java.awt.Dimension.height : int [291]
	     81  aload_0 [this]
	     82  getfield javax.swing.JTextArea.rows : int [300]
	     85  aload_0 [this]
	     86  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	     89  imul
	     90  aload_2
	     91  getfield java.awt.Insets.top : int [296]
	     94  iadd
	     95  aload_2
	     96  getfield java.awt.Insets.bottom : int [293]
	     99  iadd
	    100  invokestatic java.lang.Math.max(int, int) : int [312]
	    103  putfield java.awt.Dimension.height : int [291]
	    106  aload_1
	    107  areturn
	    Stack map table: number of frames 4
	        [pc: 25, append: {java.awt.Dimension}]
	        [pc: 26, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 69, append: {java.awt.Insets}]
	        [pc: 106, same]
	  
	  // Method descriptor #197 (Ljava/awt/Font;)V
	  // Stack: 2, Locals: 2
	  public void setFont(java.awt.Font arg0);
	     0  aload_0 [this]
	     1  aload_1 [arg0]
	     2  invokespecial javax.swing.text.JTextComponent.setFont(java.awt.Font) : void [349]
	     5  aload_0 [this]
	     6  iconst_0
	     7  putfield javax.swing.JTextArea.rowHeight : int [299]
	    10  aload_0 [this]
	    11  iconst_0
	    12  putfield javax.swing.JTextArea.columnWidth : int [297]
	    15  return

	  
	  // Method descriptor #25 ()Ljava/lang/String;
	  // Stack: 2, Locals: 3
	  protected java.lang.String paramString();
	      0  aload_0 [this]
	      1  getfield javax.swing.JTextArea.wrap : boolean [302]
	      4  ifeq 12
	      7  ldc <String "true"> [22]
	      9  goto 14
	     12  ldc <String "false"> [15]
	     14  astore_1
	     15  aload_0 [this]
	     16  getfield javax.swing.JTextArea.word : boolean [301]
	     19  ifeq 27
	     22  ldc <String "true"> [22]
	     24  goto 29
	     27  ldc <String "false"> [15]
	     29  astore_2
	     30  new java.lang.StringBuilder [181]
	     33  dup
	     34  invokespecial java.lang.StringBuilder() [314]
	     37  aload_0 [this]
	     38  invokespecial javax.swing.text.JTextComponent.paramString() : java.lang.String [350]
	     41  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     44  ldc <String ",colums="> [2]
	     46  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     49  aload_0 [this]
	     50  getfield javax.swing.JTextArea.columns : int [298]
	     53  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     56  ldc <String ",columWidth="> [1]
	     58  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     61  aload_0 [this]
	     62  getfield javax.swing.JTextArea.columnWidth : int [297]
	     65  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     68  ldc <String ",rows="> [4]
	     70  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     73  aload_0 [this]
	     74  getfield javax.swing.JTextArea.rows : int [300]
	     77  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     80  ldc <String ",rowHeight="> [3]
	     82  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     85  aload_0 [this]
	     86  getfield javax.swing.JTextArea.rowHeight : int [299]
	     89  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     92  ldc <String ",word="> [5]
	     94  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     97  aload_2
	     98  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    101  ldc <String ",wrap="> [6]
	    103  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    106  aload_1
	    107  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    110  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    113  areturn
	    Stack map table: number of frames 4
	        [pc: 12, same]
	        [pc: 14, same_locals_1_stack_item, stack: {java.lang.String}]
	        [pc: 27, append: {java.lang.String}]
	        [pc: 29, same_locals_1_stack_item, stack: {java.lang.String}]
	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getScrollableTracksViewportWidth();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.wrap : boolean [302]
	     4  ifeq 11
	     7  iconst_1
	     8  goto 15
	    11  aload_0 [this]
	    12  invokespecial javax.swing.text.JTextComponent.getScrollableTracksViewportWidth() : boolean [346]
	    15  ireturn
	    Stack map table: number of frames 2
	        [pc: 11, same]
	        [pc: 15, same_locals_1_stack_item, stack: {int}]
	  
	  // Method descriptor #195 ()Ljava/awt/Dimension;
	  // Stack: 4, Locals: 3
	  public java.awt.Dimension getPreferredScrollableViewportSize();
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent.getPreferredScrollableViewportSize() : java.awt.Dimension [347]
	      4  astore_1
	      5  aload_1
	      6  ifnonnull 25
	      9  new java.awt.Dimension [172]
	     12  dup
	     13  sipush 400
	     16  sipush 400
	     19  invokespecial java.awt.Dimension(int, int) [305]
	     22  goto 26
	     25  aload_1
	     26  astore_1
	     27  aload_0 [this]
	     28  invokevirtual javax.swing.JTextArea.getInsets() : java.awt.Insets [329]
	     31  astore_2
	     32  aload_1
	     33  aload_0 [this]
	     34  getfield javax.swing.JTextArea.columns : int [298]
	     37  ifne 47
	     40  aload_1
	     41  getfield java.awt.Dimension.width : int [292]
	     44  goto 66
	     47  aload_0 [this]
	     48  getfield javax.swing.JTextArea.columns : int [298]
	     51  aload_0 [this]
	     52  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	     55  imul
	     56  aload_2
	     57  getfield java.awt.Insets.left : int [294]
	     60  iadd
	     61  aload_2
	     62  getfield java.awt.Insets.right : int [295]
	     65  iadd
	     66  putfield java.awt.Dimension.width : int [292]
	     69  aload_1
	     70  aload_0 [this]
	     71  getfield javax.swing.JTextArea.rows : int [300]
	     74  ifne 84
	     77  aload_1
	     78  getfield java.awt.Dimension.height : int [291]
	     81  goto 103
	     84  aload_0 [this]
	     85  getfield javax.swing.JTextArea.rows : int [300]
	     88  aload_0 [this]
	     89  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	     92  imul
	     93  aload_2
	     94  getfield java.awt.Insets.top : int [296]
	     97  iadd
	     98  aload_2
	     99  getfield java.awt.Insets.bottom : int [293]
	    102  iadd
	    103  putfield java.awt.Dimension.height : int [291]
	    106  aload_1
	    107  areturn
	    Stack map table: number of frames 6
	        [pc: 25, append: {java.awt.Dimension}]
	        [pc: 26, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 47, full, stack: {java.awt.Dimension}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	        [pc: 66, full, stack: {java.awt.Dimension, int}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	        [pc: 84, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 103, full, stack: {java.awt.Dimension, int}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	  
	  // Method descriptor #199 (Ljava/awt/Rectangle;II)I
	  // Stack: 4, Locals: 4
	  public int getScrollableUnitIncrement(java.awt.Rectangle arg0, int arg1, int arg2);
	     0  iload_2 [arg1]
	     1  lookupswitch default: 38
	          case 0: 33
	          case 1: 28
	    28  aload_0 [this]
	    29  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	    32  ireturn
	    33  aload_0 [this]
	    34  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	    37  ireturn
	    38  new java.lang.IllegalArgumentException [177]
	    41  dup
	    42  new java.lang.StringBuilder [181]
	    45  dup
	    46  invokespecial java.lang.StringBuilder() [314]
	    49  ldc <String "Invalid orientation: "> [8]
	    51  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    54  iload_2 [arg1]
	    55  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	    58  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    61  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    64  athrow
	    Stack map table: number of frames 3
	        [pc: 28, same]
	        [pc: 33, same]
	        [pc: 38, same]
	  
	  // Method descriptor #33 (Ljava/io/ObjectOutputStream;)V
	  // Stack: 3, Locals: 3
	  private void writeObject(java.io.ObjectOutputStream arg0) throws java.io.IOException;
	     0  aload_1 [arg0]
	     1  invokevirtual java.io.ObjectOutputStream.defaultWriteObject() : void [308]
	     4  aload_0 [this]
	     5  invokevirtual javax.swing.JTextArea.getUIClassID() : java.lang.String [330]
	     8  ldc <String "TextAreaUI"> [11]
	    10  invokevirtual java.lang.String.equals(java.lang.Object) : boolean [313]
	    13  ifeq 50
	    16  aload_0 [this]
	    17  invokestatic javax.swing.JComponent.getWriteObjCounter(javax.swing.JComponent) : byte [320]
	    20  istore_2
	    21  aload_0 [this]
	    22  iload_2
	    23  iconst_1
	    24  isub
	    25  i2b
	    26  istore_2
	    27  iload_2
	    28  invokestatic javax.swing.JComponent.setWriteObjCounter(javax.swing.JComponent, byte) : void [321]
	    31  iload_2
	    32  ifne 50
	    35  aload_0 [this]
	    36  getfield javax.swing.JTextArea.ui : javax.swing.plaf.ComponentUI [304]
	    39  ifnull 50
	    42  aload_0 [this]
	    43  getfield javax.swing.JTextArea.ui : javax.swing.plaf.ComponentUI [304]
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.plaf.ComponentUI.installUI(javax.swing.JComponent) : void [341]
	    50  return
	    Stack map table: number of frames 1
	        [pc: 50, same]
	  
	  // Method descriptor #206 ()Ljavax/accessibility/AccessibleContext;
	  // Stack: 4, Locals: 1
	  public javax.accessibility.AccessibleContext getAccessibleContext();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	     4  ifnonnull 19
	     7  aload_0 [this]
	     8  new javax.swing.JTextArea$AccessibleJTextArea [184]
	    11  dup
	    12  aload_0 [this]
	    13  invokespecial javax.swing.JTextArea$AccessibleJTextArea(javax.swing.JTextArea) [339]
	    16  putfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	    19  aload_0 [this]
	    20  getfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	    23  areturn
	    Stack map table: number of frames 1
	        [pc: 19, same]

	  Inner classes:
	    [inner class info: #184 javax/swing/JTextArea$AccessibleJTextArea, outer class info: #183 javax/swing/JTextArea
	     inner name: #363 AccessibleJTextArea, accessflags: 4 protected]
	}//  (version 1.8 : 52.0, super bit)
public class javax.swing.JTextArea extends javax.swing.text.JTextComponent {
	  
	  // Field descriptor #53 Ljava/lang/String;
	  private static final java.lang.String uiClassID = "TextAreaUI";
	  
	  // Field descriptor #50 I
	  private int rows;
	  
	  // Field descriptor #50 I
	  private int columns;
	  
	  // Field descriptor #50 I
	  private int columnWidth;
	  
	  // Field descriptor #50 I
	  private int rowHeight;
	  
	  // Field descriptor #58 Z
	  private boolean wrap;
	  
	  // Field descriptor #58 Z
	  private boolean word;
	  
	  // Method descriptor #26 ()V
	  // Stack: 5, Locals: 1
	  public JTextArea();
	    0  aload_0 [this]
	    1  aconst_null
	    2  aconst_null
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #37 (Ljava/lang/String;)V
	  // Stack: 5, Locals: 2
	  public JTextArea(java.lang.String arg0);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aload_1 [arg0]
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #32 (II)V
	  // Stack: 5, Locals: 3
	  public JTextArea(int arg0, int arg1);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aconst_null
	    3  iload_1 [arg0]
	    4  iload_2 [arg1]
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #202 (Ljava/lang/String;II)V
	  // Stack: 5, Locals: 4
	  public JTextArea(java.lang.String arg0, int arg1, int arg2);
	    0  aload_0 [this]
	    1  aconst_null
	    2  aload_1 [arg0]
	    3  iload_2 [arg1]
	    4  iload_3 [arg2]
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #212 (Ljavax/swing/text/Document;)V
	  // Stack: 5, Locals: 2
	  public JTextArea(javax.swing.text.Document arg0);
	    0  aload_0 [this]
	    1  aload_1 [arg0]
	    2  aconst_null
	    3  iconst_0
	    4  iconst_0
	    5  invokespecial javax.swing.JTextArea(javax.swing.text.Document, java.lang.String, int, int) [338]
	    8  return

	  
	  // Method descriptor #216 (Ljavax/swing/text/Document;Ljava/lang/String;II)V
	  // Stack: 4, Locals: 5
	  public JTextArea(javax.swing.text.Document arg0, java.lang.String arg1, int arg2, int arg3);
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent() [345]
	      4  aload_0 [this]
	      5  iload_3 [arg2]
	      6  putfield javax.swing.JTextArea.rows : int [300]
	      9  aload_0 [this]
	     10  iload 4 [arg3]
	     12  putfield javax.swing.JTextArea.columns : int [298]
	     15  aload_1 [arg0]
	     16  ifnonnull 24
	     19  aload_0 [this]
	     20  invokevirtual javax.swing.JTextArea.createDefaultModel() : javax.swing.text.Document [334]
	     23  astore_1 [arg0]
	     24  aload_0 [this]
	     25  aload_1 [arg0]
	     26  invokevirtual javax.swing.JTextArea.setDocument(javax.swing.text.Document) : void [336]
	     29  aload_2 [arg1]
	     30  ifnull 44
	     33  aload_0 [this]
	     34  aload_2 [arg1]
	     35  invokevirtual javax.swing.JTextArea.setText(java.lang.String) : void [331]
	     38  aload_0 [this]
	     39  iconst_0
	     40  iconst_0
	     41  invokevirtual javax.swing.JTextArea.select(int, int) : void [327]
	     44  iload_3 [arg2]
	     45  ifge 75
	     48  new java.lang.IllegalArgumentException [177]
	     51  dup
	     52  new java.lang.StringBuilder [181]
	     55  dup
	     56  invokespecial java.lang.StringBuilder() [314]
	     59  ldc <String "rows: "> [20]
	     61  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     64  iload_3 [arg2]
	     65  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     68  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	     71  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	     74  athrow
	     75  iload 4 [arg3]
	     77  ifge 108
	     80  new java.lang.IllegalArgumentException [177]
	     83  dup
	     84  new java.lang.StringBuilder [181]
	     87  dup
	     88  invokespecial java.lang.StringBuilder() [314]
	     91  ldc <String "columns: "> [13]
	     93  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     96  iload 4 [arg3]
	     98  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	    101  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    104  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    107  athrow
	    108  aload_0 [this]
	    109  ldc <String "focusTraversalKeysForward"> [17]
	    111  invokestatic javax.swing.JComponent.getManagingFocusForwardTraversalKeys() : java.util.Set [319]
	    114  invokestatic javax.swing.LookAndFeel.installProperty(javax.swing.JComponent, java.lang.String, java.lang.Object) : void [340]
	    117  aload_0 [this]
	    118  ldc <String "focusTraversalKeysBackward"> [16]
	    120  invokestatic javax.swing.JComponent.getManagingFocusBackwardTraversalKeys() : java.util.Set [318]
	    123  invokestatic javax.swing.LookAndFeel.installProperty(javax.swing.JComponent, java.lang.String, java.lang.Object) : void [340]
	    126  return
	    Stack map table: number of frames 4
	        [pc: 24, full, stack: {}, locals: {javax.swing.JTextArea, javax.swing.text.Document, java.lang.String, int, int}]
	        [pc: 44, same]
	        [pc: 75, same]
	        [pc: 108, same]
	  
	  // Method descriptor #25 ()Ljava/lang/String;
	  // Stack: 1, Locals: 1
	  public java.lang.String getUIClassID();
	    0  ldc <String "TextAreaUI"> [11]
	    2  areturn

	  
	  // Method descriptor #211 ()Ljavax/swing/text/Document;
	  // Stack: 2, Locals: 1
	  protected javax.swing.text.Document createDefaultModel();
	    0  new javax.swing.text.PlainDocument [192]
	    3  dup
	    4  invokespecial javax.swing.text.PlainDocument() [351]
	    7  areturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 4, Locals: 4
	  public void setTabSize(int arg0);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  aload_2
	     6  ifnull 34
	     9  aload_0 [this]
	    10  invokevirtual javax.swing.JTextArea.getTabSize() : int [325]
	    13  istore_3
	    14  aload_2
	    15  ldc <String "tabSize"> [21]
	    17  iload_1 [arg0]
	    18  invokestatic java.lang.Integer.valueOf(int) : java.lang.Integer [311]
	    21  invokeinterface javax.swing.text.Document.putProperty(java.lang.Object, java.lang.Object) : void [356] [nargs: 3]
	    26  aload_0 [this]
	    27  ldc <String "tabSize"> [21]
	    29  iload_3
	    30  iload_1 [arg0]
	    31  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, int, int) : void [332]
	    34  return
	    Stack map table: number of frames 1
	        [pc: 34, append: {javax.swing.text.Document}]
	  
	  // Method descriptor #24 ()I
	  // Stack: 2, Locals: 4
	  public int getTabSize();
	     0  bipush 8
	     2  istore_1
	     3  aload_0 [this]
	     4  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     7  astore_2
	     8  aload_2
	     9  ifnull 33
	    12  aload_2
	    13  ldc <String "tabSize"> [21]
	    15  invokeinterface javax.swing.text.Document.getProperty(java.lang.Object) : java.lang.Object [355] [nargs: 2]
	    20  checkcast java.lang.Integer [178]
	    23  astore_3
	    24  aload_3
	    25  ifnull 33
	    28  aload_3
	    29  invokevirtual java.lang.Integer.intValue() : int [310]
	    32  istore_1
	    33  iload_1
	    34  ireturn
	    Stack map table: number of frames 1
	        [pc: 33, append: {int, javax.swing.text.Document}]
	  
	  // Method descriptor #38 (Z)V
	  // Stack: 4, Locals: 3
	  public void setLineWrap(boolean arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.wrap : boolean [302]
	     4  istore_2
	     5  aload_0 [this]
	     6  iload_1 [arg0]
	     7  putfield javax.swing.JTextArea.wrap : boolean [302]
	    10  aload_0 [this]
	    11  ldc <String "lineWrap"> [18]
	    13  iload_2
	    14  iload_1 [arg0]
	    15  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, boolean, boolean) : void [333]
	    18  return

	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getLineWrap();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.wrap : boolean [302]
	    4  ireturn

	  
	  // Method descriptor #38 (Z)V
	  // Stack: 4, Locals: 3
	  public void setWrapStyleWord(boolean arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.word : boolean [301]
	     4  istore_2
	     5  aload_0 [this]
	     6  iload_1 [arg0]
	     7  putfield javax.swing.JTextArea.word : boolean [301]
	    10  aload_0 [this]
	    11  ldc <String "wrapStyleWord"> [23]
	    13  iload_2
	    14  iload_1 [arg0]
	    15  invokevirtual javax.swing.JTextArea.firePropertyChange(java.lang.String, boolean, boolean) : void [333]
	    18  return

	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getWrapStyleWord();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.word : boolean [301]
	    4  ireturn

	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 4
	  public int getLineOfOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Can't translate offset to line"> [7]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  aload_2
	    22  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    27  if_icmple 48
	    30  new javax.swing.text.BadLocationException [188]
	    33  dup
	    34  ldc <String "Can't translate offset to line"> [7]
	    36  aload_2
	    37  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    42  iconst_1
	    43  iadd
	    44  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    47  athrow
	    48  aload_0 [this]
	    49  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    52  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    57  astore_3
	    58  aload_3
	    59  iload_1 [arg0]
	    60  invokeinterface javax.swing.text.Element.getElementIndex(int) : int [361] [nargs: 2]
	    65  ireturn
	    Stack map table: number of frames 2
	        [pc: 20, append: {javax.swing.text.Document}]
	        [pc: 48, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 2
	  public int getLineCount();
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	     9  astore_1
	    10  aload_1
	    11  invokeinterface javax.swing.text.Element.getElementCount() : int [358] [nargs: 1]
	    16  ireturn

	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 5
	  public int getLineStartOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getLineCount() : int [323]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Negative line"> [9]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  iload_2
	    22  if_icmplt 46
	    25  new javax.swing.text.BadLocationException [188]
	    28  dup
	    29  ldc <String "No such line"> [10]
	    31  aload_0 [this]
	    32  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    35  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    40  iconst_1
	    41  iadd
	    42  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    45  athrow
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    50  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    55  astore_3
	    56  aload_3
	    57  iload_1 [arg0]
	    58  invokeinterface javax.swing.text.Element.getElement(int) : javax.swing.text.Element [362] [nargs: 2]
	    63  astore 4
	    65  aload 4
	    67  invokeinterface javax.swing.text.Element.getStartOffset() : int [360] [nargs: 1]
	    72  ireturn
	    Stack map table: number of frames 2
	        [pc: 20, append: {int}]
	        [pc: 46, same]
	  
	  // Method descriptor #29 (I)I
	  // Stack: 5, Locals: 6
	  public int getLineEndOffset(int arg0) throws javax.swing.text.BadLocationException;
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getLineCount() : int [323]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 20
	     9  new javax.swing.text.BadLocationException [188]
	    12  dup
	    13  ldc <String "Negative line"> [9]
	    15  iconst_m1
	    16  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    19  athrow
	    20  iload_1 [arg0]
	    21  iload_2
	    22  if_icmplt 46
	    25  new javax.swing.text.BadLocationException [188]
	    28  dup
	    29  ldc <String "No such line"> [10]
	    31  aload_0 [this]
	    32  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    35  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    40  iconst_1
	    41  iadd
	    42  invokespecial javax.swing.text.BadLocationException(java.lang.String, int) [344]
	    45  athrow
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    50  invokeinterface javax.swing.text.Document.getDefaultRootElement() : javax.swing.text.Element [354] [nargs: 1]
	    55  astore_3
	    56  aload_3
	    57  iload_1 [arg0]
	    58  invokeinterface javax.swing.text.Element.getElement(int) : javax.swing.text.Element [362] [nargs: 2]
	    63  astore 4
	    65  aload 4
	    67  invokeinterface javax.swing.text.Element.getEndOffset() : int [359] [nargs: 1]
	    72  istore 5
	    74  iload_1 [arg0]
	    75  iload_2
	    76  iconst_1
	    77  isub
	    78  if_icmpne 88
	    81  iload 5
	    83  iconst_1
	    84  isub
	    85  goto 90
	    88  iload 5
	    90  ireturn
	    Stack map table: number of frames 4
	        [pc: 20, append: {int}]
	        [pc: 46, same]
	        [pc: 88, append: {javax.swing.text.Element, javax.swing.text.Element, int}]
	        [pc: 90, same_locals_1_stack_item, stack: {int}]
	  
	  // Method descriptor #201 (Ljava/lang/String;I)V
	  // Stack: 4, Locals: 5
	  public void insert(java.lang.String arg0, int arg1);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_3
	     5  aload_3
	     6  ifnull 36
	     9  aload_3
	    10  iload_2 [arg1]
	    11  aload_1 [arg0]
	    12  aconst_null
	    13  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    18  goto 36
	    21  astore 4
	    23  new java.lang.IllegalArgumentException [177]
	    26  dup
	    27  aload 4
	    29  invokevirtual javax.swing.text.BadLocationException.getMessage() : java.lang.String [343]
	    32  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    35  athrow
	    36  return
	      Exception Table:
	        [pc: 9, pc: 18] -> 21 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 2
	        [pc: 21, full, stack: {javax.swing.text.BadLocationException}, locals: {javax.swing.JTextArea, java.lang.String, int, javax.swing.text.Document}]
	        [pc: 36, same]
	  
	  // Method descriptor #37 (Ljava/lang/String;)V
	  // Stack: 4, Locals: 4
	  public void append(java.lang.String arg0);
	     0  aload_0 [this]
	     1  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	     4  astore_2
	     5  aload_2
	     6  ifnull 27
	     9  aload_2
	    10  aload_2
	    11  invokeinterface javax.swing.text.Document.getLength() : int [352] [nargs: 1]
	    16  aload_1 [arg0]
	    17  aconst_null
	    18  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    23  goto 27
	    26  astore_3
	    27  return
	      Exception Table:
	        [pc: 9, pc: 23] -> 26 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 2
	        [pc: 26, full, stack: {javax.swing.text.BadLocationException}, locals: {javax.swing.JTextArea, java.lang.String, javax.swing.text.Document}]
	        [pc: 27, same]
	  
	  // Method descriptor #202 (Ljava/lang/String;II)V
	  // Stack: 5, Locals: 6
	  public void replaceRange(java.lang.String arg0, int arg1, int arg2);
	     0  iload_3 [arg2]
	     1  iload_2 [arg1]
	     2  if_icmpge 15
	     5  new java.lang.IllegalArgumentException [177]
	     8  dup
	     9  ldc <String "end before start"> [14]
	    11  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    14  athrow
	    15  aload_0 [this]
	    16  invokevirtual javax.swing.JTextArea.getDocument() : javax.swing.text.Document [335]
	    19  astore 4
	    21  aload 4
	    23  ifnull 90
	    26  aload 4
	    28  instanceof javax.swing.text.AbstractDocument [187]
	    31  ifeq 51
	    34  aload 4
	    36  checkcast javax.swing.text.AbstractDocument [187]
	    39  iload_2 [arg1]
	    40  iload_3 [arg2]
	    41  iload_2 [arg1]
	    42  isub
	    43  aload_1 [arg0]
	    44  aconst_null
	    45  invokevirtual javax.swing.text.AbstractDocument.replace(int, int, java.lang.String, javax.swing.text.AttributeSet) : void [342]
	    48  goto 72
	    51  aload 4
	    53  iload_2 [arg1]
	    54  iload_3 [arg2]
	    55  iload_2 [arg1]
	    56  isub
	    57  invokeinterface javax.swing.text.Document.remove(int, int) : void [353] [nargs: 3]
	    62  aload 4
	    64  iload_2 [arg1]
	    65  aload_1 [arg0]
	    66  aconst_null
	    67  invokeinterface javax.swing.text.Document.insertString(int, java.lang.String, javax.swing.text.AttributeSet) : void [357] [nargs: 4]
	    72  goto 90
	    75  astore 5
	    77  new java.lang.IllegalArgumentException [177]
	    80  dup
	    81  aload 5
	    83  invokevirtual javax.swing.text.BadLocationException.getMessage() : java.lang.String [343]
	    86  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    89  athrow
	    90  return
	      Exception Table:
	        [pc: 26, pc: 72] -> 75 when : javax.swing.text.BadLocationException
	      Stack map table: number of frames 5
	        [pc: 15, same]
	        [pc: 51, append: {javax.swing.text.Document}]
	        [pc: 72, same]
	        [pc: 75, same_locals_1_stack_item, stack: {javax.swing.text.BadLocationException}]
	        [pc: 90, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 1
	  public int getRows();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.rows : int [300]
	    4  ireturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 3, Locals: 3
	  public void setRows(int arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.rows : int [300]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 19
	     9  new java.lang.IllegalArgumentException [177]
	    12  dup
	    13  ldc <String "rows less than zero."> [19]
	    15  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    18  athrow
	    19  iload_1 [arg0]
	    20  iload_2
	    21  if_icmpeq 33
	    24  aload_0 [this]
	    25  iload_1 [arg0]
	    26  putfield javax.swing.JTextArea.rows : int [300]
	    29  aload_0 [this]
	    30  invokevirtual javax.swing.JTextArea.invalidate() : void [326]
	    33  return
	    Stack map table: number of frames 2
	        [pc: 19, append: {int}]
	        [pc: 33, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 2, Locals: 2
	  protected int getRowHeight();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.rowHeight : int [299]
	     4  ifne 24
	     7  aload_0 [this]
	     8  aload_0 [this]
	     9  invokevirtual javax.swing.JTextArea.getFont() : java.awt.Font [328]
	    12  invokevirtual javax.swing.JTextArea.getFontMetrics(java.awt.Font) : java.awt.FontMetrics [337]
	    15  astore_1
	    16  aload_0 [this]
	    17  aload_1
	    18  invokevirtual java.awt.FontMetrics.getHeight() : int [306]
	    21  putfield javax.swing.JTextArea.rowHeight : int [299]
	    24  aload_0 [this]
	    25  getfield javax.swing.JTextArea.rowHeight : int [299]
	    28  ireturn
	    Stack map table: number of frames 1
	        [pc: 24, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 1, Locals: 1
	  public int getColumns();
	    0  aload_0 [this]
	    1  getfield javax.swing.JTextArea.columns : int [298]
	    4  ireturn

	  
	  // Method descriptor #30 (I)V
	  // Stack: 3, Locals: 3
	  public void setColumns(int arg0);
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.columns : int [298]
	     4  istore_2
	     5  iload_1 [arg0]
	     6  ifge 19
	     9  new java.lang.IllegalArgumentException [177]
	    12  dup
	    13  ldc <String "columns less than zero."> [12]
	    15  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    18  athrow
	    19  iload_1 [arg0]
	    20  iload_2
	    21  if_icmpeq 33
	    24  aload_0 [this]
	    25  iload_1 [arg0]
	    26  putfield javax.swing.JTextArea.columns : int [298]
	    29  aload_0 [this]
	    30  invokevirtual javax.swing.JTextArea.invalidate() : void [326]
	    33  return
	    Stack map table: number of frames 2
	        [pc: 19, append: {int}]
	        [pc: 33, same]
	  
	  // Method descriptor #24 ()I
	  // Stack: 3, Locals: 2
	  protected int getColumnWidth();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.columnWidth : int [297]
	     4  ifne 26
	     7  aload_0 [this]
	     8  aload_0 [this]
	     9  invokevirtual javax.swing.JTextArea.getFont() : java.awt.Font [328]
	    12  invokevirtual javax.swing.JTextArea.getFontMetrics(java.awt.Font) : java.awt.FontMetrics [337]
	    15  astore_1
	    16  aload_0 [this]
	    17  aload_1
	    18  bipush 109
	    20  invokevirtual java.awt.FontMetrics.charWidth(char) : int [307]
	    23  putfield javax.swing.JTextArea.columnWidth : int [297]
	    26  aload_0 [this]
	    27  getfield javax.swing.JTextArea.columnWidth : int [297]
	    30  ireturn
	    Stack map table: number of frames 1
	        [pc: 26, same]
	  
	  // Method descriptor #195 ()Ljava/awt/Dimension;
	  // Stack: 4, Locals: 3
	  public java.awt.Dimension getPreferredSize();
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent.getPreferredSize() : java.awt.Dimension [348]
	      4  astore_1
	      5  aload_1
	      6  ifnonnull 25
	      9  new java.awt.Dimension [172]
	     12  dup
	     13  sipush 400
	     16  sipush 400
	     19  invokespecial java.awt.Dimension(int, int) [305]
	     22  goto 26
	     25  aload_1
	     26  astore_1
	     27  aload_0 [this]
	     28  invokevirtual javax.swing.JTextArea.getInsets() : java.awt.Insets [329]
	     31  astore_2
	     32  aload_0 [this]
	     33  getfield javax.swing.JTextArea.columns : int [298]
	     36  ifeq 69
	     39  aload_1
	     40  aload_1
	     41  getfield java.awt.Dimension.width : int [292]
	     44  aload_0 [this]
	     45  getfield javax.swing.JTextArea.columns : int [298]
	     48  aload_0 [this]
	     49  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	     52  imul
	     53  aload_2
	     54  getfield java.awt.Insets.left : int [294]
	     57  iadd
	     58  aload_2
	     59  getfield java.awt.Insets.right : int [295]
	     62  iadd
	     63  invokestatic java.lang.Math.max(int, int) : int [312]
	     66  putfield java.awt.Dimension.width : int [292]
	     69  aload_0 [this]
	     70  getfield javax.swing.JTextArea.rows : int [300]
	     73  ifeq 106
	     76  aload_1
	     77  aload_1
	     78  getfield java.awt.Dimension.height : int [291]
	     81  aload_0 [this]
	     82  getfield javax.swing.JTextArea.rows : int [300]
	     85  aload_0 [this]
	     86  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	     89  imul
	     90  aload_2
	     91  getfield java.awt.Insets.top : int [296]
	     94  iadd
	     95  aload_2
	     96  getfield java.awt.Insets.bottom : int [293]
	     99  iadd
	    100  invokestatic java.lang.Math.max(int, int) : int [312]
	    103  putfield java.awt.Dimension.height : int [291]
	    106  aload_1
	    107  areturn
	    Stack map table: number of frames 4
	        [pc: 25, append: {java.awt.Dimension}]
	        [pc: 26, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 69, append: {java.awt.Insets}]
	        [pc: 106, same]
	  
	  // Method descriptor #197 (Ljava/awt/Font;)V
	  // Stack: 2, Locals: 2
	  public void setFont(java.awt.Font arg0);
	     0  aload_0 [this]
	     1  aload_1 [arg0]
	     2  invokespecial javax.swing.text.JTextComponent.setFont(java.awt.Font) : void [349]
	     5  aload_0 [this]
	     6  iconst_0
	     7  putfield javax.swing.JTextArea.rowHeight : int [299]
	    10  aload_0 [this]
	    11  iconst_0
	    12  putfield javax.swing.JTextArea.columnWidth : int [297]
	    15  return

	  
	  // Method descriptor #25 ()Ljava/lang/String;
	  // Stack: 2, Locals: 3
	  protected java.lang.String paramString();
	      0  aload_0 [this]
	      1  getfield javax.swing.JTextArea.wrap : boolean [302]
	      4  ifeq 12
	      7  ldc <String "true"> [22]
	      9  goto 14
	     12  ldc <String "false"> [15]
	     14  astore_1
	     15  aload_0 [this]
	     16  getfield javax.swing.JTextArea.word : boolean [301]
	     19  ifeq 27
	     22  ldc <String "true"> [22]
	     24  goto 29
	     27  ldc <String "false"> [15]
	     29  astore_2
	     30  new java.lang.StringBuilder [181]
	     33  dup
	     34  invokespecial java.lang.StringBuilder() [314]
	     37  aload_0 [this]
	     38  invokespecial javax.swing.text.JTextComponent.paramString() : java.lang.String [350]
	     41  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     44  ldc <String ",colums="> [2]
	     46  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     49  aload_0 [this]
	     50  getfield javax.swing.JTextArea.columns : int [298]
	     53  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     56  ldc <String ",columWidth="> [1]
	     58  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     61  aload_0 [this]
	     62  getfield javax.swing.JTextArea.columnWidth : int [297]
	     65  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     68  ldc <String ",rows="> [4]
	     70  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     73  aload_0 [this]
	     74  getfield javax.swing.JTextArea.rows : int [300]
	     77  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     80  ldc <String ",rowHeight="> [3]
	     82  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     85  aload_0 [this]
	     86  getfield javax.swing.JTextArea.rowHeight : int [299]
	     89  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	     92  ldc <String ",word="> [5]
	     94  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	     97  aload_2
	     98  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    101  ldc <String ",wrap="> [6]
	    103  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    106  aload_1
	    107  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    110  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    113  areturn
	    Stack map table: number of frames 4
	        [pc: 12, same]
	        [pc: 14, same_locals_1_stack_item, stack: {java.lang.String}]
	        [pc: 27, append: {java.lang.String}]
	        [pc: 29, same_locals_1_stack_item, stack: {java.lang.String}]
	  
	  // Method descriptor #27 ()Z
	  // Stack: 1, Locals: 1
	  public boolean getScrollableTracksViewportWidth();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.wrap : boolean [302]
	     4  ifeq 11
	     7  iconst_1
	     8  goto 15
	    11  aload_0 [this]
	    12  invokespecial javax.swing.text.JTextComponent.getScrollableTracksViewportWidth() : boolean [346]
	    15  ireturn
	    Stack map table: number of frames 2
	        [pc: 11, same]
	        [pc: 15, same_locals_1_stack_item, stack: {int}]
	  
	  // Method descriptor #195 ()Ljava/awt/Dimension;
	  // Stack: 4, Locals: 3
	  public java.awt.Dimension getPreferredScrollableViewportSize();
	      0  aload_0 [this]
	      1  invokespecial javax.swing.text.JTextComponent.getPreferredScrollableViewportSize() : java.awt.Dimension [347]
	      4  astore_1
	      5  aload_1
	      6  ifnonnull 25
	      9  new java.awt.Dimension [172]
	     12  dup
	     13  sipush 400
	     16  sipush 400
	     19  invokespecial java.awt.Dimension(int, int) [305]
	     22  goto 26
	     25  aload_1
	     26  astore_1
	     27  aload_0 [this]
	     28  invokevirtual javax.swing.JTextArea.getInsets() : java.awt.Insets [329]
	     31  astore_2
	     32  aload_1
	     33  aload_0 [this]
	     34  getfield javax.swing.JTextArea.columns : int [298]
	     37  ifne 47
	     40  aload_1
	     41  getfield java.awt.Dimension.width : int [292]
	     44  goto 66
	     47  aload_0 [this]
	     48  getfield javax.swing.JTextArea.columns : int [298]
	     51  aload_0 [this]
	     52  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	     55  imul
	     56  aload_2
	     57  getfield java.awt.Insets.left : int [294]
	     60  iadd
	     61  aload_2
	     62  getfield java.awt.Insets.right : int [295]
	     65  iadd
	     66  putfield java.awt.Dimension.width : int [292]
	     69  aload_1
	     70  aload_0 [this]
	     71  getfield javax.swing.JTextArea.rows : int [300]
	     74  ifne 84
	     77  aload_1
	     78  getfield java.awt.Dimension.height : int [291]
	     81  goto 103
	     84  aload_0 [this]
	     85  getfield javax.swing.JTextArea.rows : int [300]
	     88  aload_0 [this]
	     89  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	     92  imul
	     93  aload_2
	     94  getfield java.awt.Insets.top : int [296]
	     97  iadd
	     98  aload_2
	     99  getfield java.awt.Insets.bottom : int [293]
	    102  iadd
	    103  putfield java.awt.Dimension.height : int [291]
	    106  aload_1
	    107  areturn
	    Stack map table: number of frames 6
	        [pc: 25, append: {java.awt.Dimension}]
	        [pc: 26, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 47, full, stack: {java.awt.Dimension}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	        [pc: 66, full, stack: {java.awt.Dimension, int}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	        [pc: 84, same_locals_1_stack_item, stack: {java.awt.Dimension}]
	        [pc: 103, full, stack: {java.awt.Dimension, int}, locals: {javax.swing.JTextArea, java.awt.Dimension, java.awt.Insets}]
	  
	  // Method descriptor #199 (Ljava/awt/Rectangle;II)I
	  // Stack: 4, Locals: 4
	  public int getScrollableUnitIncrement(java.awt.Rectangle arg0, int arg1, int arg2);
	     0  iload_2 [arg1]
	     1  lookupswitch default: 38
	          case 0: 33
	          case 1: 28
	    28  aload_0 [this]
	    29  invokevirtual javax.swing.JTextArea.getRowHeight() : int [324]
	    32  ireturn
	    33  aload_0 [this]
	    34  invokevirtual javax.swing.JTextArea.getColumnWidth() : int [322]
	    37  ireturn
	    38  new java.lang.IllegalArgumentException [177]
	    41  dup
	    42  new java.lang.StringBuilder [181]
	    45  dup
	    46  invokespecial java.lang.StringBuilder() [314]
	    49  ldc <String "Invalid orientation: "> [8]
	    51  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [317]
	    54  iload_2 [arg1]
	    55  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [316]
	    58  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [315]
	    61  invokespecial java.lang.IllegalArgumentException(java.lang.String) [309]
	    64  athrow
	    Stack map table: number of frames 3
	        [pc: 28, same]
	        [pc: 33, same]
	        [pc: 38, same]
	  
	  // Method descriptor #33 (Ljava/io/ObjectOutputStream;)V
	  // Stack: 3, Locals: 3
	  private void writeObject(java.io.ObjectOutputStream arg0) throws java.io.IOException;
	     0  aload_1 [arg0]
	     1  invokevirtual java.io.ObjectOutputStream.defaultWriteObject() : void [308]
	     4  aload_0 [this]
	     5  invokevirtual javax.swing.JTextArea.getUIClassID() : java.lang.String [330]
	     8  ldc <String "TextAreaUI"> [11]
	    10  invokevirtual java.lang.String.equals(java.lang.Object) : boolean [313]
	    13  ifeq 50
	    16  aload_0 [this]
	    17  invokestatic javax.swing.JComponent.getWriteObjCounter(javax.swing.JComponent) : byte [320]
	    20  istore_2
	    21  aload_0 [this]
	    22  iload_2
	    23  iconst_1
	    24  isub
	    25  i2b
	    26  istore_2
	    27  iload_2
	    28  invokestatic javax.swing.JComponent.setWriteObjCounter(javax.swing.JComponent, byte) : void [321]
	    31  iload_2
	    32  ifne 50
	    35  aload_0 [this]
	    36  getfield javax.swing.JTextArea.ui : javax.swing.plaf.ComponentUI [304]
	    39  ifnull 50
	    42  aload_0 [this]
	    43  getfield javax.swing.JTextArea.ui : javax.swing.plaf.ComponentUI [304]
	    46  aload_0 [this]
	    47  invokevirtual javax.swing.plaf.ComponentUI.installUI(javax.swing.JComponent) : void [341]
	    50  return
	    Stack map table: number of frames 1
	        [pc: 50, same]
	  
	  // Method descriptor #206 ()Ljavax/accessibility/AccessibleContext;
	  // Stack: 4, Locals: 1
	  public javax.accessibility.AccessibleContext getAccessibleContext();
	     0  aload_0 [this]
	     1  getfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	     4  ifnonnull 19
	     7  aload_0 [this]
	     8  new javax.swing.JTextArea$AccessibleJTextArea [184]
	    11  dup
	    12  aload_0 [this]
	    13  invokespecial javax.swing.JTextArea$AccessibleJTextArea(javax.swing.JTextArea) [339]
	    16  putfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	    19  aload_0 [this]
	    20  getfield javax.swing.JTextArea.accessibleContext : javax.accessibility.AccessibleContext [303]
	    23  areturn
	    Stack map table: number of frames 1
	        [pc: 19, same]

	  Inner classes:
	    [inner class info: #184 javax/swing/JTextArea$AccessibleJTextArea, outer class info: #183 javax/swing/JTextArea
	     inner name: #363 AccessibleJTextArea, accessflags: 4 protected]
	}
*/