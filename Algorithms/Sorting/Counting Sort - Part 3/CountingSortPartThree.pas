program CountSortOne;
    var counter : Longint;
    var size : Longint;
    var temp : Longint;
    var tempString : string;
    var arr : array[0..999999] of Longint;
begin
    readln(size);
    size := size-1;
    for counter := 0 to size do begin
        read(temp);
        arr[temp] := arr[temp] + 1;
        read(tempString);
    end;
    size := 0;
    for counter := 0 to 99 do begin
        for temp := 0 to arr[counter]-1 do
            size := size + 1;
        write (size, ' ');
    end;
end.
