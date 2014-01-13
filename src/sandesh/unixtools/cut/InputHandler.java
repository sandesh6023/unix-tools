package sandesh.unixtools.cut;


class InputHandler {
    public Integer[] returnFields(String args) {
        String[] text = args.split(",");
        Integer[] fields = new Integer[text.length];
        for (int i = 0; i < text.length; i++) {
            fields[i] = Integer.parseInt(text[i]);
        }
        return fields;
    }
}
