/*
 *  MIT License
 *
 * Copyright (c) 2018 mnemotron
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package api.finance.google.histquote.entity;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;
import java.util.Date;

/**
 * BEAN Finance Google Historical Quote
 * 
 * @author mnemotron
 * @version 1.1.0
 * @since 2018-01-26
 */
public class FGBeanHistoricalQuote {

	@CsvBindByName(locale = "en")
    @CsvDate("dd-MMM-yy")
	private Date date;
	
	@CsvBindByName(locale = "en")
	private double open;
	
	@CsvBindByName(locale = "en")
	private double high;
	
	@CsvBindByName(locale = "en")
	private double low;
	
	@CsvBindByName(locale = "en")
	private double close;
	
	@CsvBindByName
	private long volume;

	public Date getDate()
	{
		return date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	public double getOpen()
	{
		return open;
	}

	public void setOpen(double open)
	{
		this.open = open;
	}

	public double getHigh()
	{
		return high;
	}

	public void setHigh(double high)
	{
		this.high = high;
	}

	public double getLow()
	{
		return low;
	}

	public void setLow(double low)
	{
		this.low = low;
	}

	public double getClose()
	{
		return close;
	}

	public void setClose(double close)
	{
		this.close = close;
	}

	public long getVolume()
	{
		return volume;
	}

	public void setVolume(long volume)
	{
		this.volume = volume;
	}
}