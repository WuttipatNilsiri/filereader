## FileReader task by Wuttipat Nilsiri
task time : 
the result is 
| Type of testing | total time |
|:----------------|-----------:|
ReadFileToString 1 char at time|0.012636 sec|
ReadFileToStringBuilder 1 char at time|0.002327 sec|
ReadFileBuffered size line at time|0.000409 sec|
## Explain the Result
-Append String is Slowest because its create string every time it append
-Append StringBuilder is in the middle its no need allocate the new memory like string and able to edit in same address in memory
-Append using buffered it use readLine by time make it fastest 