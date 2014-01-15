Unix Tools
====================
This repository has the simulated implementation of different unix-tools `wc, cut, head,
tail, sort, uniq` and also one extra functionality that is `reduceSpaces`.

## wc :
##### Stands for word count, wc displays a count of lines, words, and characters in a file.
    * sm_wc.sh filename

## cut :
#### Filters and gives the asked columns in given file.
    * sm_cut.sh filename FieldNumber [OPTIONS .... DELIMITER]

## head:
#### Head gives the first `n` lines from the given files.
    * sm_head.sh filename [-noOfLines]
    Ex: sm_head.sh a.txt -5

## tail:
#### Tail gives the first `n` lines from the given files.
    * sm_tail.sh filename [-noOfLines]
    Ex: sm_tail.sh a.txt -5

## sort:
#### Sorts the lines in a file.
    * sm_sort.sh Filename

## uniq:
#### Filters out the adjacent  repeated lines in a file.
    * sm_uniq.sh Filename

## reduceSpaces:
#### Reduces more than one occurrences of blank spaces into one. Takes a input file and writes into another file.
    * sm_reduceSpaces.sh InputFile outputFile