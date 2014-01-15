Unix Tools
====================
This repository has the simulated implementation of different unix-tools `wc, cut, head,
tail, sort, uniq` and also one extra functionality that is `reduceSpaces`.

## wc :
##### Stands for word count, wc displays a count of lines, words, and characters in a file.
    * sm_wc.sh filename
    `Ex sm_wc.sh a.txt`

## head:
#### Head gives the first `n` lines from the given files.
    * sm_head.sh filename [-noOfLines]
    `Ex: sm_head.sh a.txt -5`

## tail:
#### Tail gives the first `n` lines from the given files.
    * sm_tail.sh filename [-noOfLines]
   `Ex: sm_tail.sh a.txt -5`

## uniq:
#### Filters out the adjacent  repeated lines in a file.
    * sm_uniq.sh Filename


## cut
*sm_cut filename fieldnumber delimiter

    `Ex = sm_cut.sh one.txt -f2 -d, `
It will print 1st field of file.    

## reduceSpace
*sm_reduceSpace filename

    `sm_reduceSpace.sh one.txt`
    
It will remove extra spaces from file and rewrite that file.


## sort
*sm_sort filename

    `Ex:sm_sort.sh one.txt`
    
It will print file data in sorted order.

*sm_sort filename -r

    `Ex: sm_sort.sh one.txt -r`
    
It will print file data in sorted reverse order. 

**NOTE:sort works for only "-r" and performs basicsort.  
        cut works for single field**
