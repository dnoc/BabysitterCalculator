# BabysitterCalculator

This is an interview kata focusing on Test Driven Development. The program should calculate pay based on 3 different rates, and adhere to these rules:
```
- starts no earlier than 5:00PM
- leaves no later than 4:00AM
- gets paid $12/hour from start-time to bedtime
- gets paid $8/hour from bedtime to midnight
- gets paid $16/hour from midnight to end of job
- gets paid for full hours (no fractional hours)
```

Here is my initial layout of tests:
```
- Returns an int (gives output, no fractional hours)
- Returns a string, formatted '$x.00' (formatting, no fractional pay)
- Takes input int startTime, returns the above string
- Calculates using $12 start time rate
- Limit startTime >= 5
- Takes input int bedTime
- Calculates using $8 bed time rate
- Takes endTime
- Calculates using $16 after bed time rate
- Limit endTime =< 4
- Limit bedTime between start and end times (startTime =< bedTime >= endTime)
```
I'll see if it goes according to that.

It's complete now. I probably should have added the additional calculation tests at the beginning, rather than the end, but other than that, I think it looks good. Check the commits for the progression of changes.
I got a little bogged down on what changes to make, as far as "How much should I change between creating failing tests and creating passing code?" goes, but that's just me getting used to TDD.


