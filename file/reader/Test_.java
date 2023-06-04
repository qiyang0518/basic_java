package com.file.reader;
/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Test_
{
    public static void main(String[] args)
    {
        BufferReader_ bufferReader_ = new BufferReader_(new FileReader_());
        bufferReader_.readFiles(89);
        BufferReader_ bufferReader_1 = new BufferReader_(new StringReader_());
        bufferReader_1.readStrings(89);
    }
}
