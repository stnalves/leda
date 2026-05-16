for i in `seq 100`; do
    R=$(($RANDOM%100000+1))
    for j in `seq 30`; do
        seq -s " " $R;
    done
done
