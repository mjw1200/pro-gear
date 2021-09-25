public static string[] GetCSVFields(string input)
{
    MemoryStream stream = new MemoryStream();
    StreamWriter writer = new StreamWriter(stream);
    string[] fields;

    writer.Write(input);
    writer.Flush();
    stream.Position = 0;

    using (TextFieldParser tfp = new TextFieldParser(stream))
    {
        tfp.SetDelimiters(new string[] { "," });
        fields = tfp.ReadFields();
    }

    return fields;
}
