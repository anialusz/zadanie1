# zadanie1

Project reads file that contains binary information about objects represented by 8 bits structures and transform it to output file. Structure contains 3 main fields:
- 4 first bits represents ID of the object
- 3 next bits are the message
- 1 last bit is checksum bit - if ID of the object is even last bit should be 0, if ID is odd last bit should be 1

Output file contains:
- in first line - number of all objects
- second line - number of objects that had mistakes
- third line - printed all correct objects

Object is faulty if:
- checksum is wrong
- object contains only 0's
