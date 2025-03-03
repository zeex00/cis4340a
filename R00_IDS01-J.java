// String s may be user controllable
// \uFE64 is normalized to < and \uFE65 is normalized to > using the NFKC normalization form
String s = "\uFE64" + "script" + "\uFE65";
 
// Validate
Pattern pattern = Pattern.compile("[<>]"); // Check for angle brackets
Matcher matcher = pattern.matcher(s);
if (matcher.find()) {
  // Found black listed tag
  throw new IllegalStateException();
} else {
  // ...
}
 
// Normalize
s = Normalizer.normalize(s, Form.NFKC);

String s = "\uFE64" + "script" + "\uFE65";
 
// Normalize
s = Normalizer.normalize(s, Form.NFKC);
 
// Validate
Pattern pattern = Pattern.compile("[<>]");
Matcher matcher = pattern.matcher(s);
if (matcher.find()) {
  // Found blacklisted tag
  throw new IllegalStateException();
} else {
  // ...
}
