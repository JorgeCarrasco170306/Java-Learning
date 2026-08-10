void main(){
    String fileName = IO.readln("Please enter the name of the file -> ");
    int pointIndex = fileName.lastIndexOf(".");
    String extension = fileName.substring(pointIndex + 1);
    System.out.println("extension = " + extension);
}
