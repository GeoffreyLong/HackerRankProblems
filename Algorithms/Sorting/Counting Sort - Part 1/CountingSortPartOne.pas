program CountSortOne;
    var counter : Longint;
    var size : Longint;
    var arrTemp : Longint;
    var arr : array[0..999999] of Longint;
begin
    readln(size);
    size := size-1;
    for counter := 0 to size do begin
        read(arrTemp);
        arr[arrTemp] := arr[arrTemp] + 1;
    end;
    for counter := 0 to 99 do
        write(arr[counter], ' ');
end.
